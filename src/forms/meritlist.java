package forms;
import javax.swing.*;
import java.sql.*;

public class meritlist extends JFrame 
{
    JTextArea jta=new JTextArea();
    JScrollPane sp1=new JScrollPane(jta);
    public meritlist(String title)
    {
        super(title);
        setLayout(null);
        sp1.setBounds(3, 3, 350, 650);
        add(sp1);
        sp1.setVisible(true);
        try 
        {
          String s1="MRMIT";
          String s2="MERIT LIST";
          Database db=new Database();
          Connection con=db.connect();
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select * from merit order by ano");
          jta.append("\t                        "+s1+"\n\t                    "+s2+"\n\n\n");
          while(rs.next())
          {
           jta.append("Application No:"+rs.getString("ano")+"\nName:"+rs.getString("cname")+"\nG.P.A.:"+rs.getFloat("gpa")+"\nCourse Alloted:"+rs.getString("ca")+"\n\n");
          }
          jta.setEditable(false);
         } catch (Exception e) 
        {
          e.printStackTrace();
        }
    }
    public static void main(String[] args) 
    {
      meritlist ml=new meritlist("LIST");
      ml.setSize(370,700);
      ml.setLocation(500, 10);
      ml.setDefaultCloseOperation(EXIT_ON_CLOSE);
      ml.setVisible(true);
    }
}

