package com.self.practice1.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String[] args) {
		List<Human> humanList = getHumans();
		
		//humanList.stream().forEach(System.out::println);
		
		List<Human> listFemales = humanList.stream()
		.filter(human->human.getGender().equals(Gender.FEMALE))
		.collect(Collectors.toList());
		
		//listFemales.stream().forEach(System.out::println);
		
		List<Human> sortedList = humanList.stream()
				.sorted(Comparator.comparing(Human::getName).reversed())
				.collect(Collectors.toList());
		
		//sortedList.forEach(System.out::println);
		
		humanList.stream().max(Comparator.comparing(Human::getAge)).ifPresent(System.out::println);
		humanList.stream().min(Comparator.comparing(Human::getAge)).ifPresent(System.out::println);
	}
	
	static List<Human> getHumans(){
		List<Human> list = new ArrayList<Human>();
		list.add(new Human("Raj", 34, Gender.MALE));
		list.add(new Human("Komal", 24, Gender.FEMALE));
		list.add(new Human("Niharika", 44, Gender.FEMALE));
		list.add(new Human("Harish", 32, Gender.MALE));
		list.add(new Human("Mukul", 28, Gender.MALE));
		list.add(new Human("Hemant", 26, Gender.MALE));
		list.add(new Human("Saurabh", 54, Gender.MALE));
		list.add(new Human("Neha", 20, Gender.FEMALE));
		list.add(new Human("Sanjay", 38, Gender.MALE));
		return list;
	}
}
