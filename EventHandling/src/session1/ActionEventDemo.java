package session1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Sandeep Singh
 */
public class ActionEventDemo implements ActionListener{
	
	public ActionEventDemo() {
		initGui();
	}

	/**
	 * This method is used to create required GUI
	 * (Graphical User Interface) which will be used
	 * to handle events
	 */
	private void initGui() {
		JFrame frame = new JFrame("Action Event Test");
		Container container = frame.getContentPane();
		JButton button = new JButton("Submit");
		container.add(button);
		
		frame.setLayout(new FlowLayout());
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		/**
		 * Registration of button to handle action event
		 */
		button.addActionListener(this);
		
	}
	
	/**
	 * Mandatory to override to handle action event.
	 * for this, ActionListener interface required
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Form submitted...");
		
	}

	public static void main(String[] args) {
		new ActionEventDemo();

	}

}
