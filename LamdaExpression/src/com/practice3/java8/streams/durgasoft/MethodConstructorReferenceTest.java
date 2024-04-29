package com.practice3.java8.streams.durgasoft;

interface MyInterf {
	void add(int a, int b);
}

class Emp {
	String name;
	int id;
	double salary;

	public Emp() {
		System.out.println("No argument");
	}

	public Emp(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		System.out.println("3 Argument");
	}

	public Emp(String name, double salary) {
		this.name = name;
		this.salary = salary;
		System.out.println(name + "  " + salary);
		System.out.println("2 Argument");
	}
}

interface EmpInterf {
	// Emp getInfo();
	Emp getInfo(String name, double salary);
}

public class MethodConstructorReferenceTest {

	static void m1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread: " + i);
		}
	}

	static void m2() {
		Runnable r = MethodConstructorReferenceTest::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread: " + i);
		}
	}

	public static void sum(int x, int y) {
		System.out.println("Sum = " + (x + y));
	}

	static void m3() {
		// Using method reference
		MyInterf i = MethodConstructorReferenceTest::sum;
		i.add(100, 200);
		// Using Lamda expression

		MyInterf i2 = (p, q) -> System.out.println("Addition result = " + (p + q));
		i2.add(12, 18);
	}

	static void m4() {
		EmpInterf ei = Emp::new;
		ei.getInfo("Raj", 23000);

	}

	public static void main(String[] args) {
		// m2();
		// m3();
		m4();

	}

}
