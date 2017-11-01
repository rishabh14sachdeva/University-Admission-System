package forms;
import javax.swing.*;
import java.awt.event.*;
public class ShowAvg extends JFrame implements ActionListener
{
 JButton b1,b2;
 public ShowAvg(String title)
 {
     super(title);
     setLayout(null);
     b1=new JButton("B.Tech");
     b2=new JButton("M.Tech");
     b1.setBounds(80, 50, 100, 30);
     b2.setBounds(200, 50, 100, 30);
     add(b1);add(b2);
     b1.addActionListener(this);
     b2.addActionListener(this);
 }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
     if(ae.getSource()==b1)
     {
         BTechAvg ba=new BTechAvg("B.Tech Average");
         ba.setSize(550,360);
         ba.setLocation(400,200);
         ba.setVisible(true);
     }
     if(ae.getSource()==b2)
     {
         MTechAvg ma=new MTechAvg("M.Tech Average");
         ma.setSize(550,360);
         ma.setLocation(400,200);
         ma.setVisible(true);
     }
    }
    
    public static void main(String[] args) 
    {
     ShowAvg sa=new ShowAvg("Show Average");
     sa.setSize(400, 180);
     sa.setLocation(500, 200);
     sa.setDefaultCloseOperation(EXIT_ON_CLOSE);
     sa.setVisible(true);
    }
}
