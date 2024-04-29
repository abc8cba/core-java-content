package session2;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FlowLayoutDemo {

	JFrame mf;
	JTextField tf;
	JButton b1;

	public void initGUI() {

		mf = new JFrame();
		Container c = mf.getContentPane();
		c.setLayout(new FlowLayout());
		JTextField tf = new JTextField("sandeep singh");
		JButton b1 = new JButton("First Slide");
		JButton b2 = new JButton("Second Slide");
		JButton b3 = new JButton("Third Slide");
		JButton b4 = new JButton("Fourth Slide");
		JButton b5 = new JButton("Fifth Slide");
		c.add(tf);
		c.add(b1);
	    c.add(b2);
	    c.add(b3);
	    c.add(b4);
	    c.add(b5);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setSize(400, 300);
		mf.setVisible(true);

	}

	public FlowLayoutDemo() {

		initGUI();

	}

	public static void main(String[] args) {

		new FlowLayoutDemo();

	}
}
