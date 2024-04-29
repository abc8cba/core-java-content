package com.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LogicalProgramCollection {	

	public static void main(String[] args) {
				
//		findCountOfNumbersInList();
//		findCountOfNumbersInList2();
//		
//		findCountOfStringInStatementString();
//		findCountOfStringInStatementString2();
//		
//		findCountOfCharacterInString();
//		findCountOfCharacterInString2();

	}	
	
	
	public static void findCountOfStringInStatementString2() {
		String str = "aa cc dd cc aa bb aa dd cc aa";
		String[] strArray = str.split(" ");
		List<String> list = new ArrayList<>();
		for(String s: strArray) {
			list.add(s);
		}		
		//To display numbers in ascending order
		System.out.println("To display numbers in ascending order\n"
						+ "-------------------------------------------------");
		Collections.sort(list);
		LinkedHashSet<String> set = new LinkedHashSet<>(list);
		Map<String, Integer> map = new LinkedHashMap<>();
		for(String num: set) {
			map.put(num, Collections.frequency(list, num));
		}
		
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Number: "+entry.getKey()+" repeated: "+entry.getValue()+" times.");
		}
		//To display numbers based on their occurence
		System.out.println("\nTo display numbers based on their occurence ascending\n"
				+ "------------------------------------------------------");
		
		ArrayList<Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
				return entry1.getValue()-entry2.getValue();
			}
		});
		
		for(Entry<String, Integer> entry: entryList) {
			System.out.println("Number: "+entry.getKey()+" repeated: "+entry.getValue()+" times.");
		}	
	}
		
	public static void findCountOfCharacterInString2() {
		String str = "abcdabcaba";
		char[] charArray = str.toCharArray();
		List<String> list = new ArrayList<>();
		for(char ch: charArray) {
			list.add(ch+"");
		}		
		//To display numbers in ascending order
		System.out.println("To display numbers in ascending order\n"
						+ "-------------------------------------------------");
		Collections.sort(list);
		LinkedHashSet<String> set = new LinkedHashSet<>(list);
		Map<String, Integer> map = new LinkedHashMap<>();
		for(String num: set) {
			map.put(num, Collections.frequency(list, num));
		}
		
		for(Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Number: "+entry.getKey()+" repeated: "+entry.getValue()+" times.");
		}
		//To display numbers based on their occurence
		System.out.println("\nTo display numbers based on their occurence ascending\n"
				+ "------------------------------------------------------");
		
		ArrayList<Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
				return entry1.getValue()-entry2.getValue();
			}
		});
		
		for(Entry<String, Integer> entry: entryList) {
			System.out.println("Number: "+entry.getKey()+" repeated: "+entry.getValue()+" times.");
		}	
	}
		
	public static void findCountOfNumbersInList2() {
		List<Integer> list = Arrays.asList(4,3,6,1,4,6,1,4,6,4);
		//To display numbers in ascending order
		System.out.println("To display numbers in ascending order\n"
						+ "-------------------------------------------------");
		Collections.sort(list);
		//Collections.sort(list, Collections.reverseOrder());
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(Integer num: set) {
			map.put(num, Collections.frequency(list, num));
		}
		
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println("Number: "+entry.getKey()+" repeated: "+entry.getValue()+" times.");
		}
		//To display numbers based on their occurence
		System.out.println("\nTo display numbers based on their occurence ascending\n"
				+ "------------------------------------------------------");
		
		ArrayList<Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
		Collections.sort(entryList, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> entry1, Entry<Integer, Integer> entry2) {
				return entry1.getValue()-entry2.getValue();
			}
		});
		
		for(Entry<Integer, Integer> entry: entryList) {
			System.out.println("Number: "+entry.getKey()+" repeated: "+entry.getValue()+" times.");
		}			
		
	}
		
	public static void findCountOfStringInStatementString() {
		String str = "aa cc dd cc aa bb aa dd cc aa";
		String[] strArray = str.split(" ");
		
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String key : strArray) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else {
				map.put(key, 1);
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Number: " + entry.getKey() + " repeated: " + entry.getValue() + " times.");
		}
		// To display numbers based on their occurence
		System.out.println("\nTo display numbers based on their occurence ascending\n"
				+ "------------------------------------------------------");

		ArrayList<Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
				return entry1.getValue() - entry2.getValue();
			}
		});

		for (Entry<String, Integer> entry : entryList) {
			System.out.println("Number: " + entry.getKey() + " repeated: " + entry.getValue() + " times.");
		}
	}	

	public static void findCountOfCharacterInString() {
		String str = "abcdabcaba";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char key: charArray) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}
			else {
				map.put(key, 1);
			}			
		}
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println("Number: "+entry.getKey()+" repeated: "+entry.getValue()+" times.");
		}
		//To display numbers based on their occurence
		System.out.println("\nTo display numbers based on their occurence ascending\n"
				+ "------------------------------------------------------");
		
		ArrayList<Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
		Collections.sort(entryList, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> entry1, Entry<Character, Integer> entry2) {
				return entry1.getValue()-entry2.getValue();
			}
		});
		
		for(Entry<Character, Integer> entry: entryList) {
			System.out.println("Number: "+entry.getKey()+" repeated: "+entry.getValue()+" times.");
		}	
	}
	
	public static void findCountOfNumbersInList() {
		List<Integer> list = Arrays.asList(4, 3, 6, 1, 4, 6, 1, 4, 6, 4);
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (Integer num : list) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		// To display numbers based on their occurence
		System.out.println("\nTo display numbers based on their occurence ascending\n"
				+ "------------------------------------------------------");

		ArrayList<Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
		Collections.sort(entryList, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> entry1, Entry<Integer, Integer> entry2) {
				return entry1.getValue() - entry2.getValue();
			}
		});

		for (Entry<Integer, Integer> entry : entryList) {
			System.out.println("Number: " + entry.getKey() + " repeated: " + entry.getValue() + " times.");
		}

	}
	
	
}


















