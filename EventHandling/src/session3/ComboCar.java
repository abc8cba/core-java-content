package session3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ComboCar extends JFrame implements ActionListener {
	JComboBox cb;
	JTextField tf;
	int i;
	String[] names = { "Mercedes", "BMW", "Audi", "Porsche" };
	int[] price = { 100000, 200000, 300000, 4000000 };

	public ComboCar() {
		setLayout(new FlowLayout());
		String[] names = { "Mercedes", "BMW", "Audi", "Porsche" };
		cb = new JComboBox(names);
		add(cb);
		cb.addActionListener(this);
		tf = new JTextField("Select a Car :");
		add(tf);
	}

	public void actionPerformed(ActionEvent ae) {
		i = cb.getSelectedIndex();
		tf.setText("The price of " + names[i] + " car is : " + price[i]);
		add(tf);
	}

	public static void main(String[] args) {
		ComboCar cb = new ComboCar();
		cb.setSize(500, 500);
		cb.setVisible(true);
		cb.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}
}
