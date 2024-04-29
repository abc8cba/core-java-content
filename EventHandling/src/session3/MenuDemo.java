package session3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;

public class MenuDemo extends JFrame implements ActionListener, ItemListener {
	JMenuBar bar;
	JMenu file, edit, help;
	JMenuItem open, close, copy, paste;
	JTextArea area;
	JRadioButtonMenuItem r1, r2, r3;
	JCheckBoxMenuItem cb1;
	ButtonGroup bg;

	public MenuDemo() {
		setTitle("Menu bar Demonstration");
		bar = new JMenuBar();
		setJMenuBar(bar);

		file = new JMenu("File");
		file.setMnemonic('F');

		edit = new JMenu("Edit");
		edit.setMnemonic('E');

		help = new JMenu("Help");
		help.setMnemonic('H');

		open = new JMenuItem("Open");
		close = new JMenuItem("Close");
		file.add(open);
		file.addSeparator();
		file.add(close);

		copy = new JMenuItem("Copy");
		copy.addActionListener(this);
		paste = new JMenuItem("Paste");
		paste.addActionListener(this);
		edit.add(copy);
		edit.add(paste);

		r1 = new JRadioButtonMenuItem("Red");
		help.add(r1);
		r2 = new JRadioButtonMenuItem("Green");
		help.add(r2);
		r3 = new JRadioButtonMenuItem("Blue");
		help.add(r3);

		bar.add(file);
		bar.add(edit);
		bar.add(help);

		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);

		area = new JTextArea(10, 20);
		add(area);
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		cb1 = new JCheckBoxMenuItem("Visible", true);
		help.add(cb1);
		cb1.addItemListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == copy)
			area.copy();
		if (ae.getSource() == paste)
			area.paste();
		if (ae.getSource() == r1) {
			area.setForeground(new Color(255, 0, 0));
			area.setBackground(new Color(100, 100, 100));
		}
		if (ae.getSource() == r2) {
			area.setForeground(new Color(0, 255, 0));
		}
		if (ae.getSource() == r3) {
			area.setForeground(new Color(0, 0, 255));
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED)
			area.setVisible(true);
		else
			area.setVisible(false);
	}

	public static void main(String[] args) {
		MenuDemo md = new MenuDemo();
		md.setSize(500, 500);
		md.setVisible(true);
		md.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}

}
