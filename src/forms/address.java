package forms;
import java.awt.Color;
import javax.swing.*;
public class address extends JFrame
{
   JLabel l1,l2,l3,l4,l5,l6,l7,l8;
   public address(String title)
   {
    super(title);
    l1=new JLabel("Address:-");
    l2=new JLabel("A-Block,Jain Colony,");
    l7=new JLabel("Arihant Nagar,New Delhi-110087");
    l3=new JLabel("Contact nos:-");
    l4=new JLabel("01165652200");
    l5=new JLabel("01167672200");
    l6=new JLabel("01156789000");
    l8=new JLabel("email id:- mrmit@gmail.com");
    setLayout(null);
    l1.setBounds(5,10,200,30);
    l1.setForeground(Color.red);
    l2.setBounds(110,10,200,30);
    l3.setBounds(5,60,200,30);
    l3.setForeground(Color.red);
    l4.setBounds(110,60,200,30);
    l5.setBounds(110,80,200,30);
    l6.setBounds(110,100,200,30);
    l7.setBounds(110,30,200,30);
    l8.setBounds(10, 120, 200, 30);
    l8.setForeground(Color.red);
    add(l1);add(l2);
    add(l3);add(l4);
    add(l5);add(l6);
    add(l7);add(l8);
   }
    public static void main(String[] args)
    {
     address obj=new address("Contact Us");  
        obj.setSize(320,200);
        obj.setLocation(500,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
  }       
}
