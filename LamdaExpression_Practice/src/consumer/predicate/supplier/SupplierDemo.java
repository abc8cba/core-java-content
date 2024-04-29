package consumer.predicate.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return "Java Lamda Expression";
	}
	
	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		m4();
	}
	
	//Using Lamda expression
	private static void m4() {
		
		List<String> list = Arrays.asList(); 
		System.out.println(list.stream().findAny().orElseGet(()->"Hello World"));
	}
	
	//Using Lamda expression
	private static void m3() {
		Supplier<String> supplier = ()-> "Java Lamda Expression Practice going on..";
		System.out.println(supplier.get());
		System.out.println("=======================");
		List<String> list = Arrays.asList("raj","kumud","nilesh"); 
		System.out.println(list.stream().findAny().orElseGet(supplier));
	}
	//Using Lamda expression
	private static void m2() {
		Supplier<String> supplier = ()->{
			return "Java Lamda Expression Practice going on..";
		};
		System.out.println(supplier.get());
		System.out.println("=======================");
		List<String> list = Arrays.asList(); 
		System.out.println(list.stream().findAny().orElseGet(supplier));
	}

	//using normal way
	private static void m1() {
		Supplier<String> supplier = new SupplierDemo();
		System.out.println(supplier.get());
	}

}
