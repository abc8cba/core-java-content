package com.self.practice1.streams;

public class Human {

	private String name;
	private int age;
	private Gender gender;

	public Human(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Human [firstName=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
