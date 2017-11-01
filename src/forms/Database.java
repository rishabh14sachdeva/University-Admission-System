package forms;
import javax.swing.*;
import java.sql.*;
public class Database 
{
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    public Connection connect()
    {
        try
        {
         Class.forName("oracle.jdbc.OracleDriver");
         con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","java");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
    
}
