package com.practice3.java8.streams.durgasoft;

import java.util.function.Consumer;

class Movie{
	String name;

	public Movie(String name) {
		this.name = name;
	}
	
}

public class ConsumerTest {

	static void m1(){
		Consumer<Movie> c1 = m->System.out.println(m.name+ " is ready to release");
		Consumer<Movie> c2 = m->System.out.println("It is based on true story");
		Consumer<Movie> c3 = m->System.out.println("It will be super hit");
		Consumer<Movie> c4 = m->System.out.println("It emphasizes to women empowerment");
		
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3).andThen(c4);
		cc.accept(new Movie("Lazza"));
	}
	
	public static void main(String[] args) {
		m1();

	}

}
