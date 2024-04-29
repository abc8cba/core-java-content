package session3;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(40);
		list.add(20.5);
		list.add("Ravi");
		list.add(10);
		list.add(false);
		list.add(50F);
		System.out.println(list);
		
		for(Object obj:list) {
//			int value=(Integer)obj;
//			System.out.println(value);
			
			if(obj instanceof Integer) {
				System.out.println(obj);
			}
			if(obj instanceof Boolean) {
				System.out.println(obj);
			}
		}

	}

}
