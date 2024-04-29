package session3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ScrollDemo extends JFrame {
	JScrollPane jsp;
	JButton b[];
	JPanel jp;

	public ScrollDemo() {
		setLayout(new BorderLayout());
		jp = new JPanel();
		jp.setLayout(new GridLayout(20, 2));
		b = new JButton[100];
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton("Button  " + i);
			jp.add(b[i]);
		}
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		jsp = new JScrollPane(jp, v, h);
		add(jsp);
	}

	public static void main(String args[]) {
		ScrollDemo sd = new ScrollDemo();
		sd.setSize(200, 300);
		sd.setVisible(true);
	}
}
