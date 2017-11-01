package forms;
import javax.swing.*;
import java.awt.Font;
import java.sql.*;
public class FeeReciept extends JFrame
{
 JTextArea jta1;
 JButton b1,b2;
 Font f;
 private Connection con;
 private PreparedStatement ps,ps1;
 private ResultSet rs,rs1;
 String tf,name,status;
 String bb,dl;
 String ef,course;
 String t,conno;
  public FeeReciept(String title,int ano)
  {
     super(title);
      try 
      {
          Database db=new Database();
          con=db.connect();
          ps=con.prepareStatement("select * from merit where ano=?");
          ps.setInt(1, ano);
          rs=ps.executeQuery();
          rs.next();
          name=rs.getString("cname");
          dl=rs.getString("dlevel");
          course=rs.getString("ca");
          conno=rs.getString("conno");
          if(dl.equals("B.Tech"))
          {
            tf="60000";
            bb="3000";
            ef="1000";
            t="64000";        
          }
          else
          if(dl.equals("M.Tech"))
          {
            tf="90000";
            bb="4000";
            ef="1000";
            t="95000";
          }
          ps1=con.prepareStatement("select * from fee where ano=?");
          ps1.setInt(1, ano);
          rs1=ps1.executeQuery();
          rs1.next();
          status=rs1.getString("status");
              
      } catch (Exception e) 
      {
          e.printStackTrace();
      }
     b1=new JButton("Save");
     b2=new JButton("Print");
     f=new Font("Arial",Font.BOLD,16);
      setLayout(null);
      String s1="\n" +"\t\t\t MRMIT"+"\n";
      String s2= "\t\t                       FEE RECIEPT"+"\n";
      String s3=" \t1.Name: "+name+"\t\t9.Fee Status:"+status+"\n";
      String s4=" \t2.Degree Level: "+dl+"\n";
      String s5=" \t3.Course: "+course+"\n";
      String s6=" \t4.Contact No.: "+conno+"\n";
      String s7="  \t5.Tuition Fee: "+tf+"\n";
      String s8="  \t6.Book Bank: "+bb+"\n";
      String s9="  \t7.Exam Fee: "+ef+"\n";
      String s10="  \t8.Total: "+t+"\n";
      jta1=new JTextArea();
     jta1.append(s1+"\n");
     jta1.append(s2+"\n");
     jta1.append(s3+"\n");
     jta1.append(s4+"\n");
     jta1.append(s5+"\n");
     jta1.append(s6+"\n");
     jta1.append(s7+"\n");
     jta1.append(s8+"\n");
     jta1.append(s9+"\n");
     jta1.append(s10+"\n");
     b1.setBounds(250,420,80,30);
     b2.setBounds(350,420,80,30);
     add(b1);add(b2);
     add(jta1);
     jta1.setBounds(10, 10, 700, 400);
     jta1.setEditable(false);
     jta1.setFont(f);
  }
  public static void main(String[] args)
    {
      FeeReciept obj=new FeeReciept("Fee Reciept",640001);  
        obj.setSize(740,500);
        obj.setLocation(250,200);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
  }

