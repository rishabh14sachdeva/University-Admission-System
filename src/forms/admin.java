package forms;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.awt.event.*;
import java.io.*;
public class admin extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JTextArea jta1;
    Font f;
    int dd,mm,yy;
    String date;
    private Connection con;
    private PreparedStatement ps,ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9;
    private ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6,rs7;
    public admin(String title)
    {
      super(title);
      Calendar cal1=new GregorianCalendar();
      dd=cal1.get(Calendar.DATE);
      mm=cal1.get(Calendar.MONTH)+1;
      yy=cal1.get(Calendar.YEAR);
      date=dd+"/"+mm+"/"+yy;
      f=new Font("Arial",Font.BOLD,15);
      l1=new JLabel("WELCOME ADMIN");
      l1.setFont(f);
      l1.setForeground(Color.blue);
      l2=new JLabel("NOTES:");
      l2.setForeground(Color.red);
      l3=new JLabel("Date:");
      l3.setFont(f);
      l3.setForeground(Color.blue);
      l4=new JLabel(date);
      l4.setFont(f);
      l4.setForeground(Color.blue);
      jta1=new JTextArea();
      b1=new JButton("Student Records");
      b2=new JButton("Set Btech Cutoff");
      b3=new JButton("Set Mtech Cutoff");
      b4=new JButton("Show Average");
      b5=new JButton("Generate Merit List");
      b6=new JButton("Logout");
      b7=new JButton("Change Password");
      b8=new JButton("Delete merit list");
      b9=new JButton("Save");
      b10=new JButton("Show Merit List");
      b1.setBackground(Color.yellow);
      b2.setBackground(Color.yellow);
      b3.setBackground(Color.yellow);
      b4.setBackground(Color.yellow);
      b5.setBackground(Color.yellow);
      b6.setBackground(Color.yellow);
      b7.setBackground(Color.yellow);
      b8.setBackground(Color.yellow);
      b9.setBackground(Color.yellow);
      b10.setBackground(Color.yellow);
      setLayout(null);
      l1.setBounds(300,30,500,30);
      add(l1);
      l2.setBounds(50,100,50,30);
      b1.setBounds(500,120,150,30);
      add(l2);add(b1);
      jta1.setBounds(50,140,270,300);
      b9.setBounds(130,460,100,30);
      b2.setBounds(500,190,150,30);
      b3.setBounds(500,260,150,30);
      b4.setBounds(500,330,150,30);
      add(jta1);add(b2);add(b3);add(b4);add(b9);
      l3.setBounds(50,560,50,30);
      l4.setBounds(110,560,100,30);
      b10.setBounds(110, 520, 150, 30);
      b5.setBounds(500,400,150,30);
      b8.setBounds(500,470,150,30);
      b7.setBounds(500,540,150,30);
      b6.setBounds(500,610,150,30);
      add(l3);add(b5);add(b7);add(l4);
      add(b6);add(b8);add(b10);
      jta1.setBackground(Color.DARK_GRAY);
      jta1.setForeground(Color.white);
      jta1.setCaretColor(Color.white);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      b10.addActionListener(this);
      try
        {
         FileInputStream fstream=new FileInputStream("abc.txt");
         DataInputStream in=new DataInputStream(fstream);
         BufferedReader br=new BufferedReader(new InputStreamReader(in));
         String s2;
         while((s2=br.readLine())!=null)
         {
             jta1.setText(s2);
         }
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
         {
           admchange lst=new admchange("student records");
           lst.setSize(1366,768);
           lst.setLocation(0,0);
           lst.setVisible(true);
         }
        if(ae.getSource()==b2)
         {
           bcu lst=new bcu("set btech cutoff");
           lst.setSize(1000,650);
           lst.setLocation(50, 50);
           lst.setVisible(true);
         }
        if(ae.getSource()==b3)
         {
           mcu mt=new mcu("set mtech cutoff");
           mt.setSize(1000,650);
           mt.setLocation(50, 50);
           mt.setVisible(true);
         }
        if(ae.getSource()==b4)
        {
            ShowAvg sa=new ShowAvg("Show Average");
            sa.setSize(400, 180);
            sa.setLocation(500, 200);
            sa.setVisible(true); 
        }
        if(ae.getSource()==b5)
        {
          Calculation cs=new Calculation();
          cs.calculate();
          JOptionPane.showMessageDialog(null,"Merit List has been generated");
        }
        if(ae.getSource()==b6)
        {
             int result=JOptionPane.showConfirmDialog(null,"Are You Sure?","Confirmation Dialog",JOptionPane.YES_NO_OPTION);
            if(result==JOptionPane.YES_OPTION)
            {
             dispose();
            }
        }
        if(ae.getSource()==b7)
        {
            changepassw chp=new changepassw("Change Password");
            chp.setSize(280,200);
            chp.setLocation(400,150);
            chp.setVisible(true);
        }
        if(ae.getSource()==b8)
        {
            try
            {
              int result=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete merit list?","Confirmation Dialog",JOptionPane.YES_NO_OPTION);
              if(result==JOptionPane.YES_NO_OPTION)
              {
                  Database db=new Database();
                  Connection con=db.connect();
                  Statement st=con.createStatement();
                  ResultSet rs=st.executeQuery("delete from merit");
                  JOptionPane.showMessageDialog(null,"merit list deleted");
              }
            }catch(Exception e)
            {
             e.printStackTrace();
            }
        }
        if(ae.getSource()==b9)
        {
            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(in);
            try 
            {
             File file=new File("abc.txt");
             file.createNewFile();
             FileWriter fstream=new FileWriter(file);
             BufferedWriter out=new BufferedWriter(fstream);
             String s1=jta1.getText();
             out.write(s1);
             out.close();
            } catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        if(ae.getSource()==b10)
        {
           meritlist ml=new meritlist("LIST");
           ml.setSize(370,700);
           ml.setLocation(500, 10);
           ml.setVisible(true);   
        }
    }
    public static void main(String[] args)
    {
      admin ad=new admin("Admin Panel");  
        ad.setSize(700,700);
        ad.setLocation(300,10);
        ad.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ad.setVisible(true);
        ad.getContentPane().setBackground(Color.ORANGE);
    }
}
