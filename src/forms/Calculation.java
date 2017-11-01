package forms;
import java.sql.*;
public class Calculation 
{
    private Connection con;
    private PreparedStatement ps,ps1,ps2,ps3,ps4;
    private ResultSet rs,rs1,rs2,rs3;
    public static float gcse,git,gece,geee,gma,gmcse,gmit,gmece,gmeee,gmma;
    public static float ocse,oit,oece,oeee,oma,omcse,omit,omece,omeee,omma;
    public static float scse,sit,sece,seee,sma,smcse,smit,smece,smeee,smma;
    public void calculate()
    {
          try
            {
          
                Database db=new Database();
                con=db.connect();
                ps=con.prepareStatement("select * from mdet order by ano");
                rs=ps.executeQuery();
                ps1=con.prepareStatement("select * from sdet order by ano");
                rs1=ps1.executeQuery();
                ps2=con.prepareStatement("select * from cdet order by ano");
                rs2=ps2.executeQuery();
                ps4=con.prepareStatement("select * from codet order by ano");
                rs3=ps4.executeQuery();
                ps3=con.prepareStatement("insert into merit values(?,?,?,?,?,?,?,?,?,?)");
                while(rs.next() && rs1.next() && rs2.next() && rs3.next())
                {
                 String lev=rs.getString("dlevel");
                 int id=rs.getInt("ano");
                 String p1=rs.getString("p1");
                 String p2=rs.getString("p2");
                 String p3=rs.getString("p3");
                 float cgpa=0f;
                 if(lev.equals("B.Tech"))
                 {
                  cgpa=rs1.getFloat("gpa");
                 }
                 else
                 if(lev.equals("M.Tech"))
                 {
                  cgpa=rs3.getFloat("gpa");
                 } 
                
                 String name=rs2.getString("cname");
                 String cat=rs2.getString("ccat");
                 String ph=rs2.getString("cmob");
                 String ca="nil";
                 ps3.setInt(1,id);     
                 ps3.setString(2,name);
                 ps3.setString(3,cat);
                 ps3.setString(4,lev);
                 ps3.setFloat(5,cgpa);
                 ps3.setString(6,p1);
                 ps3.setString(7,p2);
                 ps3.setString(8,p3);
                 ps3.setString(9,ca);
                 ps3.setString(10,ph);
                 ps3.executeUpdate();
                }
                
            }catch (Exception e)
            {
                e.printStackTrace();
            } 
          try
            {
                Database db=new Database();
                con=db.connect();
                ps=con.prepareStatement("select * from merit");
                rs=ps.executeQuery();
                while(rs.next())
                {
                  int id=rs.getInt("ano");  
                  float gpa=rs.getFloat("gpa");
                  String p1=rs.getString("p1");
                  String cat=rs.getString("category");
                  String level=rs.getString("dlevel");
                  if(gpa>=gcse && cat.equals("General") && p1.equals("Computer Science and Engineering") && level.equals("B.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=git && cat.equals("General") && p1.equals("Information Technology") && level.equals("B.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gece && cat.equals("General") && p1.equals("Electronics and Communication") && level.equals("B.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=geee && cat.equals("General") && p1.equals("Electrical and Electronics") && level.equals("B.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gma && cat.equals("General") && p1.equals("Mechanical and Automation") && level.equals("B.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  
                  if(gpa>=ocse && cat.equals("O.B.C.") && p1.equals("Computer Science and Engineering") && level.equals("B.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=oit && cat.equals("O.B.C.") && p1.equals("Information Technology") && level.equals("B.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=oece && cat.equals("O.B.C.") && p1.equals("Electronics and Communication") && level.equals("B.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=oeee && cat.equals("O.B.C.") && p1.equals("Electrical and Electronics") && level.equals("B.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=oma && cat.equals("O.B.C.") && p1.equals("Mechanical and Automation") && level.equals("B.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  
                  if(gpa>=scse && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Computer Science and Engineering") && level.equals("B.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=sit && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Information Technology") && level.equals("B.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=sece && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Electronics and Communication") && level.equals("B.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=seee && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Electrical and Electronics") && level.equals("B.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=sma && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Mechanical and Automation") && level.equals("B.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  ////////////
                 if(gpa>=gmcse && cat.equals("General") && p1.equals("Computer Science and Engineering") && level.equals("M.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gmit && cat.equals("General") && p1.equals("Information Technology") && level.equals("M.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gmece && cat.equals("General") && p1.equals("Electronics and Communication") && level.equals("M.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gmeee && cat.equals("General") && p1.equals("Electrical and Electronics") && level.equals("M.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gmma && cat.equals("General") && p1.equals("Mechanical and Automation") && level.equals("M.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  
                  if(gpa>=omcse && cat.equals("O.B.C.") && p1.equals("Computer Science and Engineering") && level.equals("M.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=omit && cat.equals("O.B.C.") && p1.equals("Information Technology") && level.equals("M.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=omece && cat.equals("O.B.C.") && p1.equals("Electronics and Communication") && level.equals("M.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=omeee && cat.equals("O.B.C.") && p1.equals("Electrical and Electronics") && level.equals("M.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=omma && cat.equals("O.B.C.") && p1.equals("Mechanical and Automation") && level.equals("M.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  
                  if(gpa>=smcse && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Computer Science and Engineering") && level.equals("M.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=smit && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Information Technology") && level.equals("M.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=smece && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Electronics and Communication") && level.equals("M.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=smeee && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Electrical and Electronics") && level.equals("M.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=smma && (cat.equals("S.C.") || cat.equals("S.T.")) && p1.equals("Mechanical and Automation") && level.equals("M.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
               
                }
               }catch (Exception e)
               
            {
                e.printStackTrace();
            } 
          try
            {
                Database db=new Database();
                con=db.connect();
                ps=con.prepareStatement("select * from merit");
                rs=ps.executeQuery();
                while(rs.next())
                {
                  int id=rs.getInt("ano");  
                  float gpa=rs.getFloat("gpa");
                  String p2=rs.getString("p2");
                  String cat=rs.getString("category");
                  String c=rs.getString("ca");
                  String level=rs.getString("dlevel");
                  if(gpa>=gcse && cat.equals("General") && p2.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=git && cat.equals("General") && p2.equals("Information Technology") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gece && cat.equals("General") && p2.equals("Electronics and Communication") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=geee && cat.equals("General") && p2.equals("Electrical and Electronics") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=gma && cat.equals("General") && p2.equals("Mechanical and Automation") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  
                  if(gpa>=ocse && cat.equals("O.B.C.") && p2.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=oit && cat.equals("O.B.C.") && p2.equals("Information Technology") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=oece && cat.equals("O.B.C.") && p2.equals("Electronics and Communication") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=oeee && cat.equals("O.B.C.") && p2.equals("Electrical and Electronics") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=oma && cat.equals("O.B.C.") && p2.equals("Mechanical and Automation") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  
                  if(gpa>=scse && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=sit && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Information Technology") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=sece && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Electronics and Communication") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=seee && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Electrical and Electronics") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=sma && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Mechanical and Automation") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  ///////////
                  if(gpa>=gmcse && cat.equals("General") && p2.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gmit && cat.equals("General") && p2.equals("Information Technology") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gmece && cat.equals("General") && p2.equals("Electronics and Communication") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gmeee && cat.equals("General") && p2.equals("Electrical and Electronics") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=gmma && cat.equals("General") && p2.equals("Mechanical and Automation") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  
                  if(gpa>=omcse && cat.equals("O.B.C.") && p2.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=omit && cat.equals("O.B.C.") && p2.equals("Information Technology") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=omece && cat.equals("O.B.C.") && p2.equals("Electronics and Communication") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=omeee && cat.equals("O.B.C.") && p2.equals("Electrical and Electronics") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=omma && cat.equals("O.B.C.") && p2.equals("Mechanical and Automation") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  
                  if(gpa>=smcse && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=smit && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Information Technology") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=smece && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Electronics and Communication") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=smeee && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Electrical and Electronics") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=smma && (cat.equals("S.C.") || cat.equals("S.T.")) && p2.equals("Mechanical and Automation") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                }
               }catch (Exception e)
            {
                e.printStackTrace();
            }
           
          try
            {
                Database db=new Database();
                con=db.connect();
                ps=con.prepareStatement("select * from merit");
                rs=ps.executeQuery();
                while(rs.next())
                {
                  int id=rs.getInt("ano");
                  float gpa=rs.getFloat("gpa");
                  String p3=rs.getString("p3");
                  String cat=rs.getString("category");
                  String c=rs.getString("ca");
                  String level=rs.getString("dlevel");
                  if(gpa>=gcse && cat.equals("General") && p3.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                    ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=git && cat.equals("General") && p3.equals("Information Technology") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Information Technology";
                    ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=gece && cat.equals("General") && p3.equals("Electronics and Communication") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=geee && cat.equals("General") && p3.equals("Electrical and Electronics") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gma && cat.equals("General") && p3.equals("Mechanical and Automation") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  
                  if(gpa>=ocse && cat.equals("O.B.C.") && p3.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=oit && cat.equals("O.B.C.") && p3.equals("Information Technology") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=oece && cat.equals("O.B.C.") && p3.equals("Electronics and Communication") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=oeee && cat.equals("O.B.C.") && p3.equals("Electrical and Electronics") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=oma && cat.equals("O.B.C.") && p3.equals("Mechanical and Automation") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  
                  if(gpa>=scse && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=sit && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Information Technology") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=sece && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Electronics and Communication") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=seee && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Electrical and Electronics") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=sma && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Mechanical and Automation") && c.equals("nil") && level.equals("B.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  ////////////
                  if(gpa>=gmcse && cat.equals("General") && p3.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("M.Tech"))
                  {
                      String ca="Computer Science and Engineering";
                    ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=gmit && cat.equals("General") && p3.equals("Information Technology") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Information Technology";
                    ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=gmece && cat.equals("General") && p3.equals("Electronics and Communication") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gmeee && cat.equals("General") && p3.equals("Electrical and Electronics") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=gmma && cat.equals("General") && p3.equals("Mechanical and Automation") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  
                  if(gpa>=omcse && cat.equals("O.B.C.") && p3.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=omit && cat.equals("O.B.C.") && p3.equals("Information Technology") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=omece && cat.equals("O.B.C.") && p3.equals("Electronics and Communication") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=omeee && cat.equals("O.B.C.") && p3.equals("Electrical and Electronics") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=omma && cat.equals("O.B.C.") && p3.equals("Mechanical and Automation") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                 
                  if(gpa>=smcse && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Computer Science and Engineering") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Computer Science and Engineering";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=smit && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Information Technology") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Information Technology";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=smece && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Electronics and Communication") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electronics and Communication";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                     ps1.setString(1,ca);
                     ps1.setInt(2,id);
                     ps1.executeUpdate();
                  }
                  if(gpa>=smeee && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Electrical and Electronics") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Electrical and Electronics";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                  if(gpa>=smma && (cat.equals("S.C.") || cat.equals("S.T.")) && p3.equals("Mechanical and Automation") && c.equals("nil") && level.equals("M.Tech"))
                  {
                    String ca="Mechanical and Automation";
                     ps1=con.prepareStatement("update merit set ca=? where ano=?");
                    ps1.setString(1,ca);
                    ps1.setInt(2,id);
                    ps1.executeUpdate();
                  }
                }
               }catch (Exception e)
            {
                e.printStackTrace();
            }
              }
    public static void main(String[] args)
    {
     Calculation cal=new Calculation();
     cal.calculate();
     System.out.println("done");
    }
    }

