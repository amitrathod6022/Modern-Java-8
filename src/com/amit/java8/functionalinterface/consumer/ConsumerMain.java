package com.amit.java8.functionalinterface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

import com.amit.java8.db.StudentDB;
import com.amit.java8.dto.Student;

public class ConsumerMain {

	static Consumer<Student> c1 = (student) -> System.out.println(student.getName());
	static Consumer<Student> c2 = (student) -> System.out.print(student.getAge());

	static void getStudentsWithAge(int age) {
		List<Student> students = StudentDB.getStudents();
		students.forEach(student -> {
			if (student.getAge() == age) {
				// consumer chaining method andThen()
				c1.andThen(c2).accept(student);
			}
		});
	}

	public static void main(String[] args) {

		// Consumer interface accepts an input and returns nothing
		Consumer<String> stringConsumer = (s) -> {
			System.out.println(s.toUpperCase());
		};
		// accept method is called
		stringConsumer.accept("Amit");

		// Consumer chaining
		getStudentsWithAge(21);

		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);

		Consumer<List<Integer>> modifyList = (list) -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) * 2);
			}
		};

		Consumer<List<Integer>> printList = (list) -> {
			list.forEach(System.out::println);
		};
		// consumerChaining
		modifyList.andThen(printList).accept(intList);

		/**
		 * DoubleConsumer, IntConsumer, LongConsumer These are specialized Consumer
		 * interfaces for double, int and long data types They have a method
		 * accept(double, int, long) respectively
		 */
		DoubleConsumer doubleConsumer = (d) -> System.out.println("Double value is: " + d);
		IntConsumer intConsumer = (i) -> System.out.println("Int value is: " + i);
		LongConsumer longConsumer = (l) -> System.out.println("Long value is: " + l);

		doubleConsumer.accept(10.5);
		intConsumer.accept(10);
		longConsumer.accept(1000000000);
	}
}
