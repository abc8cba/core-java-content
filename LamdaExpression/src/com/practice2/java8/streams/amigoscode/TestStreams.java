package com.practice2.java8.streams.amigoscode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStreams {
	
	static void sortPersonData(List<Person> people){
		
		List<Person> sorted = people.stream()
			.sorted(Comparator.comparing(Person::getName).reversed())
			.collect(Collectors.toList());
		
		sorted.forEach(System.out::println);	   
	}

	static void filterPersonData(List<Person> people){
		
		List<Person> females = people.stream()
			.filter(person->person.getGender().equals(Gender.FEMALE))
			.collect(Collectors.toList());
		
		females.forEach(System.out::println);
		
//		females.forEach(female-> {
//			System.out.println(female.getName()+" "+female.getAge()+"  "+female.getGender());
//		});
	}
	
	static void mapPersonData(List<Person> people){
		
	}
	
	static void maxMinPersonData(List<Person> people){
		
		people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);	
		people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
	} 
	
	static void allMatchPersonData(List<Person> people){
		
		boolean allMatch = people.stream().allMatch(person->person.getAge()>20);		
		System.out.println(allMatch);
	}
	
	static void anyMatchPersonData(List<Person> people){
		
		boolean anyMatch = people.stream().anyMatch(person->person.getName().equalsIgnoreCase("NEHA"));
		System.out.println(anyMatch);
	}
	
	static void noneMatchPersonData(List<Person> people){
		
		boolean noneMatch = people.stream().noneMatch(person->person.getName().equals("Nehaa"));
		System.out.println(noneMatch);
	}
	
	static void groupPersonData(List<Person> people){
		
	    Map<Gender,List<Person>> map =	people.stream().collect(Collectors.groupingBy(Person::getGender));
		System.out.println(map);
		map.forEach((gender, people1)->{
			System.out.println(gender);
			people1.forEach(System.out::println);
		});
	}
		

	public static void main(String[] args) {
		List<Person> people = getPeople();
//		for(Person p: people) {
//			System.out.println(p);
//		}
		
//		people.stream().forEach(System.out::println);
//		System.out.println("-----------------------------------------");
//		people.parallelStream().forEach(System.out::println);
		System.out.println("-----------------------------------------");
//		List<Person> malePersons = people
//		   .stream()
//		   //.map(p -> p.getGender().equals(Gender.MALE))
//		   .filter(p->p.getGender().equals(Gender.MALE))
//		   .collect(Collectors.toList());
		   //.forEach(System.out::println);
		
//		for(Person p: malePersons) {
//			System.out.println(p);
//		}
		
		
		people
		   .stream()
		   //.map(p -> p.getGender().equals(Gender.MALE))
		   .filter(p->p.getGender().equals(Gender.MALE))
		   .collect(Collectors.toList())
		   .forEach(System.out::println);
		
		
		
//		sortPersonData(people);
//		filterPersonData(people);
//		mapPersonData(people);
//		maxMinPersonData(people);			
	}
	
	private static List<Person> getPeople(){
		List<Person> list= new ArrayList<>();
		list.add(new Person("Raj", 21, Gender.MALE));
		list.add(new Person("Nitin", 24, Gender.MALE));
		list.add(new Person("Komal", 43, Gender.FEMALE));
		list.add(new Person("Keshav", 22, Gender.MALE));
		list.add(new Person("Bitin", 26, Gender.MALE));
		list.add(new Person("Suresh", 34, Gender.MALE));
		list.add(new Person("Ragini", 32, Gender.FEMALE));
		list.add(new Person("Neha", 29, Gender.FEMALE));
		list.add(new Person("Jojo", 28, Gender.MALE));
		list.add(new Person("Rose", 30, Gender.FEMALE));
		return list;
	}

}
