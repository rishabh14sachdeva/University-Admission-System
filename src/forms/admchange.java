package forms;
import javax.swing.*;
import java.sql.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.event.*;
public class admchange extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45;
    JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8; 
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23;
    JTextArea jta1,jta2,jta3;
    JRadioButton r1,r2;
    JButton b1,b2,b3,b4,b5;//b6,b7,b8,b9;
    ButtonGroup bg;
    private Connection con;
    private PreparedStatement ps,ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9;
    private ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6,rs7;
    private void clear()
    {
        t1.setText("");t10.setText("");t19.setText("");cb1.setSelectedIndex(0);
        t2.setText("");t11.setText("");t20.setText("");cb2.setSelectedIndex(0);
        t3.setText("");t12.setText("");t21.setText("");cb3.setSelectedIndex(0);
        t4.setText("");t13.setText("");t22.setText("");cb4.setSelectedIndex(0);
        t5.setText("");t14.setText("");cb5.setSelectedIndex(0);
        t6.setText("");t15.setText("");jta1.setText("");cb6.setSelectedIndex(0);
        t7.setText("");t16.setText("");jta2.setText("");cb7.setSelectedIndex(0);
        t8.setText("");t17.setText("");jta3.setText("");r1.setSelected(false);
        t9.setText("");t18.setText("");cb8.setSelectedIndex(0);r2.setSelected(false);
    }
    
    public admchange(String title)
    {
      super(title);
      l1=new JLabel("PROGRAMME SELECTION");
      l2=new JLabel("Degree Level");
      cb1=new JComboBox();
      cb1.addItem("");
      cb1.addItem("B.Tech");
      cb1.addItem("M.Tech");
      l3=new JLabel("Course Choice");
      l4=new JLabel("Preference 1");
      l5=new JLabel("Preference 2");
      l6=new JLabel("Preference 3");
      l7=new JLabel("CANDIDATE'S DETAILS");
      l8=new JLabel("Candidate's Name");
      l9=new JLabel("Category");
      l10=new JLabel("Gender");
      l11=new JLabel("Email");
      l12=new JLabel("D.O.B");
      l13=new JLabel("Mobile No.");
      l14=new JLabel("ADDRESS DETAILS");
      l15=new JLabel("City");
      l16=new JLabel("State");
      l17=new JLabel("Address");
      l18=new JLabel("Pincode");
      l19=new JLabel("ACADEMIC DETAILS");
      l20=new JLabel("12th Details");
      l21=new JLabel("School Name");
      l22=new JLabel("School City");
      l23=new JLabel("School Address");
      l24=new JLabel("Board");
      l25=new JLabel("Year of Passing");
      l26=new JLabel("Marks Obtained");
      l27=new JLabel("Physics");
      l28=new JLabel("Chemistry");
      l29=new JLabel("Maths");
      l30=new JLabel("Graduation Details");
      l31=new JLabel("College Name");
      l32=new JLabel("College City");
      l33=new JLabel("College Address");
      l34=new JLabel("University");
      l35=new JLabel("Year of Passing");
      l36=new JLabel("Percentage");
      l37=new JLabel("COMPETITIVE EXAMINATION SCORE");
      l38=new JLabel("JEE Main Sore");
      l39=new JLabel("GATE Score");
      l40=new JLabel("PARENT'S DETAILS");
      l41=new JLabel("Father's Name");
      l42=new JLabel("Mobile No.");
      l43=new JLabel("Mother's Name");
      l44=new JLabel("Mobile No.");
      l45=new JLabel("App no :");
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
      t16=new JTextField();
      t17=new JTextField();
      t18=new JTextField();
      t19=new JTextField();
      t20=new JTextField();
      t21=new JTextField();
      t22=new JTextField();
      t23=new JTextField();
      jta1=new JTextArea();
      jta2=new JTextArea();
      jta3=new JTextArea();
      r1=new JRadioButton("Male",false);
      r2=new JRadioButton("Female",false);
      bg=new ButtonGroup();
      bg.add(r1);
      bg.add(r2);
      cb2=new JComboBox();
      cb2.addItem("");
      cb2.addItem("Computer Science and Engineering");
      cb2.addItem("Information Technology");
      cb2.addItem("Electronics and Communication");
      cb2.addItem("Electrical and Electronics"); 
      cb2.addItem("Mechanical and Automation");
      cb3=new JComboBox();
      cb3.addItem("");
      cb3.addItem("Computer Science and Engineering");
      cb3.addItem("Information Technology");
      cb3.addItem("Electronics and Communication");
      cb3.addItem("Electrical and Electronics"); 
      cb3.addItem("Mechanical and Automation");
      cb4=new JComboBox();
      cb4.addItem("");
      cb4.addItem("Computer Science and Engineering");
      cb4.addItem("Information Technology");
      cb4.addItem("Electronics and Communication");
      cb4.addItem("Electrical and Electronics"); 
      cb4.addItem("Mechanical and Automation");
      cb5=new JComboBox();
      cb5.addItem("");
      cb5.addItem("General"); 
      cb5.addItem("S.C.");
      cb5.addItem("S.T.");
      cb5.addItem("O.B.C.");
      cb6=new JComboBox();
      cb6.addItem("");
      cb6.addItem("Andaman & Nicobar Islands");
      cb6.addItem("Andhra Pardesh");
      cb6.addItem("Arunachal Pradesh");
      cb6.addItem("Assam");
      cb6.addItem("Bihar");
      cb6.addItem("Chandigarh");
      cb6.addItem("Chhattisgarh");
      cb6.addItem("Dadar & Nagar Haveli");
      cb6.addItem("Daman & Diu");
      cb6.addItem("Delhi");
      cb6.addItem("Goa");
      cb6.addItem("Gujrat");
      cb6.addItem("Haryana");
      cb6.addItem("Himachal Pradesh");
      cb6.addItem("Jammu& Kashmir");
      cb6.addItem("Jharkhand");
      cb6.addItem("Karnataka");
      cb6.addItem("Kerala");
      cb6.addItem("Lakshwadeep");
      cb6.addItem("Madhya Pradesh");
      cb6.addItem("Maharashtra");
      cb6.addItem("Manipur");
      cb6.addItem("Meghalaya");
      cb6.addItem("Mizoram");
      cb6.addItem("Nagaland");
      cb6.addItem("Odisha");
      cb6.addItem("Puducherry");
      cb6.addItem("Punjab");
      cb6.addItem("Rajasthan");
      cb6.addItem("sikkim");
      cb6.addItem("Tamil Nadu");
      cb6.addItem("telangana");
      cb6.addItem("Tripura");
      cb6.addItem("Uttar Pradesh");
      cb6.addItem("Uttarakhand");
      cb6.addItem("West Bengal");
      cb7=new JComboBox();
      cb7.addItem("");
      cb7.addItem("2009");
      cb7.addItem("2010");
      cb7.addItem("2011");
      cb7.addItem("2012");
      cb7.addItem("2013");
      cb7.addItem("2014");
      cb7.addItem("2015");
      cb7.addItem("2016");
      cb8=new JComboBox();
      cb8.addItem("");
      cb8.addItem("2013");
      cb8.addItem("2014");
      cb8.addItem("2015");
      cb8.addItem("2016");
      b1=new JButton("search");
      b2=new JButton("Delete");
      b3=new JButton("Update");
      b4=new JButton("Exit");
      b5=new JButton("List");
      //b6=new JButton(">");
      //b7=new JButton(">|");
      //b8=new JButton("<");
      //b9=new JButton("|<");
      
      setLayout(null);
      l1.setBounds(5,5,200,30);
      add(l1);
      l2.setBounds(5,35,100,30);
      cb1.setBounds(105,35,80,30);
      add(l2);add(cb1);
      l3.setBounds(5,105,100,30);
      add(l3);
      l4.setBounds(105,75,100,30);
      cb2.setBounds(205,75,220,30);
      add(l4);add(cb2);
      l5.setBounds(105,105,100,30);
      cb3.setBounds(205,105,220,30);
      add(l5);add(cb3);
      l6.setBounds(105,135,100,30);
      cb4.setBounds(205,135,220,30);
      add(l6);add(cb4);
      l7.setBounds(5,165 ,200,30);
      add(l7);
      l8.setBounds(5,195,150,30);
      t1.setBounds(130,195,160,30);
      add(l8);add(t1);
      l9.setBounds(5, 235,100,30);
      cb5.setBounds(130,235,80,30);
      add(l9);add(cb5);
      l10.setBounds(5,275,100,30);
      r1.setBounds(130,275,80,30);
      r2.setBounds(215,275,80,30);
      add(l10);add(r1);add(r2);
      l11.setBounds(5,315,100,30);
      t2.setBounds(130,315,300,30);
      add(l11);add(t2);
      l12.setBounds(5,355,100,30);
      t3.setBounds(130,355,100,30);
      add(l12);add(t3);
      l13.setBounds(5,395,100,30);
      t4.setBounds(130, 395,100,30);
      add(l13);add(t4);
      l14.setBounds(5,435,200,30);
      add(l14);
      l15.setBounds(5,465,100,30);
      t5.setBounds(130,465,150,30);
      add(l15);add(t5);
      l16.setBounds(5,505,100,30);
      cb6.setBounds(130,505,210,30);
      add(l16);add(cb6);
      l17.setBounds(5,545,100, 30);
      jta1.setBounds(130,545,250,60);
      add(l17);add(jta1);
      l18.setBounds(500,5,100,30);
      t6.setBounds(605,5,90,30);
      add(l18);add(t6);
      l19.setBounds(500,40,200,30);
      add(l19);
      l20.setBounds(500,70,100,30);
      add(l20);
      l21.setBounds(500,110,100,30);
      t7.setBounds(605,110,150,30);
      add(l21);add(t7);
      l22.setBounds(500,160,100,30);
      t8.setBounds(605,160,100,30);
      add(l22);add(t8);
      l23.setBounds(500,200,100,30);
      jta2.setBounds(605,200,200,50);
      add(l23);add(jta2);
      l24.setBounds(500,260,100,30);
      t9.setBounds(605,260,100,30);
      add(l24);add(t9);
      l25.setBounds(500,300,100,30);
      cb7.setBounds(605,300,80,30);
      add(l25);add(cb7);
      l26.setBounds(500,340,100,30);
      add(l26);
      l27.setBounds(500,370,100,30);
      t10.setBounds(605,370,60,30);
      add(l27);add(t10);
      l28.setBounds(500,400,100,30);
      t11.setBounds(605,400,60,30);
      add(l28);add(t11);
      l29.setBounds(500,430,100,30);
      t12.setBounds(605,430,60,30);
      add(l29);add(t12);
      l30.setBounds(500,460,200,30);
      add(l30);
      l31.setBounds(500,490,100,30);
      t13.setBounds(605,490,150,30);
      add(l31);add(t13);
      l32.setBounds(500,540,100,30);
      t14.setBounds(605,540,100,30);
      add(l32);add(t14);
      l33.setBounds(850,5,100,30);
      jta3.setBounds(1005,5,200,50);
      add(l33);add(jta3);
      l34.setBounds(850,60,100,30);
      t15.setBounds(1005,60,100,30);
      add(l34);add(t15);
      l35.setBounds(850,100,100,30);
      cb8.setBounds(1005,100,80,30);
      add(l35);add(cb8);
      l36.setBounds(850,140,100,30);
      t16.setBounds(1005,140,60,30);
      add(l36);add(t16);
      l37.setBounds(850,170,250,30);
      add(l37);
      l38.setBounds(850,210,100,30);
      t17.setBounds(1005,210,100,30);
      add(l38);add(t17);
      l39.setBounds(850,250,100,30);
      t18.setBounds(1005,250,100,30);
      add(l39);add(t18);
      l40.setBounds(850,290,200,30);
      add(l40);
      l41.setBounds(850,340,100,30);
      t19.setBounds(1005,340,200,30);
      add(l41);add(t19);
      l42.setBounds(850,380,100,30);
      t20.setBounds(1005,380,100,30);
      add(l42);add(t20);
      l43.setBounds(850,420,100,30);
      t21.setBounds(1005,420,200,30);
      add(l43);add(t21);
      l44.setBounds(850,460,100,30);
      t22.setBounds(1005,460,100,30);
      add(l44);add(t22);
      b1.setBounds(230,620,80,30);
      b2.setBounds(330,620,80,30);
      b3.setBounds(430,620,80,30);
      b4.setBounds(530,620,80,30);
      b5.setBounds(630,620,80,30);
      add(b1);add(b2);add(b3);add(b4);add(b5);
      //b6.setBounds(230,660,80,30);
      //b7.setBounds(330,660,80,30);
      //b8.setBounds(430,660,80,30);
      //b9.setBounds(530,660,80,30);
      //add(b6);add(b7);add(b8);add(b9);
      l45.setBounds(800,620,100,30);
      t23.setBounds(850,620,180,30);
      add(l45);add(t23);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        //b6.addActionListener(this);
       //b7.addActionListener(this);
        //b8.addActionListener(this);
        //b9.addActionListener(this);
        }
    boolean result;
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b3)
        {
             try
          {
           int id=Integer.parseInt(t23.getText());
           String cg=" ";
            String dl=cb1.getSelectedItem().toString();
            String pr1=cb2.getSelectedItem().toString();
            String pr2=cb3.getSelectedItem().toString();
            String pr3=cb4.getSelectedItem().toString();
            String cn=t1.getText();
            String cd=t3.getText();
            if(r1.isSelected())
             cg="Male";
            if(r2.isSelected())    
             cg="Female";        
            String cc=cb5.getSelectedItem().toString();
            String cm=t4.getText();
            String ce=t2.getText();
            String ad=jta1.getText();
            String ci=t5.getText();
            String st=cb6.getSelectedItem().toString();
            String pi=t6.getText();
            String sn=t7.getText();
            String sb=t9.getText();
            String sc=t8.getText();
            String sa=jta2.getText();
            String sy=cb7.getSelectedItem().toString();
            int p=Integer.parseInt(t10.getText());
            int c=Integer.parseInt(t11.getText());
            int m=Integer.parseInt(t12.getText());
            float a=(float)((p+c+m)/3);
            int jee=0;
            if(cb1.getSelectedItem()=="B.Tech")
            {
                jee=Integer.parseInt(t17.getText());
            }
            String fn=t19.getText();
            String fm=t20.getText();
            String mn=t21.getText();
            String mm=t22.getText();
            Database db=new Database();
            con=db.connect();
            ps=con.prepareStatement("update mdet set dlevel=?,p1=?,p2=?,p3=? where ano=?");
         
         ps.setString(1,dl);
         ps.setString(2,pr1);
         ps.setString(3,pr2);
         ps.setString(4,pr3);
         ps.setInt(5,id);
         
         ps.executeUpdate();
         
            ps1=con.prepareStatement("update cdet set cname=?,cdob=?,cgender=?,ccat=?,cmob=?,cemail=? where ano=?");
           
            ps1.setString(1,cn);
            ps1.setString(2,cd);
            ps1.setString(3,cg);
            ps1.setString(4,cc);
            ps1.setString(5,cm);
            ps1.setString(6,ce);
            ps1.setInt(7,id);
           
            ps1.executeUpdate();
           
              ps2=con.prepareStatement("update cadd set caddress=?,ccity=?,cstate=?,cpin=? where ano=?");
              
              ps2.setString(1,ad);
              ps2.setString(2,ci);
              ps2.setString(3,st);
              ps2.setString(4,pi);
              ps2.setInt(5,id);
            
              ps2.executeUpdate();
            
                ps3=con.prepareStatement("update sdet set sname=?,sboard=?,scity=?,saddress=?,syop=?,phy=?,chem=?,maths=?,avg=?,jee=?,gpa=? where ano=?");
                
                ps3.setString(1,sn);
                ps3.setString(2,sb);
                ps3.setString(3,sc);
                ps3.setString(4,sa);
                ps3.setString(5,sy);
                ps3.setInt(6,p);
                ps3.setInt(7,c);
                ps3.setInt(8,m);
                ps3.setFloat(9,a);
                ps3.setInt(10,jee);
                ps3.setFloat(11,(float)(a*0.4+(jee*0.277778)*0.6));
                ps3.setInt(12,id);
                
                ps3.executeUpdate();
                
                  if(cb1.getSelectedItem()=="M.Tech")
                  {
                       String cna=t13.getText();
                       String cua=t15.getText();
                       String cca=t14.getText();
                       String caa=jta3.getText();
                       String cy=cb8.getSelectedItem().toString();
                       float per=Float.parseFloat(t16.getText());
                       int gate=Integer.parseInt(t18.getText());
                       float cgpa=(float)(per*0.4+gate*0.6);
                  ps4=con.prepareStatement("update codet set coname=?,couniv=?,cocity=?,coaddress=?,coyop=?,per=?,gate=?,gpa=? where ano=?");
                  ps4.setString(1,cna);
                  ps4.setString(2,cua);
                  ps4.setString(3,cca);
                  ps4.setString(4,caa);
                  ps4.setString(5,cy);
                  ps4.setFloat(6,per);
                  ps4.setInt(7,gate);
                  ps4.setFloat(8,cgpa);
                  ps4.setInt(9,id);
                  
                           ps4.executeUpdate();
                  }
                  
                    
                        ps6=con.prepareStatement("update pdet set fname=?,fmob=?,mname=?,mmob=? where ano=?");
                       
                        ps6.setString(1,fn);
                        ps6.setString(2,fm);
                        ps6.setString(3,mn);
                        ps6.setString(4,mm);
                         ps6.setInt(5,id);
                        
                        ps6.executeUpdate();
                         JOptionPane.showMessageDialog(null,"THANK YOU..YOUR RECORD HAS BEEN MODIFIED");
                         clear();
         
              }catch(Exception e)
              {
                e.printStackTrace();
              }
        }
         if(ae.getSource()==b5)
         {
           list lst=new list("LIST");
           lst.setSize(400,700);
           lst.setLocation(10, 10);
           lst.setVisible(true);
         }
        if(ae.getSource()==b1)
        {
            int id=Integer.parseInt(t23.getText());
            clear();
             try
            {
                Database db=new Database();
                con=db.connect();
                ps=con.prepareStatement("select * from mdet where ano=?");
                ps.setInt(1,id);
                rs=ps.executeQuery();
                if(rs.next())
                {
                    cb1.setSelectedItem(rs.getString("dlevel"));
                    cb2.setSelectedItem(rs.getString("p1"));
                    cb3.setSelectedItem(rs.getString("p2"));
                    cb4.setSelectedItem(rs.getString("p3"));
                    ps1=con.prepareStatement("select * from cdet where ano=?");
                    ps1.setInt(1, id);
                    ResultSet rs1=ps1.executeQuery();
                    rs1.next();
                    cb5.setSelectedItem(rs1.getString("ccat"));
                    t1.setText(rs1.getString("cname"));
                    t2.setText(rs1.getString("cemail"));
                    t3.setText(rs1.getString("cdob"));
                    t4.setText(rs1.getString("cmob"));
                    String gen=rs1.getString("cgender");
                    if(gen.equals("Male"))
                    r1.setSelected(true);
                    else
                    if(gen.equals("Female"))
                    r2.setSelected(true);
                    ps2=con.prepareStatement("select * from cadd where ano=?");
                    ps2.setInt(1, id);
                    ResultSet rs2=ps2.executeQuery();
                    rs2.next();
                    t5.setText(rs2.getString("ccity"));
                    t6.setText(rs2.getString("cpin"));
                    cb6.setSelectedItem(rs2.getString("cstate"));
                    jta1.setText(rs2.getString("caddress"));
                    ps3=con.prepareStatement("select * from sdet where ano=?");
                    ps3.setInt(1, id);
                    ResultSet rs3=ps3.executeQuery();
                    rs3.next();
                    t7.setText(rs3.getString("sname"));
                    t8.setText(rs3.getString("scity"));
                    cb7.setSelectedItem(rs3.getString("syop"));
                    jta2.setText(rs3.getString("saddress"));
                    t9.setText(rs3.getString("sboard"));
                    t10.setText(rs3.getString("phy"));
                    t11.setText(rs3.getString("chem"));
                    t12.setText(rs3.getString("maths"));
                    t17.setText(rs3.getString("jee"));
                    if(rs.getString("dlevel").equals("M.Tech"))
                    {
                    ps4=con.prepareStatement("select * from codet where ano=?");
                    ps4.setInt(1, id);
                    ResultSet rs4=ps4.executeQuery();
                    rs4.next();
                    t13.setText(rs4.getString("coname"));
                    t14.setText(rs4.getString("cocity"));
                    cb8.setSelectedItem(rs4.getString("coyop"));
                    jta3.setText(rs4.getString("coaddress"));
                    t15.setText(rs4.getString("couniv"));
                    t16.setText(rs4.getString("per"));
                    t18.setText(rs4.getString("gate"));
                    }
                    ps5=con.prepareStatement("select * from pdet where ano=?");
                    ps5.setInt(1,id);
                    ResultSet rs5=ps5.executeQuery();
                    rs5.next();
                    t19.setText(rs5.getString("fname"));
                    t20.setText(rs5.getString("fmob"));
                    t21.setText(rs5.getString("mname"));
                    t22.setText(rs5.getString("mmob"));
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Record Not Found!");
                }
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        if(ae.getActionCommand()=="Delete")
        {
            try
            {
                Database db=new Database();
                con=db.connect();
                int result=JOptionPane.showConfirmDialog(null,"Are You Sure?","Confirmation Dialog",JOptionPane.OK_CANCEL_OPTION);
                if(result==JOptionPane.OK_OPTION)
                {
                    ps=con.prepareStatement("delete from  pdet where ano=?");
                    ps.setString(1, t23.getText());
                    ps.executeUpdate();              
                    ps1=con.prepareStatement("delete from mdet where ano=?");
                    ps1.setString(1, t23.getText());
                    ps1.executeUpdate();
                    ps2=con.prepareStatement("delete from cdet where ano=?");
                    ps2.setString(1, t23.getText());               
                    ps2.executeUpdate();                
                    ps3=con.prepareStatement("delete from cadd where ano=?");
                    ps3.setString(1, t23.getText());
                    ps3.executeUpdate();
                    ps4=con.prepareStatement("delete from sdet where ano=?");
                    ps4.setString(1, t23.getText());
                    ps4.executeUpdate();
                    ps5=con.prepareStatement("delete from codet where ano=?");
                    ps5.setString(1, t23.getText());
                    ps5.executeUpdate();
                    ps6=con.prepareStatement("delete from appno where ano=?");
                    ps6.setString(1, t23.getText());
                    ps6.executeUpdate(); 
                  }
                   clear();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    if(ae.getSource()==b4)
    {
        
            dispose();
    }
    /*if(ae.getSource()==b9)
        {
            clear();
            try
            {
             Database db=new Database();
             con=db.connect();
             Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             
             rs=stmt.executeQuery("select * from appno order by ano");
             rs.first();
             int ano=rs.getInt("ano");
             t23.setText(rs.getString("ano"));
             rs=stmt.executeQuery("select * from mdet order by ano");
             rs.first();
             String dlevel=rs.getString("dlevel");
             cb1.setSelectedItem(rs.getString("dlevel"));
             cb2.setSelectedItem(rs.getString("p1"));
             cb3.setSelectedItem(rs.getString("p2"));
             cb4.setSelectedItem(rs.getString("p3"));
             rs=stmt.executeQuery("select * from cdet order by ano");
             rs.first();
             t1.setText(rs.getString("cname"));
             cb5.setSelectedItem(rs.getString("ccat"));
             t2.setText(rs.getString("cemail"));
             t3.setText(rs.getString("cdob"));
             t4.setText(rs.getString("cmob"));
             rs=stmt.executeQuery("select * from cadd order by ano");
             rs.first();
             t5.setText(rs.getString("ccity"));
             t6.setText(rs.getString("cpin"));
             cb6.setSelectedItem(rs.getString("cstate"));
             jta1.setText(rs.getString("caddress"));
             rs=stmt.executeQuery("select * from sdet order by ano");
             rs.first();
             t7.setText(rs.getString("sname"));
             t8.setText(rs.getString("scity"));
             cb7.setSelectedItem(rs.getString("syop"));
             jta2.setText(rs.getString("saddress"));
             t9.setText(rs.getString("sboard"));
             t10.setText(rs.getString("phy"));
             t11.setText(rs.getString("chem"));
             t12.setText(rs.getString("maths"));
             t17.setText(rs.getString("jee"));
             if(dlevel.equals("M.Tech"))
             {
             rs=stmt.executeQuery("select * from codet order by ano");
             rs.first();
             t13.setText(rs.getString("coname"));
             t14.setText(rs.getString("cocity"));
             cb8.setSelectedItem(rs.getString("coyop"));
             jta3.setText(rs.getString("coaddress"));
             t15.setText(rs.getString("couniv"));
             t16.setText(rs.getString("per"));
             t18.setText(rs.getString("gate"));
             }
             rs=stmt.executeQuery("select * from pdet order by ano");
             rs.first();
             t19.setText(rs.getString("fname"));
             t20.setText(rs.getString("fmob"));
             t21.setText(rs.getString("mname"));
             t22.setText(rs.getString("mmob"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }if(ae.getSource()==b7)
        {
            try
            {
             Database db=new Database();
             con=db.connect();
             Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             rs=stmt.executeQuery("select * from appno order by ano");
             rs.last();
             t23.setText(rs.getString("ano"));
             rs=stmt.executeQuery("select * from mdet order by ano");
             rs.last();
             cb1.setSelectedItem(rs.getString("dlevel"));
             String dl=rs.getString("dlevel");
             cb2.setSelectedItem(rs.getString("p1"));
             cb3.setSelectedItem(rs.getString("p2"));
             cb4.setSelectedItem(rs.getString("p3"));
             rs=stmt.executeQuery("select * from cdet order by ano");
             rs.last();
             t1.setText(rs.getString("cname"));
             cb5.setSelectedItem(rs.getString("ccat"));
             t2.setText(rs.getString("cemail"));
             t3.setText(rs.getString("cdob"));
             t4.setText(rs.getString("cmob"));
             rs=stmt.executeQuery("select * from cadd order by ano");
             rs.last();
             t5.setText(rs.getString("ccity"));
             t6.setText(rs.getString("cpin"));
             cb6.setSelectedItem(rs.getString("cstate"));
             jta1.setText(rs.getString("caddress"));
             rs=stmt.executeQuery("select * from sdet order by ano");
             rs.last();
             t7.setText(rs.getString("sname"));
             t8.setText(rs.getString("scity"));
             cb7.setSelectedItem(rs.getString("syop"));
             jta2.setText(rs.getString("saddress"));
             t9.setText(rs.getString("sboard"));
             t10.setText(rs.getString("phy"));
             t11.setText(rs.getString("chem"));
             t12.setText(rs.getString("maths"));
             t17.setText(rs.getString("jee"));
             if(dl.equals("M.Tech"))
             {    
             rs=stmt.executeQuery("select * from codet order by ano");
             rs.last();
             t13.setText(rs.getString("coname"));
             t14.setText(rs.getString("cocity"));
             cb8.setSelectedItem(rs.getString("coyop"));
             jta3.setText(rs.getString("coaddress"));
             t15.setText(rs.getString("couniv"));
             t16.setText(rs.getString("per"));
             t18.setText(rs.getString("gate"));
             }
             rs=stmt.executeQuery("select * from pdet order by ano");
             rs.last();
             t19.setText(rs.getString("fname"));
             t20.setText(rs.getString("fmob"));
             t21.setText(rs.getString("mname"));
             t22.setText(rs.getString("mmob"));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
         if(ae.getSource()==b6)
            {
                
              int id=Integer.parseInt(t23.getText());
             
               try
               {
                   PreparedStatement p=con.prepareStatement("select * from master where ano=?");
                   p.setInt(1, id);
                   ResultSet r=p.executeQuery();
                   rs=null;
                    Database db=new Database();
                    con=db.connect();
                   if(rs == null)
                   {
                       id+=1;
                    ps1=con.prepareStatement("select * from master where ano=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    ps1.setInt(1,id);
                    rs=ps1.executeQuery();
                   }
                
                                      
             if(rs.next() && !rs.isAfterLast())
             {    
               t23.setText(rs.getString("ano"));
               cb1.setSelectedItem(rs.getString("dlevel"));
               cb2.setSelectedItem(rs.getString("p1"));
               cb3.setSelectedItem(rs.getString("p2"));
               cb4.setSelectedItem(rs.getString("p3"));
               t1.setText(rs.getString("cname"));
               cb5.setSelectedItem(rs.getString("ccat"));
               t2.setText(rs.getString("cemail"));
               t3.setText(rs.getString("cdob"));
               t4.setText(rs.getString("cmob"));             
               t5.setText(rs.getString("ccity"));
               t6.setText(rs.getString("cpin"));
               cb6.setSelectedItem(rs.getString("cstate"));
               jta1.setText(rs.getString("caddress"));
               t7.setText(rs.getString("sname"));
               t8.setText(rs.getString("scity"));
               cb7.setSelectedItem(rs.getString("syop"));
               jta2.setText(rs.getString("saddress"));
               t9.setText(rs.getString("sboard"));
               t10.setText(rs.getString("phy"));
               t11.setText(rs.getString("chem"));
               t12.setText(rs.getString("maths"));
               t17.setText(rs.getString("jee"));
               t13.setText(rs.getString("coname"));
               t14.setText(rs.getString("cocity"));
               cb8.setSelectedItem(rs.getString("coyop"));
               jta3.setText(rs.getString("coaddress"));
               t15.setText(rs.getString("couniv"));
               t16.setText(rs.getString("per"));
               t18.setText(rs.getString("gate"));
               t19.setText(rs.getString("fname"));
               t20.setText(rs.getString("fmob"));
               t21.setText(rs.getString("mname"));
               t22.setText(rs.getString("mmob"));
             }            
             else
             {
               JOptionPane.showMessageDialog(null,"no next record");  
             }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
         if(ae.getSource()==b8)
            {
              String id=t23.getText();
            try
            {
             Database db=new Database();
             con=db.connect();
             Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             rs=stmt.executeQuery("select * from appno");
             rs.getRow();
             rs.previous();
             t23.setText(rs.getString("ano"));
             rs=stmt.executeQuery("select * from mdet");
             rs.getRow();
             rs.previous();
             cb1.setSelectedItem(rs.getString("dlevel"));
             cb2.setSelectedItem(rs.getString("p1"));
             cb3.setSelectedItem(rs.getString("p2"));
             cb4.setSelectedItem(rs.getString("p3"));
             rs=stmt.executeQuery("select * from cdet");
             rs.getRow();
             rs.previous();
             t1.setText(rs.getString("cname"));
             cb5.setSelectedItem(rs.getString("ccat"));
             t2.setText(rs.getString("cemail"));
             t3.setText(rs.getString("cdob"));
             t4.setText(rs.getString("cmob"));
             rs=stmt.executeQuery("select * from cadd");
             rs.getRow();
             rs.previous();
             t5.setText(rs.getString("ccity"));
             t6.setText(rs.getString("cpin"));
             cb6.setSelectedItem(rs.getString("cstate"));
             jta1.setText(rs.getString("caddress"));
             rs=stmt.executeQuery("select * from sdet");
             rs.getRow();
             rs.previous();
             t7.setText(rs.getString("sname"));
             t8.setText(rs.getString("scity"));
             cb7.setSelectedItem(rs.getString("syop"));
             jta2.setText(rs.getString("saddress"));
             t9.setText(rs.getString("sboard"));
             t10.setText(rs.getString("phy"));
             t11.setText(rs.getString("chem"));
             t12.setText(rs.getString("maths"));
             t17.setText(rs.getString("jee"));
             rs=stmt.executeQuery("select * from codet");
             rs.getRow();
             rs.previous();
             t13.setText(rs.getString("coname"));
             t14.setText(rs.getString("cocity"));
             cb8.setSelectedItem(rs.getString("coyop"));
             jta3.setText(rs.getString("coaddress"));
             t15.setText(rs.getString("couniv"));
             t16.setText(rs.getString("per"));
             t18.setText(rs.getString("gate"));
             rs=stmt.executeQuery("select * from pdet");
             rs.getRow();
             rs.previous();
             t19.setText(rs.getString("fname"));
             t20.setText(rs.getString("fmob"));
             t21.setText(rs.getString("mname"));
             t22.setText(rs.getString("mmob"));
             }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }*/
         
    }
 public static void main(String[] args)
    {
      admchange adf=new admchange("Student Records");  
        adf.setSize(1300,730);
        adf.setLocation(30,0);
        adf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        adf.setVisible(true);
    }
}