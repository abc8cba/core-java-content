package session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Vector;

public class ListVsSet {

	public static void main(String[] args) {
		 //LinkedList<Integer> list = new LinkedList<Integer>();
		 //Vector<Integer> list = new Vector<>();
		 //ArrayList<Integer> list = new ArrayList<>();
		  HashSet<Integer> list = new HashSet<Integer>();
		//LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
		 //TreeSet<Integer> list = new TreeSet<Integer>();
		list.add(40);
		list.add(20);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(10);
		System.out.println(list);
		
		//Collections.sort(list);
		TreeSet<Integer> t = new TreeSet<Integer>(list);
		System.out.println(t);
		
		NavigableSet<Integer> descendingSet = t.descendingSet();
		System.out.println(descendingSet);
		

	}

}
