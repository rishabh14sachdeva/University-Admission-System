package forms;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*; 
public class changepassw extends JFrame implements ActionListener
{   
    private Connection con;
    private PreparedStatement ps,ps1;
    private ResultSet rs;   
    JLabel l1,l2,l3;
    JPasswordField p1,p2;
    JButton b1,b2;
    JTextField t1;
   
  public changepassw(String title)
  {
   super(title);
   l1=new JLabel("Old Password");   
   l2=new JLabel("New Password");
   l3=new JLabel("Login Id");
   t1=new JTextField();
   p1=new JPasswordField();
   p2=new JPasswordField();
   b1=new JButton("Submit");
   b2=new JButton("Cancel");
   setLayout(null);
   l1.setBounds(5,40,100,30);
   l2.setBounds(5,80,100,30);
   l3.setBounds(5,5,100,30);
   t1.setBounds(110,5,150,30);
   p1.setBounds(110,40,150,30);
   p2.setBounds(110,80,150,30);
   b1.setBounds(40,120,80,30);
   b2.setBounds(130,120,80,30);
   add(l1);add(l2);
   add(p1);add(p2);
   add(b1);add(b2);
   add(l3);add(t1);
   b1.addActionListener(this);
   b2.addActionListener(this);
  }
  boolean result;
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
               
               ps=con.prepareStatement("select * from log where loginid=? and passwd=?");
               ps.setString(1,t1.getText());
               ps.setString(2,p1.getText());
               ResultSet rs=ps.executeQuery();
               rs.next();
               String s=rs.getString("loginid");
               String s1=rs.getString("passwd");
               ps1=con.prepareStatement("update log set passwd=? where loginid=? and passwd=?");
               ps1.setString(1,p2.getText());
               ps1.setString(2, s);
               ps1.setString(3, s1);
               ps1.executeUpdate();
               JOptionPane.showMessageDialog(null,"password changed");
               t1.setText("");
               p1.setText("");
               p2.setText("");
               dispose();
          }
          catch(Exception e)
          {
           JOptionPane.showMessageDialog(null,"No Such Record Found "+e);
          }
      }
    }
   public static void main(String[] args)
    {
      changepassw obj=new changepassw("Change Password");  
        obj.setSize(280,200);
        obj.setLocation(250,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
    
}
