package com.project;

import java.util.HashMap;

public class HowHashMapWorks {

	public static void main(String[] args) {
		
		HashMap map = new HashMap<>();
		map.put(new Key("vishal"), 20);
		map.put(new Key("sachin"), 30);
		map.put(new Key("vaibhav"), 40);
		System.out.println(map.get(new Key("sachin")));
		System.out.println(map.get(new Key("vishal")));
		System.out.println(map.get(new Key("vaibhav")));

	}

}

class Key
{
  String key;
  Key(String key)
  {
    this.key = key;
  }
  
  @Override
  public int hashCode() 
  {
	  int hash = (int)key.hashCode();
	  System.out.println("hashCode for key: " + key + " = " + hash); 
      return hash;
  }

  @Override
  public boolean equals(Object obj)
  {
    return key.equals(((Key)obj).key);
  }
}
