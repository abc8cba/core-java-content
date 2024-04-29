package com.project;

public class LogicalProgramString {

	public static void main(String[] args) {		
		//largestNumber();
		largestString();		
		//swapTwoString();
	}
	
	static void swapTwoString() {
		
	}
	
	static void largestString() {
		String str = "India iss my beautiful country aaa";
		String s[] = str.split(" ");
		String largest = "";
		int temp = s[0].length();
		for(int i=1; i<s.length; i++) {
			if(temp < s[i].length()) {
				temp = s[i].length();
				largest = s[i];
				System.out.println(s[i]+"  "+largest);
			}
		}
		
		System.out.println("Largest String: "+largest);
	}
	
	static void largestNumber() {
		int[] numbers = {3,1,6,4,9,7};
		int temp = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(temp < numbers[i]) {
				temp = numbers[i];
			}
		}
		System.out.println(temp);
	}

}
