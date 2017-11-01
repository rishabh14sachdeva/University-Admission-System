
package forms;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
public class steps extends JFrame 
{
    Font f;
    JTextArea jta=new JTextArea();
    public steps(String title)
    {
        super(title);
        f=new Font("Arial",Font.BOLD+Font.ITALIC,18);
        add(jta);
        jta.append("STEP 1. Register yourself and create your login id.\n\n"+"STEP 2. Login into your account by using yourlogin id and password.\n\n");
        jta.append("STEP 3. Fill and submit admission form.\n\n" +"STEP 4. Wait for the merit list to be generated.\n\n"+"STEP 5. After the allotment of your seat , pay your fee and generate fee reciept.\n\n" +"Step 6. Welcome to MRMIT.");
        jta.setEditable(false);
        jta.setFont(f);
        jta.setForeground(Color.blue);
        jta.setBackground(Color.yellow);
            }
    public static void main(String[] args) 
    {
      steps s=new steps("STEPS TO FOLLOW");
      s.setSize(700,300);
      s.setLocation(400,200);
      s.setDefaultCloseOperation(EXIT_ON_CLOSE);
      s.setVisible(true);
    }
}
