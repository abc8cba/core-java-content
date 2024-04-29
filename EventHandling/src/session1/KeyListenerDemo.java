package session1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyListenerDemo implements ActionListener, KeyListener {

	JFrame fm;
	Container con;
	JTextField tf1, tf2, ans;
	JLabel l1, l2;
	JButton bAdd, bSub;

	public void initGui() {

		fm = new JFrame();
		con = fm.getContentPane();
		tf1 = new JTextField(15);
		tf2 = new JTextField(15);
		ans = new JTextField(10);
		l1 = new JLabel("Enter the first Number: ");
		l2 = new JLabel("Enter the second Number: ");
		bAdd = new JButton("Add  ");
		bSub = new JButton("Sub  ");
		con.setLayout(new FlowLayout());
		con.add(l1);
		con.add(tf1);
		con.add(l2);
		con.add(tf2);
		con.add(ans);
		con.add(bAdd);
		con.add(bSub);
		fm.setSize(200, 300);
		fm.setVisible(true);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bAdd.addKeyListener(this);
		bSub.addKeyListener(this);

	}

	public KeyListenerDemo() {

		initGui();

	}

	public void actionPerformed(ActionEvent ae) {

		String oper1, oper2, oper3;
		int op1, op2, result;

		if (ae.getSource() == bAdd) {

			oper1 = tf1.getText();
			op1 = Integer.parseInt(oper1);
			oper2 = tf2.getText();
			op2 = Integer.parseInt(oper2);
			result = op1 + op2;
			oper3 = result + "";
			ans.setText("Ans: " + oper3);

		} else if (ae.getSource() == bSub) {

			oper1 = tf1.getText();
			op1 = Integer.parseInt(oper1);
			oper2 = tf2.getText();
			op2 = Integer.parseInt(oper2);
			result = op1 - op2;
			oper3 = result + "";
			ans.setText("Answer: " + oper3);

		}

	}

	public void keyPressed(KeyEvent ke) {
		System.out.println("keyPressed method called: ");
		String oper1, oper2, oper3;
		int op1, op2, result;

		if (ke.getSource() == bAdd) {

			oper1 = tf1.getText();
			op1 = Integer.parseInt(oper1);
			oper2 = tf2.getText();
			op2 = Integer.parseInt(oper2);
			result = op1 + op2;
			oper3 = result + "";
			ans.setText("Ans: " + oper3);

		} else if (ke.getSource() == bSub) {

			oper1 = tf1.getText();
			op1 = Integer.parseInt(oper1);
			oper2 = tf2.getText();
			op2 = Integer.parseInt(oper2);
			result = op1 - op2;
			oper3 = result + "";
			ans.setText("Answer: " + oper3);

		}
	}

	public void keyReleased(KeyEvent ke) {
		System.out.println("keyReleased method called: ");
	}

	public void keyTyped(KeyEvent ke) {
		System.out.println("keyTyped method called: ");
	}

	public static void main(String p[]) {

		new KeyListenerDemo();

	}

}
