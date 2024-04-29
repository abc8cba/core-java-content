package session1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WindowListenerDemo implements WindowListener {
	
	JFrame fm;
	JLabel coord;
	Container cn;

	public WindowListenerDemo() {
		initGUI();
	}

	public void initGUI() {

		fm = new JFrame();
		coord = new JLabel();
		cn = new Container();
		cn = fm.getContentPane();
		cn.setLayout(new BorderLayout());
		cn.add(coord, BorderLayout.NORTH);
		fm.setSize(500, 500);
		fm.setVisible(true);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm.addWindowListener(this);
	}

	public void windowActivated(WindowEvent we) {
		System.out.println("windowActivated method called");
	}

	public void windowClosed(WindowEvent we) {
		System.out.println("windowClosed method called");
	}

	public void windowClosing(WindowEvent we) {
		JOptionPane.showMessageDialog(null, "Are you sure to close Frame?");
		System.out.println("windowClosing method called");
		System.exit(0);
	}

	public void windowDeiconified(WindowEvent we) {
		System.out.println("windowDeiconified method called");
	}

	public void windowIconified(WindowEvent we) {
		System.out.println("windowIconified method called");
	}

	public void windowDeactivated(WindowEvent we) {
		System.out.println("windowDeactivated method called");
	}

	public void windowOpened(WindowEvent we) {
		System.out.println("windowOpened method called");
	}
	
	public static void main(String[] args) {
		new WindowListenerDemo();
	}

}
