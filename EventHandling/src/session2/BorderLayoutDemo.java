package session2;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {

	JFrame mf;

	public void initGUI() {

		mf = new JFrame();
		Container c = mf.getContentPane();
		c.setLayout(new BorderLayout());
		JButton b1 = new JButton("First Slide");
		JButton b2 = new JButton("Second Slide");
		JButton b3 = new JButton("Third Slide");
		JButton b4 = new JButton("Fourth Slide");
		JButton b5 = new JButton("Fifth Slide");
		c.add(b1, BorderLayout.EAST);
		c.add(b2, BorderLayout.WEST);
		c.add(b3, BorderLayout.CENTER);
		c.add(b4, BorderLayout.NORTH);
		c.add(b5, BorderLayout.SOUTH);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setSize(400, 300);
		mf.setVisible(true);

	}

	public BorderLayoutDemo() {

		initGUI();

	}

	public static void main(String[] args) {

		new BorderLayoutDemo();

	}
}
