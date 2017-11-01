package forms;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*; 
import java.sql.*;

public class MainWindow extends JFrame implements ActionListener,MouseListener
{
   JMenuBar mb;
   JMenu nMain,nPlac,nFeeStruct,nSeat,nFaculty,nCon;
   JMenuItem fExit,fB,fM,fplp,fplc;
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
  Font f,f1;
  JButton b1,b2,b3;
  public MainWindow()
  {
     
    l1=new JLabel("M R M I T");
    l2=new JLabel("MRMIT was founded by great Educationists and inspiring minds of the country in the year 1995 with a"); 
    l3=new JLabel("vision to take higher education to a new level. MRMIT is the premier institute of the country and is");
    l4=new JLabel("known for its high standards in teaching and research and attracts eminent scholars to its faculty.");
    l5=new JLabel("The institute aims to stimulate both the hearts and minds of scholars, empower them to contribute to the");
    l6=new JLabel("welfare of the society at large, train them to adopt themselves to the changing needs of the economy,");
    l7=new JLabel("advocate them for cultural leadership to ensure peace, harmony and prosperity for all. MRMIT has always");
    l8=new JLabel("nurtured its students and lead them to stairs of success. Our students have also made us proud by");
    l9=new JLabel("achieving great success in their life and by becoming professionals in their fields.");
    l10=new JLabel(new ImageIcon("logo.png"));
    l11=new JLabel(new ImageIcon("1.jpg"));
    l12=new JLabel("NOTIFICATIONS");
    l13=new JLabel("Merit List Declared");
    l13.setVisible(false);
    l14=new JLabel(new ImageIcon("gyro.jpg"));
    l15=new JLabel(new ImageIcon("ckt.jpg"));
    l16=new JLabel(new ImageIcon("15.jpg"));
    l17=new JLabel("GALLERY");
    mb=new JMenuBar();
    nMain=new JMenu("            Main            ");
    nPlac=new JMenu("Placements            ");
    fplp=new JMenuItem("Previous Placements");
    fplc=new JMenuItem("Current Placements");
    nFeeStruct=new JMenu("Fee Structure            ");
    nSeat=new JMenu("Seat Matrix            ");
    nFaculty=new JMenu("Faculty            ");
    nCon=new JMenu("Contact Us            ");
    fExit=new JMenuItem("Exit");
    fB=new JMenuItem("BTech");
    fM=new JMenuItem("MTech");
    b1=new JButton("steps to follow");
    b2=new JButton("login");        
    b3=new JButton("register");
    nPlac.add(fplp);
    nPlac.add(fplc);
    nMain.add(fExit);
    nSeat.add(fB);
    nSeat.add(fM);
    mb.add(nMain);
    mb.add(nPlac);
    mb.add(nFeeStruct);
     mb.add(nSeat);
      mb.add(nFaculty);
       mb.add(nCon);
    f = new Font("Algerian", Font.BOLD,90);
    f1 = new Font("Arial", Font.BOLD,18);
    l1.setForeground(Color.orange);
    l1.setFont(f);
    l2.setFont(f1);
    l3.setFont(f1);
    l4.setFont(f1);
    l5.setFont(f1);
    l6.setFont(f1);
    l7.setFont(f1);
    l8.setFont(f1);
    l9.setFont(f1);
    l17.setFont(f1);
    l17.setForeground(Color.red);
    l2.setForeground(Color.CYAN);
    l3.setForeground(Color.CYAN);
    l4.setForeground(Color.CYAN);
    l5.setForeground(Color.CYAN);
    l6.setForeground(Color.CYAN);
    l7.setForeground(Color.CYAN);
    l8.setForeground(Color.CYAN);
    l9.setForeground(Color.CYAN);
    setLayout(null);
    l1.setBounds(450,5,500,70);
    l2.setBounds(215,450,1000,30);
    l3.setBounds(215,480,1000,30);
    l4.setBounds(215,510,1000,30);
    l5.setBounds(215,540,1000,30);
    l6.setBounds(215,570,1000,30);
    l7.setBounds(215,600,1000,30);
    l8.setBounds(215,630,1000,30);
    l9.setBounds(215,660,1000,30);
    l10.setBounds(1050,0,400,150);
    l11.setBounds(25,110,1250,350);
    l12.setBounds(1150,200,200,30);
    l13.setBounds(1140,250,200,30);
    add(l12);add(l13);
    l14.setBounds(10,100,185,180);
    l15.setBounds(10,500,185,180);
    l16.setBounds(10,300,185,180);
    add(l14);add(l15);add(l16);
    l17.setBounds(60, 70, 100, 30);
    add(l17);
    l12.setForeground(Color.red);
    l13.setForeground(Color.orange);
    l12.setFont(f1);
    l13.setFont(f1);
    b1.setBounds(1170,450,150,30);
    b3.setBounds(1170,500,150,30);
    b2.setBounds(1170,550,150,30);
    b1.setBackground(Color.green);
    b2.setBackground(Color.green);
    b3.setBackground(Color.green);
    add(b1);add(b2);add(b3);
    mb.setBounds(215,75,870,40);
    mb.setBackground(Color.red);
    mb.setForeground(Color.black);
    add(l1);add(l2);
    add(l3);add(l4);
    add(l5);add(l6);
    add(l7);add(l8);
    add(l9);add(l10);
    add(l11);add(mb);
      try 
      {
        Database db=new Database();
        Connection con=db.connect();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from merit");   //for notification
        if(rs.next())
        {
            l13.setVisible(true);
        }
      } catch (Exception e) 
      {
          e.printStackTrace();
      }
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    nFeeStruct.addMouseListener(this);
    fplp.addMouseListener(this);
    fplc.addMouseListener(this);
    fExit.addMouseListener(this);
    fB.addMouseListener(this);
    fM.addMouseListener(this);
    nFaculty.addMouseListener(this);
    nCon.addMouseListener(this);
  }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==b1)
        {
            steps s=new steps("STEPS TO FOLLOW");
            s.setSize(700,300);
            s.setLocation(400,200);
            s.setVisible(true);
        }
        if(ae.getSource()==b3)
        {
            
            Register reg=new Register("Registration");
            reg.setSize(300,250);
            reg.setLocation(420,240);
            reg.setVisible(true);
        }
        if(ae.getSource()==b2)
        {
            login log=new login("login");  
            log.setSize(300,200);
            log.setLocation(450,150);
            log.setVisible(true);
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent me)
    {
        if(me.getSource()==nFeeStruct)
        {
            Fee obj=new Fee("Fee Structure");  
            obj.setSize(700,550);
            obj.setLocation(350,100);
            obj.setVisible(true);
        }
        if(me.getSource()==nFaculty)
        {
            faculty obj=new faculty("Faculty Information");  
            obj.setSize(450,450);
            obj.setLocation(500,150);
            obj.setVisible(true);
        }
        if(me.getSource()==nCon)
        {
            address obj=new address("Contact Us");  
            obj.setSize(320,200);
            obj.setLocation(500,150);
            obj.setVisible(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent me)
    {
      if(me.getSource()==fplp)
       {
         placem1 obj=new placem1("PREVIOUS YEAR PLACEMENT");  
         obj.setSize(500,500);
         obj.setLocation(350,150);
         obj.setVisible(true);  
       }
       if(me.getSource()==fplc)
       {
         placem obj=new placem("CURRENT YEAR PLACEMENT");  
         obj.setSize(500,500);
         obj.setLocation(350,150);
         obj.setVisible(true);  
       }
       if(me.getSource()==fExit)
       {
           System.exit(1);
       }
       if(me.getSource()==fB)
       {
           SeatMatrixB obj=new SeatMatrixB("Seat Matrix BTech");  
           obj.setSize(710,300);
           obj.setLocation(250,150);
           obj.setVisible(true);
       }
       if(me.getSource()==fM)
       {
           SeatMatrixM obj=new SeatMatrixM("Seat Matrix MTech");  
           obj.setSize(700,300);
           obj.setLocation(250,150);
           obj.setVisible(true);
       }
       
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
       
    }

    
  
  public static void main(String[] args)
    {
       MainWindow obj=new MainWindow();
        obj.getContentPane().setBackground(Color.black);
        obj.setSize(1370,730);
        obj.setLocation(0,0);
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
}
