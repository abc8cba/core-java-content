package com.project;

import java.util.HashMap;
import java.util.Map;

class Person {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}

public class Test {
	public static void main(String p[]) {

		HashMap<Person, Integer> map = new HashMap<>();
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		map.put(p1, 12);
		map.put(p2, 13);
		map.put(p3, 17);
		
		System.out.println(map);

		// System.out.println(map.get("k105"));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
	}
}
