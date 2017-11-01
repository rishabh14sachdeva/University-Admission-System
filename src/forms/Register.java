package forms;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Register extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JPasswordField p1;
    JButton b1,b2;
    private Connection con;
    private PreparedStatement ps,ps1;
    private ResultSet rs;
    public Register(String title)
    {
        super(title);
        l1=new JLabel("Enter the Details to create your LOGIN ID:");
        l2=new JLabel("Name");
        l3=new JLabel("Password");
        l4=new JLabel("Mobile");
        b1=new JButton("Submit");
        b2=new JButton("Cancel");
        t1=new JTextField();
        t2=new JTextField();
        p1=new JPasswordField();
        setLayout(null);
        l1.setBounds(10,10,300,30);
        l2.setBounds(10,50,100,30);
        t1.setBounds(120,50,150,30);
        add(l1);add(l2);add(t1);
        l3.setBounds(10,90,100,30);
        p1.setBounds(120, 90, 150, 30);
        l4.setBounds(10,130,100,30);
        t2.setBounds(120, 130, 150, 30);
        add(l3);add(p1);add(l4);add(t2);
        b1.setBounds(40, 170, 100, 30);
        b2.setBounds(150, 170, 100, 30);
        add(b1);add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
     if(ae.getSource()==b2)
     {
         dispose();
     }
     if(ae.getSource()==b1)
     {
         String s1=t1.getText(),s2=t2.getText();
         char[] c1=s1.toCharArray();
         char[] c2=s2.toCharArray();
         char[] c3=new char[7];
         for(int i=0;i<3;i++)
             {
              c3[i]=c1[i];   
             }
             for(int i=3,j=6;i<7;i++,j++)
             {
              c3[i]=c2[j];   
             }
          String unam=String.copyValueOf(c3);
         try 
         {
          Database db=new Database();
          con=db.connect();
          ps=con.prepareStatement("insert into log values(?,?,?,?)");
          ps.setString(1,s1);
          ps.setString(2,p1.getText());
          ps.setString(3,unam);
          ps.setString(4,t2.getText());
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"Registration Successful");
          JOptionPane.showMessageDialog(null,"Your Login Id is "+unam);
          JOptionPane.showMessageDialog(null,"Use your Login Id and password to login");
          dispose();
         } catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,"something went wrong"+e);
         }
     }
    }
    
    public static void main(String[] args)
    {
     Register reg=new Register("Registration");
     reg.setSize(300,250);
     reg.setLocation(420,240);
     reg.setDefaultCloseOperation(EXIT_ON_CLOSE);
     reg.setVisible(true);
    }
}
