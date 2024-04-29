package interview.program.practice;

import java.util.Map.Entry;
import java.util.*;

public class CountOccurencesOfEachCharacterInString {
	
	public static void main(String[] args) {
		//way1();
		//way2();
		//way3();
		way4();
		//way5();
	}
	
	static void way5(){
		String str = "aa bb ccc dddd bb aa dddd aa dddd";
		String arr[] = str.split(" ");
		Map<String,Integer> map = new LinkedHashMap<>();
		for(String st : arr){
			if(map.containsKey(st))
				map.put(st, map.get(st)+1);
			else
				map.put(st, 1);
		}
		
		System.out.println(map);
	}
	
	static void way4(){
		int[] arr = {7,5,9,8,5,6,7,5,4,8};
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(Integer key : arr){
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		
		System.out.println(map);
	}
	
	static void way1(){
		String str = "aaabcdddddefgggggghijjjjjjjkklnnnno";
		//String st = "";
		StringBuilder st=new StringBuilder("");
		for(int i = 0;i < str.length()-1; i++){
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			if(ch1==ch2){
				//st=st+str.charAt(i);
				st.append(str.charAt(i));
			}else{				
				//st=st+str.charAt(i);
				st.append(str.charAt(i));
				if(st.length()>1) {
					System.out.println("\""+st+"\" occured: "+st.length()+" times in given string");
				}
				//st = "";
				st.setLength(0);
				System.out.println("Length = "+st);
				
			}
		}
	}
	
	static void way2(){
		
		String str = "fgaaadddddgggggghjjjjjjjkknnnnpl";
		char ch[] = str.toCharArray();
		ArrayList<String> arr = new ArrayList<>();
		for(char c : ch){
			arr.add(c+"");
		}
		System.out.println(arr);
		
		Set<String> list = new LinkedHashSet<>(arr);
		Map<String,Integer> map = new LinkedHashMap<>();
		for(String st : list){
			map.put(st, Collections.frequency(arr, st));
			if(Collections.frequency(arr, st)>1)
				System.out.println(st+" occured: "+Collections.frequency(arr, st)+" Times.");
		}
//		
//		List<Map.Entry<String,Integer>> entries = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
//		Collections.sort(entries, new Comparator<Entry<String,Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				return o1.getValue()-o2.getValue();
//			}
//		});
//		
//		for(Entry<String,Integer> entry: entries){
//			if(entry.getValue()>1)
//				System.out.println(entry.getKey()+"   "+entry.getValue());
//		}
	}
	
	static void way3(){
		String str = "India is great country";
		char chArr[] = str.toCharArray();
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char ch : chArr){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entries =map.entrySet();
		for(Entry<Character, Integer> entry : entries){
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" occured: "+entry.getValue()+" times.");
		}
		
//		Iterator<Map.Entry<Character, Integer>> entries= map.entrySet().iterator();
//		while(entries.hasNext()){
//			Entry<Character, Integer> entry = entries.next(); 
//			System.out.println(entry.getKey()+" occured: "+entry.getValue()+" times.");
//		}
	}


}
