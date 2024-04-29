package com.practice3.java8.streams.durgasoft;

interface I1{
	default void m1(){
		System.out.println("Default method From I1 interface");
	}
}

interface I2{
	default void m1(){
		System.out.println("Default method From I2 interface");
	}
}
 

public class DefaultStaticMethodTest implements I1,I2 {
	
//	public void m1(){
//		System.out.println("Overridden Default method From DefaultStaticMethodTest class");
//	}
	
	@Override
	public void m1() {		
		I1.super.m1();
		I2.super.m1();
	}
	
	public static void main(String[] args) {
		
		new DefaultStaticMethodTest().m1();
	}

	

}
