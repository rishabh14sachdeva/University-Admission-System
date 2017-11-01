package forms;
import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
public class bcu extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    JButton b1;
    Font f;
    public bcu (String title)
    {
      super(title);
      f=new Font("Arial", Font.BOLD, 16);
      l1=new JLabel("C.S.E");
      l2=new JLabel("I.T");
      l3=new JLabel("E.C.E");
      l4=new JLabel("E.E.E");
      l5=new JLabel("M.A.E");
      l6=new JLabel("C.S.E");
      l7=new JLabel("I.T");
      l8=new JLabel("E.C.E");
      l9=new JLabel("E.E.E");
      l10=new JLabel("M.A.E");
      l11=new JLabel("C.S.E");
      l12=new JLabel("I.T");
      l13=new JLabel("E.C.E");
      l14=new JLabel("E.E.E");
      l15=new JLabel("M.A.E");
      l16=new JLabel("GENERAL");
      l16.setForeground(Color.blue);
      l16.setFont(f);
      l17=new JLabel("OBC");
      l17.setForeground(Color.blue);
      l17.setFont(f);
      l18=new JLabel("SC/ST");
      l18.setForeground(Color.blue);
      l18.setFont(f);
      t1=new JTextField();
      t2=new JTextField();
      t3=new JTextField();
      t4=new JTextField();
      t5=new JTextField();
      t6=new JTextField();
      t7=new JTextField();
      t8=new JTextField();
      t9=new JTextField();
      t10=new JTextField();
      t11=new JTextField();
      t12=new JTextField();
      t13=new JTextField();
      t14=new JTextField();
      t15=new JTextField();
      b1=new JButton("Set Cutoff");
      setLayout(null);
      l16.setBounds(160,5,500,100);
      l17.setBounds(460,5,500,100);
      l18.setBounds(760,5,500,100);
      add(l16);add(l17);add(l18);
      l1.setBounds(50,40,500,100);
      t1.setBounds(150,80,100,25);
      l6.setBounds(350,40,500,100);
      t6.setBounds(450,80,100,25);
      l11.setBounds(650,40,500,100);
      t11.setBounds(750,80,100,25);
      add(l1);add(t1);add(l6);add(t6);add(l11);add(t11);
      l2.setBounds(50,140,500,100);
      t2.setBounds(150,180,100,25);
      l7.setBounds(350,140,500,100);
      t7.setBounds(450,180,100,25);
      l12.setBounds(650,140,500,100);
      t12.setBounds(750,180,100,25);
      add(l2);add(t2);add(l7);add(t7);add(l12);add(t12);
      l3.setBounds(50,240,500,100);
      t3.setBounds(150,280,100,25);
      l8.setBounds(350,240,500,100);
      t8.setBounds(450,280,100,25);
      l13.setBounds(650,240,500,100);
      t13.setBounds(750,280,100,25);
      add(l3);add(t3);add(l8);add(t8);add(l13);add(t13);
      l4.setBounds(50,340,500,100);
      t4.setBounds(150,380,100,25);
      l9.setBounds(350,340,500,100);
      t9.setBounds(450,380,100,25);
      l14.setBounds(650,340,500,100);
      t14.setBounds(750,380,100,25);
      add(l4);add(t4);add(l9);add(t9);add(l14);add(t14);
      l5.setBounds(50,440,500,100);
      t5.setBounds(150,480,100,25);
      l10.setBounds(350,440,500,100);
      t10.setBounds(450,480,100,25);
      l15.setBounds(650,440,500,100);
      t15.setBounds(750,480,100,25);
      add(l5);add(t5);add(l10);add(t10);add(l15);add(t15);
      b1.setBounds(450,570,100,30);
      add(b1);
      b1.addActionListener(this);
       }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==b1)
        {
         Calculation cs=new Calculation();
         cs.gcse=Float.parseFloat(t1.getText());
         cs.git=Float.parseFloat(t2.getText());
         cs.gece=Float.parseFloat(t3.getText());
         cs.geee=Float.parseFloat(t4.getText());
         cs.gma=Float.parseFloat(t5.getText());
         cs.ocse=Float.parseFloat(t6.getText());
         cs.oit=Float.parseFloat(t7.getText());
         cs.oece=Float.parseFloat(t8.getText());
         cs.oeee=Float.parseFloat(t9.getText());
         cs.oma=Float.parseFloat(t10.getText());
         cs.scse=Float.parseFloat(t11.getText());
         cs.sit=Float.parseFloat(t12.getText());
         cs.sece=Float.parseFloat(t13.getText());
         cs.seee=Float.parseFloat(t14.getText());
         cs.sma=Float.parseFloat(t15.getText());
         JOptionPane.showMessageDialog(null,"the cutoff has been set");
         dispose();
        }
    }
    
    public static void main(String[] args)
    {
      bcu b=new bcu("BTech Cutoff Update");  
        b.setSize(1000,650);
        b.setLocation(50,50);
        b.setDefaultCloseOperation(EXIT_ON_CLOSE);
        b.setVisible(true);
    }
}