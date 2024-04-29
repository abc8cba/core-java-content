package consumer.predicate.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


	public static void main(String[] args) {
		m1();
		//m2();
	}

	private static void m1() {
		Consumer<Integer> consumer = (t) -> {
			System.out.println("Consumed value: "+t);			
		};
		
		consumer.accept(100);	
		List<Integer> list = Arrays.asList(11,2,33,4);
		System.out.println("============================");
		list.stream().forEach(consumer);
		System.out.println("============================");
		list.stream().forEachOrdered(consumer);
		
	}
	
	private static void m2() {
		Consumer<Integer> consumer = t -> System.out.println("Consumed value: "+t);
		consumer.accept(200);
		System.out.println("============================");
		List<Integer> list = Arrays.asList(11,2,33,4);
		list.stream().forEach(t -> System.out.println("Consumed value: "+t));
	}

}
