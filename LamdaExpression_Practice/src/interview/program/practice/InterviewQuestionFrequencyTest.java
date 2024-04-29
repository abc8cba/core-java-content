package interview.program.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import required.db.content.MyCollections;

public class InterviewQuestionFrequencyTest {

	public static void main(String[] args) {
		//findNumberFrequency1();
		//findNumberFrequency2();
		//findStringFrequency1();
		//findStringFrequency2();
		//findCharFrequency();
		findCountOfNumbersInArray();
	}
	
	private static void findCountOfNumbersInArray() {
		int arr[] = {4,3,6,2,1,4,3,6,2,4,3,6,4};
		int tempArr[] = new int[arr.length];
		int visited = -1;
		for(int i=0; i<arr.length; i++) {			
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					tempArr[j] = visited;
					System.out.println("tempArr[j]:"+tempArr[j]+"  arr[i]:"+arr[i]+" arr[j]:"+arr[j]);
				}
			}
			if(tempArr[i] != visited)
				tempArr[i] = count;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(tempArr[i] != visited)
				System.out.println(arr[i]+" repeated "+tempArr[i]+" times.");
		}
	}
	
	private static void findCharFrequency() {
		String str = "cbacbcbabcb";
		char ch[] = str.toCharArray();
		List<String> listString = new ArrayList<>();
		for(char c : ch) {
			listString.add(c+"");
		}
		LinkedHashSet<String> uniqueList = new LinkedHashSet<>(listString) ;
		Map<String, Integer> map = new LinkedHashMap<>();		
		
		for(String key: uniqueList) 
			map.put(key, Collections.frequency(listString, key));
		
		map.entrySet().stream()
			.sorted((entry1, entry2)->entry1.getValue().compareTo(entry2.getValue()))
			.forEach(System.out::println);
				
		
	}
	
	private static void findStringFrequency2() {
		List<String> listString = MyCollections.getStringList();	
		LinkedHashSet<String> uniqueList = new LinkedHashSet<>(listString) ;
		Map<String, Integer> map = new LinkedHashMap<>();		
		
		for(String key: uniqueList) 
			map.put(key, Collections.frequency(listString, key));
		
		map.entrySet().stream()
			.sorted((entry1, entry2)->entry1.getValue().compareTo(entry2.getValue()))
			.forEach(System.out::println);
				
		
	}
	
	private static void findStringFrequency1() {
		List<String> listString = MyCollections.getStringList();	
		LinkedHashSet<String> uniqueList = new LinkedHashSet<>(listString) ;
		Map<String, Integer> map = new LinkedHashMap<>();		
		
		for(String key: uniqueList) 
			map.put(key, Collections.frequency(listString, key));
		
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue()-o2.getValue();
			}
		});
		
		for(Entry<String, Integer> entry: list) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		Entry<String, Integer> entry = list.get(list.size()-1);
		System.out.println("String: "+entry.getKey()+" in the list having highest frequency: "+entry.getValue());		
		
	}
	
	private static void findNumberFrequency2() {
		List<Integer> listNums = Arrays.asList(5,5,4,4,4,4,4,4,4,4,3,3,3,3,2,2,2,2,2);	
		LinkedHashSet<Integer> uniqueList = new LinkedHashSet<>(listNums) ;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int key: uniqueList) 
			map.put(key, Collections.frequency(listNums, key));
		
		map.entrySet().stream()
			.sorted((o1,o2)->o1.getValue()-o2.getValue())
			.forEach(entry->System.out.println(entry.getKey()+"  "+entry.getValue()));
	
		Optional<Integer> largestValue = map.values().stream()
			.collect(Collectors.maxBy(Comparator.comparing(Integer::intValue)));
		
		System.out.println(largestValue.get());
		

		
	}

	private static void findNumberFrequency1() {
		List<Integer> listNums = Arrays.asList(5,5,4,4,4,4,4,4,4,4,3,3,3,3,2,2,2,2,2);	
		LinkedHashSet<Integer> uniqueList = new LinkedHashSet<>(listNums) ;
		Map<Integer, Integer> map = new LinkedHashMap<>();		
		
		for(int key: uniqueList) 
			map.put(key, Collections.frequency(listNums, key));
		
		ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue()-o2.getValue();
			}
		});
		
		for(Entry<Integer, Integer> entry: list) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		Entry<Integer, Integer> entry = list.get(list.size()-1);
		System.out.println("Number: "+entry.getKey()+" in the list having highest frequency: "+entry.getValue());
		
		
	}

}
