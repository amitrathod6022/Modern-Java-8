package com.amit.java8.dto;

public class Student {
	private String name;
	private int age;
	private String className;
	private double grade;

	public Student(String name, int age, String className, double grade) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
		this.grade = grade;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", className=" + className + ", grade=" + grade + "]";
	}
	
}
