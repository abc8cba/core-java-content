package session1;

import java.util.Collections;
import java.util.Vector;

public class ArrayVsCollection {

	public static void main(String[] args) {		
		//staticArray();
		//dynamicArray();
		dynamicArray2();
	}
	
	private static void dynamicArray2() {		
			Vector<Integer> list= new Vector();			
			list.add(10);
			list.add(20);
			list.add(7);
			list.add(5);
			System.out.println(list);		
			
			Collections.sort(list);
			System.out.println(list);
			
			Collections.reverse(list);
			System.out.println(list);	
		
	}
	
	private static void dynamicArray() {
		Vector<Object> list = new Vector<>(4,2);
//		System.out.println(list.get(0));
		System.out.println(list.size());//0
		System.out.println(list.capacity());//4
		
		list.add(10);
		list.add(20.5);
		list.add("Raj");
		
		list.add(10);
		list.add(20.5);
		list.add("Raj");
//		list.remove(10);
		System.out.println(list.size());//6
		System.out.println(list.capacity());//6	
	}
	
	private static void staticArray() {
		int[] arr = new int[5];
		arr[0] = 70;
		arr[3] = 90;
		System.out.println(arr[2]);//	
		String[] arr2 = new String[5];
		arr2[1] = "Raj";
		arr2[4] = "Mohan";
		System.out.println(arr2[3]);//
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
