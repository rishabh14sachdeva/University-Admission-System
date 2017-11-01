package forms;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.util.GregorianCalendar;
import java.util.Calendar;
public class studentpan extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextArea jta;
    String nam;
    String lid;
    private PreparedStatement ps1,ps2,ps3,ps4,ps5,ps6,ps7;
    private ResultSet rs1,rs2,rs3,rs4,rs5,rs6,rs7;
    int dd,mm,yy;
    String date;
    int apno;
    Font f;
    public studentpan(String title,String pno)
    {
        super(title);
        f=new Font("Arial",Font.BOLD,15);
        setLayout(null);
        Calendar cal=new GregorianCalendar();
        dd=cal.get(Calendar.DATE);
        mm=cal.get(Calendar.MONTH)+1 ;
        yy=cal.get(Calendar.YEAR);
        date=dd+"/"+mm+"/"+yy;
        jta=new JTextArea();
        b1=new JButton("Fill ADMISSION FORM");
        b2=new JButton("Change Password");
        b3=new JButton("Merit List");
        b4=new JButton("PAY FEE");
        b5=new JButton("Generate Fee Receipt");
        b6=new JButton("INSTRUCTIONS");
        b7=new JButton("Logout");
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b3.setBackground(Color.white);
        b1.setBackground(Color.yellow.brighter());
        b2.setBackground(Color.yellow.brighter());
        b6.setBackground(Color.yellow.brighter());
        b7.setBackground(Color.yellow.brighter());
        try 
        {
         Database db=new Database();
         Connection con=db.connect();
         ps1=con.prepareStatement("select username from log where mob=?");
         ps1.setString(1, pno);
         rs1=ps1.executeQuery();
         rs1.next();
         nam=rs1.getString("username");
         ps2=con.prepareStatement("select loginid from log where mob=?");
         ps2.setString(1, pno);
         rs2=ps2.executeQuery();
         rs2.next();
         lid=rs2.getString("loginid");
         ps5=con.prepareStatement("select * from cdet where cmob=?");
         ps5.setString(1, pno);
         rs5=ps5.executeQuery();
         if(rs5.next())
         {
             b1.setEnabled(false);
             b1.setBackground(Color.white);
             ps3=con.prepareStatement("select ano from cdet where cmob=?");
             ps3.setString(1, pno);
             rs3=ps3.executeQuery();
             rs3.next();
             apno=rs3.getInt("ano");
             ps4=con.prepareStatement("select * from mdet where ano=?");
             ps4.setInt(1,apno);
             rs4=ps4.executeQuery();
             rs4.next();
             jta.append("Applied For "+rs4.getString("dlevel")+"\n\n\n1."+rs4.getString("p1")+"\n\n2."+rs4.getString("p2")+"\n\n3."+rs4.getString("p3"));
          }
            
             Statement st=con.createStatement();
             rs7=st.executeQuery("select * from merit");
             if(rs7.next())
             {
                 b3.setEnabled(true);
                 b4.setEnabled(true);
                 b5.setEnabled(true);
                 b3.setBackground(Color.yellow);
                 b4.setBackground(Color.yellow);
                 b5.setBackground(Color.yellow);
             }
             ps6=con.prepareStatement("select * from fee where ano=?");
             ps6.setInt(1,apno);
             rs6=ps6.executeQuery();
             rs6.next();
             String status=rs6.getString("status");
             if(status.equals("paid"))
             {
                 b4.setEnabled(false);
                 b4.setBackground(Color.white);
             }
         } catch (Exception e) 
        {
        }
        l1=new JLabel("Welcome");
        l1.setFont(f);
        l2=new JLabel("Login Id :");
        l2.setFont(f);
        l3=new JLabel(nam);
        l3.setFont(f);
        l4=new JLabel(lid);
        l4.setFont(f);
        l5=new JLabel("YOUR PREFERENCES");
        l6=new JLabel("* These Preferences can't be altered once filled.");
        l7=new JLabel("Date:");
        l7.setFont(f);
        l8=new JLabel(date);
        l8.setFont(f);
        l1.setForeground(Color.BLUE);
        l2.setForeground(Color.BLUE);
        l3.setForeground(Color.BLUE);
        l4.setForeground(Color.BLUE);
        l5.setForeground(Color.red);
        l6.setForeground(Color.red);
        l7.setForeground(Color.BLUE);
        l8.setForeground(Color.BLUE);
        l1.setBounds(250,20,70,20);
        l3.setBounds(330,20,200,20);
        l2.setBounds(250,40,100,20);
        l4.setBounds(330,40,100,20);
        add(l1);add(l2);add(l3);add(l4);
        b1.setBounds(125,90,200,30);
        add(b1);
        l5.setBounds(165, 150, 200, 30);
        jta.setBounds(100, 190, 270, 200);
        l6.setBounds(95, 400, 300, 30);
        add(l5);add(jta);add(l6);
        l7.setBounds(30, 500, 50, 30);
        l8.setBounds(90, 500, 100, 30);
        add(l7);add(l8);
        b2.setBounds(500, 150, 150, 30);
        b3.setBounds(500, 200, 150, 30);
        b4.setBounds(500, 250, 150, 30);
        b5.setBounds(495, 300, 160, 30);
        b6.setBounds(500, 350, 150, 30);
        b7.setBounds(500, 400, 150, 30);
        add(b2);add(b3);add(b4);add(b5);
        add(b6);add(b7);
        jta.setBackground(Color.DARK_GRAY);
        jta.setForeground(Color.white);
        jta.setEditable(false);
        jta.setFont(f);
        b1.setBorderPainted(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
      if(ae.getSource()==b1) 
      {
          admform adm=new admform("Admission Form");
          adm.setSize(1300,730);
          adm.setLocation(30,0);
          adm.setVisible(true);
      }
      if(ae.getSource()==b2)
      {
          changepassw chp=new changepassw("Change Password");
          chp.setSize(280,200);
          chp.setLocation(400,150);
          chp.setVisible(true);
      }
      if(ae.getSource()==b3)
      {
          meritlist ml=new meritlist("LIST");
          ml.setSize(370,700);
          ml.setLocation(500, 10);
          ml.setVisible(true);
      }
      if(ae.getSource()==b4)
      {
          PayFee pf=new PayFee("PAY FEE", apno);
          pf.setSize(320,300);
          pf.setLocation(500,200);
          pf.setVisible(true);
          
      }
      if(ae.getSource()==b5)
      {
          FeeReciept fr=new FeeReciept("FEE RECIEPT", apno);
          fr.setSize(740,500);
          fr.setLocation(250,200);
          fr.setVisible(true);
      }
      if(ae.getSource()==b6)
      {
          Instructions ins=new Instructions("INSTRUCTIONS");
          ins.setSize(850,350);
          ins.setLocation(250,200);
          ins.setVisible(true);
      }
      if(ae.getSource()==b7)
        {
            int result=JOptionPane.showConfirmDialog(null,"Are You Sure?","Confirmation Dialog",JOptionPane.YES_NO_OPTION);
            if(result==JOptionPane.YES_OPTION)
            {
             dispose();
            }
        }
    }

    
    
        
    public static void main(String[] args) 
    {
     studentpan span=new studentpan("Student Panel","9654056343");
     span.setSize(700, 700);
     span.setLocation(300, 10);
     span.setDefaultCloseOperation(EXIT_ON_CLOSE);
     span.setVisible(true);
     span.getContentPane().setBackground(Color.orange);
    }
}
