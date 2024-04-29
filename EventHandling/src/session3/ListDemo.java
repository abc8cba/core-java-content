package session3;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListDemo extends JFrame implements ListSelectionListener {
	String[] names = { "Eraser", "Pencil", "Pen", "Pouch" };
	String[] price = { "5", "10", "25", "50" };
	JList list;
	JLabel label, label1;

	public ListDemo() {
		setLayout(new BorderLayout());
		label1 = new JLabel("Select Item to know price");
		add(label1, BorderLayout.NORTH);
		list = new JList(names);
		add(list, BorderLayout.CENTER);
		list.addListSelectionListener(this);
		label = new JLabel("Pick an item");
		add(label, BorderLayout.EAST);
	}

	public void valueChanged(ListSelectionEvent e) {
		// JList jl=(JList)e.getSource();
		label.setText("Product selected is " + names[list.getSelectedIndex()] + " and its price is : Rs."
				+ price[list.getSelectedIndex()]+"   ");
	}

	public static void main(String[] args) {
		ListDemo ld = new ListDemo();
		ld.setSize(500, 500);
		ld.setVisible(true);
	}
}
