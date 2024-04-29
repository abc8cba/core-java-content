package session2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListComparisions {

	public static void main(String[] args) {
		//Vector<Integer> list = new Vector<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		LinkedList<Integer> list = new LinkedList<Integer>(list2);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(20);
		System.out.println(list);
		list.add(0, 5000);
		System.out.println(list);
		ArrayList<Integer> list3 = new ArrayList<Integer>(list);
//		list.remove(0);
//		System.out.println(list);

	}
}
