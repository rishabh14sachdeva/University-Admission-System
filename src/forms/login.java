package forms;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class login extends JFrame implements ActionListener
{
  private Connection con;
  private PreparedStatement ps,ps1;
  private ResultSet rs,rs1;
 JButton b1,b2;
 JLabel l1,l2;
 JTextField t1;
 JPasswordField p1;
 public login(String title)
 {
     super(title);
     b1=new JButton("Login");
     b2=new JButton("Cancel");
     l1=new JLabel("Login Id");
     l2=new JLabel("Password");
     t1=new JTextField();
     p1=new JPasswordField();
     setLayout(null);
     l1.setBounds(5,10,100,30);
     l2.setBounds(5,45,100,30);
     t1.setBounds(110,10,150,30);
     p1.setBounds(110,45,150,30);
     add(l1);add(l2);
     add(t1);add(p1);
     b1.setBounds(40,100,80,30);
     b2.setBounds(150,100,80,30);
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
          try {
               Database db=new Database();
               con=db.connect();
               ps=con.prepareStatement("select * from log where loginid=? and passwd=? ");
               ps.setString(1,t1.getText());
               ps.setString(2,p1.getText());
               rs=ps.executeQuery();
               rs.next();
               if(rs.getString("loginid").equals("admin"))
               {
                   JOptionPane.showMessageDialog(null,"Welcome Admin");
                   dispose();
                   admin adm=new admin("Admin Panel");
                   adm.setSize(700,700);
                   adm.setLocation(300,10);
                   adm.setVisible(true);
                   adm.getContentPane().setBackground(Color.ORANGE);
               }
               else
               {
               ps1=con.prepareStatement("select mob from log where loginid=?");
               ps1.setString(1, t1.getText());
               rs1=ps1.executeQuery();
               rs1.next();
               String pno=rs1.getString("mob");
               JOptionPane.showMessageDialog(null,"Welcome "+rs.getString("username"));
               dispose();
               studentpan stp=new studentpan("Student Panel",pno);
               stp.setSize(700, 700);
               stp.setLocation(300, 10);
               stp.setVisible(true);
               stp.getContentPane().setBackground(Color.ORANGE);
               }
               }          
          catch(Exception e)
          {
            JOptionPane.showMessageDialog(null,"Sorry no such record"+e);
                 
          }
          }
    }
    
 
 public static void main(String[] args)
    {
      login log=new login("login");  
        log.setSize(300,200);
        log.setLocation(450,150);
        log.setDefaultCloseOperation(EXIT_ON_CLOSE);
        log.setVisible(true);
    }
}
    
      
      


