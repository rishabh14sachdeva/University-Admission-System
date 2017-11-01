package forms;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class SeatMatrix extends JFrame implements ActionListener
{
  JButton b1,b2;
  SeatMatrix(String title)
  {
      super(title);
      b1=new JButton("B.Tech");
      b2=new JButton("M.Tech");
      setLayout(null);
      b1.setBounds(30,50,80,30);
      b1.setForeground(Color.blue);
      b2.setBounds(140,50,80,30);
      b2.setForeground(Color.blue);
      add(b1);add(b2);
      b1.addActionListener(this);
      b2.addActionListener(this);
  }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getActionCommand()=="B.Tech")
     {
         SeatMatrixB smb=new SeatMatrixB("B.Tech SeatMatrix");
         smb.setSize(710,300);
         smb.setLocation(250,150);
         smb.setVisible(true);
     }
     if(ae.getActionCommand()=="M.Tech")
     {
        SeatMatrixM smm=new SeatMatrixM("M.Tech SeatMatrix");
        smm.setSize(700,300);
        smm.setLocation(250,150);
        smm.setVisible(true);
     }
    }
  
  public static void main(String[] args)
    {
      SeatMatrix obj=new SeatMatrix("Seat Matrix");  
        obj.setSize(270,170);
        obj.setLocation(250,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }

}
