package com.amit.java8.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

import com.amit.java8.db.StudentDB;
import com.amit.java8.dto.Student;

public class PredicateClass {

	public static void main(String[] args) {
		/**
		 * Predicate interface accepts an input and returns a boolean value It has a
		 * method test(T t)
		 * 
		 */
		Predicate<Integer> p1 = (i) -> i > 100;
		System.out.println(p1.test(200));

		Predicate<String> p2 = (s) -> s.length() > 5;
		Predicate<String> p3 = (s) -> s.startsWith("A");

		// Logical AND
		System.out.println(p2.and(p3).test("Amit"));

		// Logical OR
		System.out.println(p2.or(p3).test("Amit"));

		/**
		 * Logical Negate It returns the opposite of the predicate
		 * 
		 */
		System.out.println(p2.negate().test("Amit"));
		
		//Predicate Chaining negate
		System.out.println(p2.and(p3.negate()).test("Amit"));
		System.out.println(p2.and(p3).negate().test("Amit"));
		System.out.println(p2.negate().and(p3.negate()).test("Amit"));
		
		// Predicate with a function
		Predicate<String> p4 = (s) -> s.length() < 5;
		testWithPredicate(p4, "Amit");
		// Predicate with a function as a lambda expression
		testWithPredicate(s -> s.length() > 100, "Amit Kumar");

		List<Student> students = StudentDB.getStudents();
		Predicate <Student> p5 = s -> s.getGrade() > 3.8;
		// Predicate with Collections
		// Filter out students with grade less than 3.8
		students.stream().filter(s -> s.getGrade() > 3.8).forEach(System.out::println);
		List<Student> highGradeStudents = new ArrayList<>();
		
		students.forEach(s -> {
			if(p5.test(s)) {
				 highGradeStudents.add(s);
			}
			
		});
		
		//Simple with stream
		List<Student> highGradeStudents2 = students.stream().filter(p5).toList();
		System.out.println(highGradeStudents);
		System.out.println(highGradeStudents2);
		
		
		IntPredicate p6 = i -> i > 100;
		LongPredicate p7 = l -> l > 100L;
		DoublePredicate p8 = d -> d > 100.0;
		
	}

	/**
	 * This method is used to test the Predicate
	 * 
	 * @param p Predicate passed as an argument to a function
	 * @param s
	 * @return boolean value
	 */
	private static boolean testWithPredicate(Predicate<String> p, String s) {
		return p.test(s);

	}
}
