package session2;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorDemo implements ActionListener{

    JFrame frm;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton bAdd,bSub,bMul,bDiv,bEqual,bPoint;
    JTextField tf;
    JLabel lb;
    JPanel pnl;

    public void initCalc(){

        frm=new JFrame("Calculator App");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bAdd=new JButton("+");
        bSub=new JButton("-");
        bMul=new JButton("*");
        bDiv=new JButton("/");
        bEqual=new JButton("=");
        bPoint=new JButton(".");
        tf=new JTextField();
        lb=new JLabel("My Calculator: ");
  
        pnl=new JPanel(new GridLayout(4,4));
        pnl.add(b1); 
        pnl.add(b2);  
        pnl.add(b3);  
        pnl.add(b4);  
        pnl.add(b5);  
        pnl.add(b6);  
        pnl.add(b7);  
        pnl.add(b8);  
        pnl.add(b9);  
        pnl.add(b0);  
        pnl.add(bAdd);  
        pnl.add(bSub);  
        pnl.add(bMul);  
        pnl.add(bDiv);
        pnl.add(bEqual);  
        pnl.add(bPoint);    

        Container con=frm.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(tf,BorderLayout.NORTH);
        con.add(lb,BorderLayout.SOUTH);
        con.add(pnl,BorderLayout.CENTER);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bEqual.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        frm.setSize(300,300);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   } 

    public void actionPerformed(ActionEvent ae){

       String oper,oper1,oper2,result;
       int op1,op2,res;

       if(ae.getSource()==bAdd){           
           
         if(tf.getText()=="1" && tf.getText()=="2"){  

           //op1 = Integer.parseInt(tf.getText());
           //op2 = Integer.parseInt(tf.getText());
           //res = 1+2;
           //result =res + " ";
           lb.setText("3");
         }

      }

      else if(ae.getSource()==bSub){

           oper = tf.getText() ;
           op1 = Integer.parseInt(oper); 
           oper = tf.getText();
           op2 = Integer.parseInt(oper);  
           res = op1-op2;
           result =res + " ";
           lb.setText(result);

      }
    
      else if(ae.getSource()==b1){

         tf.setText("");
         oper=tf.getText();
         tf.setText(oper+"1"); 

      }
   
       else if(ae.getSource()==b2){

         tf.setText("");
         oper=tf.getText();
         tf.setText(oper+"2");
           
       }

       else if(ae.getSource()==b3){

         tf.setText("");
         oper=tf.getText();
         tf.setText(oper+"3"); 
       }

       else if(ae.getSource()==b4){

         tf.setText("");
         oper=tf.getText();
         tf.setText(oper+"4"); 
       }
   
      

    }

      public CalculatorDemo(){

          initCalc();         

     }

     public static void main(String p[]){

          new CalculatorDemo();

     }


}