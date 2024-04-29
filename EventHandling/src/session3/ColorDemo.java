package session3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ColorDemo extends JFrame implements ActionListener {
	JButton b1;
	JTextField tf1;

	public ColorDemo() {
		setLayout(new FlowLayout());
		b1 = new JButton("Click");
		add(b1);
		b1.addActionListener(this);
		tf1 = new JTextField(20);
		add(tf1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser f1 = new JFileChooser();
		Color c = JColorChooser.showDialog(this, "MyColorWindow", Color.white);
		int x = f1.showOpenDialog(this);
		tf1.setForeground(c);
		if (x == JFileChooser.APPROVE_OPTION) {
			java.io.File file = f1.getSelectedFile();
			tf1.setText(file.getName());
		}

	}

	public static void main(String[] args) {
		ColorDemo cd = new ColorDemo();
		cd.setSize(200, 300);
		cd.setVisible(true);
	}
}