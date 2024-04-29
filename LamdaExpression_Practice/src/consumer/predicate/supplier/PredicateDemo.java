package consumer.predicate.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// m1();//Normal way
		//m2();// Using Lamda expression
		 m3();//Using Lamda expression
	}

	private static void m3() {
		Predicate<Integer> predicate = t ->t % 2 == 0;
		
		System.out.println(predicate.test(13));
		List<Integer> list = Arrays.asList(11, 2, 33, 4);
		System.out.println("============================");
		list.stream().filter(t-> t%2 == 0).forEach(x -> System.out.println("Even: " + x));
	}

	private static void m2() {
		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0)
				return true;
			else
				return false;
		};

		System.out.println(predicate.test(10));
		List<Integer> list = Arrays.asList(11, 2, 33, 4);
		System.out.println("============================");
		list.stream().filter(predicate).forEach(x -> System.out.println("Even: " + x));

	}

	private static void m1() {
		Predicate<Integer> predicate = new PredicateDemo();
		System.out.println(predicate.test(13));
	}
}
