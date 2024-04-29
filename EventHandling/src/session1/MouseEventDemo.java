package session1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo implements MouseMotionListener, MouseListener, MouseWheelListener {

	JFrame fm;
	JLabel coord;
	Container cn;

	public MouseEventDemo() {
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
		fm.addMouseMotionListener(this);
		fm.addMouseListener(this);
		fm.addMouseWheelListener(this);
	}

	public void mouseDragged(MouseEvent me) {

		int x = me.getX();
		int y = me.getY();
		coord.setText("Dragged at[" + x + "" + y + "]");

	}

	public void mouseMoved(MouseEvent me) {

		int x = me.getX();
		int y = me.getY();
		coord.setText("Moved at[" + x + "," + y + "]");

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("MouseListener mouseClicked method called ");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("MouseListener mousePressed method called ");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("MouseListener mouseReleased method called ");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("MouseListener mouseEntered method called ");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("MouseListener mouseExited method called ");
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("MouseWheelListener mouseWheelMoved method called ");

	}

	public static void main(String[] args) {
		new MouseEventDemo();
	}

}
