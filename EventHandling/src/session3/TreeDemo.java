package session3;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class TreeDemo {
	JTree jt;
	JTextField tf1;
	JFrame frm;
	JLabel coord;

	public TreeDemo() {
		frm = new JFrame("TreeDemo");
		Container con = frm.getContentPane();
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("UPG");
		DefaultMutableTreeNode bmm = new DefaultMutableTreeNode("Bmm");
		DefaultMutableTreeNode bscit = new DefaultMutableTreeNode("Bscit");
		DefaultMutableTreeNode fyit = new DefaultMutableTreeNode("Fyit");
		DefaultMutableTreeNode syit = new DefaultMutableTreeNode("Syit");
		DefaultMutableTreeNode fybmm = new DefaultMutableTreeNode("Fybmm");
		DefaultMutableTreeNode sybmm = new DefaultMutableTreeNode("Sybmm");
		
		coord = new JLabel();

		bscit.add(fyit);
		bscit.add(syit);
		bmm.add(fybmm);
		bmm.add(sybmm);
		root.add(bscit);
		root.add(bmm);

		jt = new JTree(root);
		con.add(jt);
		tf1 = new JTextField(20);
		con.add(tf1, BorderLayout.NORTH);
		frm.setSize(200, 300);
		frm.setVisible(true);

		jt.addMouseListener(new MouseEventHandler());
		            //OR
		//registerMouseListener();
	}

	private void registerMouseListener() {

		jt.addMouseListener(new MouseAdapter() {
			public void mousepressed(MouseEvent me) {
				TreePath tp = jt.getPathForLocation(me.getX(), me.getY());
				if (tp != null)
					tf1.setText(tp.toString());
			}
		});
		
	}

	private class MouseEventHandler extends MouseAdapter {
		public void mousepressed(MouseEvent me) {
			JOptionPane.showMessageDialog(null, "Mouse pressed");
			TreePath tp = jt.getPathForLocation(me.getX(), me.getY());
			if (tp != null)
				tf1.setText(tp.toString());
		}
	}

	public static void main(String args[]) {
		new TreeDemo();
	}

}
