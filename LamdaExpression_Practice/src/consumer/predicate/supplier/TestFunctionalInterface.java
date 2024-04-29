package consumer.predicate.supplier;

import java.util.function.Function;

public class TestFunctionalInterface{

	public static void main(String[] args) {
		Function<Integer, Integer> f= m->m*m; 
		System.out.println("Result = "+f.apply(20));

	}

}
