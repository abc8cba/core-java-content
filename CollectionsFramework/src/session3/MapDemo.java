package session3;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		dataInSet();
		dataInMap();
	}

	private static void dataInMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("k101", 40);
		map.put("k102", 20);
		map.put("k103", 50);
		map.put("k104", 30);
		map.put("k105", 60);
		map.put("k106", 90);
//		System.out.println(map);		
//		System.out.println("Value = "+map.get("k103"));
		
		//usingForeachLoop(map);
		usingIterator(map);
		
	}

	private static void usingIterator(HashMap<String, Integer> map) {
		Iterator<Entry<String, Integer>> entrySetIterator = map.entrySet().iterator();
		while(entrySetIterator.hasNext()) {
			Entry<String, Integer> entry = entrySetIterator.next();
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}
		
		System.out.println("----------------------");
		Iterator<String> keySetIterator = map.keySet().iterator();
		while(keySetIterator.hasNext()) {
			System.out.println(keySetIterator.next());
		}
		
		System.out.println("----------------------");
		Iterator<Integer> valuesIterator = map.values().iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}
		
	}

	private static void usingForeachLoop(HashMap<String, Integer> map) {
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println("Key = "+entry.getKey()+"  Value = "+entry.getValue());
		}
		
		System.out.println("----------------------");
		Set<String> keySet = map.keySet();
		for(String key:keySet) {
			System.out.println(key);
		}
		
		System.out.println("----------------------");
		Collection<Integer> values = map.values();
		for(Integer value:values) {
			System.out.println(value);
		}
		
	}

	private static void dataInSet() {
		HashSet<Integer> list = new HashSet<Integer>();
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(90);
		
		
		for(int value:list) {
			if(value==30) {
				System.out.println("Object is available and i.e = "+value);
			}
		}

		
	}

}
