package session3;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo extends JFrame {
	JScrollPane jsp;
	String[] colHeader = { "Roll No", "Name", "Phone" };
	Object[][] colData = { { 1, "John", "9713460241" }, { 2, "Bob", "72034615213" }, { 3, "Mary", "7616464120" },
			{ 4, "Akshit", "53003120067" } };
	JTable jt;

	public TableDemo(){
		jt = new JTable(colData, colHeader);
		jsp = new JScrollPane(jt);
		add(jsp);
	}

	public static void main(String[] args) {
		TableDemo td = new TableDemo();
		td.setSize(500, 500);
		td.setVisible(true);
	}
}
