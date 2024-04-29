package com.project;

import java.util.Collections;

interface A{
	void show(int x,int y);
}

class BBB implements A{
	
	public BBB(int x){
		System.out.println("Hey man");
	}
	@Override
	public void show(int a, int b) {
		System.out.println("Multiply Result = "+a*b);		
	}	
}

interface B{
	void show();
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println("hi");
		//Case 1
		A obj = (x,y) -> System.out.println("x "+x+" y= "+y);
		obj.show(20,40);
		
		//Case 2
		A obj3 =(a,b)->{
			int c = a+b;
			System.out.println("Sum = "+c);
		};
		
		obj3.show(4, 8);
		
		//Case 3
		A obj2 = new A() {
			
			@Override
			public void show(int x, int y) {
				
				System.out.println("x "+x+" y= "+y);
			}
		};
		
		obj2.show(100, 200);
		
		//case 4
		
		A obj4 = new BBB(20);
		obj4.show(20, 30);
		
		System.out.println(obj4);
	}
}
