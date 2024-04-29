package com.project;

public class LogicalProgramArray {

	public static void main(String[] args) {

		//findCountOfNumbersInArray();
		//removeDuplicatesInArray();
	}
	
	public static void findCountOfNumbersInArray() {
		int arr[] = {4,3,6,1,4,6,1,4,6,4};
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
			if(tempArr[i] != visited) {
				System.out.println(arr[i]+" repeated "+tempArr[i]+" times.");
			}
			
		}
	}
		
	public static void removeDuplicatesInArray() {
		int arr[] = {4,3,6,1,4,6,1,4,6,4};
		int visited = -1;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j] = visited;
				}
			}			
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != visited) {
				System.out.print(arr[i]+" ");
			}			
		}
	}

}
