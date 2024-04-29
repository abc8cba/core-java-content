package session1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Sandeep Singh
 */
public class DemoGUI {

	/**
	 * This method is used to create required GUI
	 * (Graphical User Interface) which will be used
	 * to handle events
	 */
	public void initG() {
		JFrame frm = new JFrame();
		Container con = frm.getContentPane();
		JButton btn = new JButton("Submit");
		JTextField tf = new JTextField(20);
		con.setLayout(new FlowLayout());
		con.add(btn);
		con.add(tf);
		frm.setSize(400, 400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public DemoGUI() {
		initG();
	}

	public static void main(String p[]) {
		new DemoGUI();
	}
}
