package com.practice4.functional_interface.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class Employee {
	String name;
	int id;
	double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}

public class FunctionalInterfaceTest1 {

	static void methodFunction() {
		Function<Integer, Integer> i = a -> a * a;
		System.out.println(i.apply(12));

		// IntFunction<Integer> x = y->{return y*y;};
		// System.out.println(x.apply(13));

		// DoubleFunction<Double> di = d->d*4;
		// System.out.println(di.apply(4));

		// LongFunction<Object> y=x->{return ""+(x*x);};
		// System.out.println(y.apply(80));

		// ToIntFunction<String> t = m->m.length();
		// int val = t.applyAsInt(109+"");
		// System.out.println(val);

		// ToLongFunction<String> t2 = m->m.length();
		// long val2 = t2.applyAsLong(109+"");
		// System.out.println(val2);

		// LongToDoubleFunction ltdf = n->n*n;
		// double d = ltdf.applyAsDouble(8);
		// System.out.println("Double value: "+d);

		// IntToDoubleFunction itdf = n->n+n;
		// double d2 = itdf.applyAsDouble(20);
		// System.out.println(d2);
	}

	static void methodBiFunction() {
		ToIntBiFunction<String, Integer> i = (x, y) -> x.length() * y;
		System.out.println(i.applyAsInt("2000", 30));

		ToDoubleBiFunction<String, String> t = (x, y) -> x.length() + y.length();
		System.out.println(t.applyAsDouble("Sandeep", "Singh"));
	}

	static void methodPredicate() {
		// Predicate<String> p1 = p->p.length()>4;
		// System.out.println(p1.test("Raj"));
		// System.out.println(p1.test("Nilesh"));

		DoublePredicate dp = db -> db > 100.7;
		System.out.println(dp.test(80));

		IntPredicate i = ip -> ip % 2 == 0;
		System.out.println(i.test(23));
		System.out.println(i.test(100));
		System.out.println(i.negate().test(4));

	}

	static void methodBiPredicate() {
		BiPredicate<String, Integer> bp = (m, n) -> m.length() - n > 0;
		System.out.println(bp.test("Sandeep", 4));
	}

	static void methodConsumer() {
		Consumer<String> s = s1 -> {System.out.println("Length of given string  = " + s1.length());	};
		s.accept("Raj");

		IntConsumer i = a -> System.out.println("Square of given number = " + a * a);
		i.accept(20);

		DoubleConsumer d = a -> System.out.println("Square root of given number = " + Math.sqrt(a));
		d.accept(2);

		List<Employee> list = Arrays.asList(
				new Employee("Sandeep",101,45000),
				new Employee("Mohan",101,4000),
				new Employee("Neha",101,25000)); 
		
		DoubleConsumer d2 = increment -> {
			System.out.println();
			for(Employee e: list){
				System.out.println(e.name+ " Salary before Increment: "+e.getSalary());
				e.salary = e.salary + increment;
				System.out.println(e.name+ " Salary After Increment: "+e.getSalary());
				System.out.println();
			}			
		};

		d2.accept(5000);
	}

	static void methodBiConsumer() {

		List<Employee> list = Arrays.asList(
				new Employee("Sandeep",101,45000),
				new Employee("Mohan",101,4000),
				new Employee("Neha",101,25000));
		
		BiConsumer<String, Double> bc = (s,d)->{
			for(Employee e: list){
				System.out.println(e.name+ " Salary before Increment: "+e.getSalary());
				e.salary = e.salary + d;
				System.out.println(s+" "+e.name+ " Salary After Increment: "+e.getSalary());
				System.out.println();
			}
		};
		
		bc.accept("Mr.", 7000.0);
	}
	
	static void methodObjIntConsumer() {
		Employee emp = new Employee("Raj", 102, 5000);
		ObjIntConsumer<Employee> obj = (e,s)->{
			System.out.println("Before Modification of salary : "+emp);
			e.salary = e.getSalary()+s;
			System.out.println("After Modifcation of salary : "+emp);
		};
		
		obj.accept(emp, 4000);
	}
	
	static void methodSupplier() {
		Supplier<Integer> sp = ()->{
			String s = "Ram";
			return s.length();
		};
		
		System.out.println(sp.get());
		
		IntSupplier sp2 = ()->{
			String s = "Naveen";
			return s.length();
		};
			
		System.out.println(sp2.getAsInt());
		
		BooleanSupplier sp3 = ()->{
			String s = "Neha";
			return s.length()>5;
		};
		
		System.out.println(sp3.getAsBoolean());
	}
	
	

	public static void main(String[] args) {
		// methodFunction();
		// methodBiFunction();

		// methodPredicate();
		// methodBiPredicate();

		//methodConsumer();
		//methodBiConsumer();
		//methodObjIntConsumer();
		
		methodSupplier();

	}

}
