package forms;
import java.awt.Color;
import javax.swing.*;
public class placem extends JFrame
{
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43;
   public placem(String title)
   {
       super(title);
    l1=new JLabel("Name of companies");    
    l2=new JLabel("Microsoft");
    l3=new JLabel("Snapdeal");
    l4=new JLabel("Filpkart");
    l5=new JLabel("Paytm");
    l6=new JLabel("Times Internet");   
    l7=new JLabel("TCS");    
    l8=new JLabel("Aricent");
    l9=new JLabel("CSC");
    l10=new JLabel("Techmahindra");
    l11=new JLabel("Infosys");
    l12=new JLabel("Job Offers");
    l13=new JLabel("5");     
    l14=new JLabel("9");   
    l15=new JLabel("4");   
    l16=new JLabel("2");   
    l17=new JLabel("110");   
    l18=new JLabel("60");   
    l19=new JLabel("175");     
    l20=new JLabel("40");   
    l21=new JLabel("25");     
    l22=new JLabel("190");     
    l23=new JLabel("Package(LPA)");     
    l24=new JLabel("50");     
    l25=new JLabel("25.5");     
    l26=new JLabel("12.75");     
    l27=new JLabel("10");     
    l28=new JLabel("5+");     
    l29=new JLabel("3.75");     
    l30=new JLabel("3.5");  
    l31=new JLabel("3.5");
    l32=new JLabel("3");
    l33=new JLabel("3");
    l34=new JLabel("1.");
    l35=new JLabel("2.");
    l36=new JLabel("3.");
    l37=new JLabel("4.");
    l38=new JLabel("5.");
    l39=new JLabel("6.");
    l40=new JLabel("7.");
    l41=new JLabel("8.");
    l42=new JLabel("9.");
    l43=new JLabel("10.");

    setLayout(null);
    l1.setBounds(55,15,200,30);
    l1.setForeground(Color.blue);
    l2.setBounds(60,50,100,30);
    l3.setBounds(60,90,200,30);
    l4.setBounds(60,130,200,30);
    l5.setBounds(60,170,200,30);
    l6.setBounds(60,210,200,30);
    l7.setBounds(60,250,100,30);
    l8.setBounds(60,290,200,30);
    l9.setBounds(60,330,200,30);
    l10.setBounds(60, 370, 200,30);
    l11.setBounds(60,410, 200,30);
    l12.setBounds(200,15, 200,30);
    l12.setForeground(Color.blue);
    l13.setBounds(220,50,100,30);
    l14.setBounds(220,90,100,30);
    l15.setBounds(220,130,100,30);
    l16.setBounds(220,170,100,30);
    l17.setBounds(220,210,100,30);
    l18.setBounds(220,250,100,30);
    l19.setBounds(220,290,100,30);
    l20.setBounds(220,330,100,30);
    l21.setBounds(220,370,100,30);
    l22.setBounds(220,410,100,30);
    l23.setBounds(310,15,100,30);
    l23.setForeground(Color.blue);
    l24.setBounds(330,50, 100,30);
    l25.setBounds(330,90,100,30);
    l26.setBounds(330,130,100,30);
    l27.setBounds(330,170,100,30);
    l28.setBounds(330,210,100,30);
    l29.setBounds(330,250,100,30);
    l30.setBounds(330,290,100,30);
    l31.setBounds(330,330,100,30);
    l32.setBounds(330,370,100,30);
    l33.setBounds(330,410,100,30);
    l34.setBounds(10,50,10,30);
    l35.setBounds(10,90,10,30);
    l36.setBounds(10,130,10,30);
    l37.setBounds(10,170,10,30);
    l38.setBounds(10,210,10,30);
    l39.setBounds(10,250,10, 30);
    l40.setBounds(10,290,10, 30);
    l41.setBounds(10,330,10,30);
     l42.setBounds(10,370,10,30);
    l43.setBounds(10,410,20,30);
    add(l1);add(l2);
    add(l3);add(l4);
    add(l5);add(l6);
    add(l7);add(l8);
    add(l9);add(l10);
    add(l11); add(l12);
    add(l13);add(l14); 
    add(l15);add(l16);
    add(l17);add(l18);
    add(l19);add(l20);
    add(l21);add(l22);
    add(l23); add(l24);
    add(l25);add(l26);
    add(l27);add(l28);
    add(l29);add(l30);
    add(l31);add(l32);
    add(l33);add(l34);
    add(l35);add(l36);
    add(l37);add(l38);
    add(l39);add(l40);
    add(l41);add(l42);
    add(l43);
   }
   public static void main(String[] args)
    {
     placem obj=new placem("CURRENT YEAR PLACEMENT");  
        obj.setSize(500,500);
        obj.setLocation(350,150);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
  }       
}
