package session3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;

class MyCustomKey {

	private int id;

	public MyCustomKey(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "MyCustomKey101";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyCustomKey other = (MyCustomKey) obj;
		return id == other.id;
	}
	
	

}

public class HashcodeEqualsMethodInHashmap {

	public static void main(String[] args) {
		case1();
		case2();
	}

	private static void case2() {
		HashMap<MyCustomKey, Integer> map = new HashMap<MyCustomKey, Integer>();
		map.put(new MyCustomKey(101), 40);
		map.put(new MyCustomKey(101), 20);
		map.put(new MyCustomKey(101), 50);
		map.put(new MyCustomKey(101), 30);
		map.put(new MyCustomKey(101), 60);
		map.put(new MyCustomKey(101), 90);
		System.out.println(map);
	}

	private static void case1() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("k101", 40);
		map.put("k101", 20);
		map.put("k101", 50);
		map.put("k101", 30);
		map.put("k101", 60);
		map.put("k101", 90);
		System.out.println(map);

	}

}
