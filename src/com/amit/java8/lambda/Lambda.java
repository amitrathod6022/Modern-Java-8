package com.amit.java8.lambda;

import java.util.Comparator;

public class Lambda {
	public static void main(String[] args) {

		// Implement Runnable using Lambda
		Runnable runnable = () -> {
			System.out.println("Implemented Runnable using Lambda Expression");
		};
		runnable.run();

		// Single line statement
		/**
		 * This below statement is only valid for the single statement For multi-line
		 * you need to have the {}
		 */
		Runnable runnable2 = () -> System.out.println("Single Line Code");
		runnable2.run();

		// Implement Comparator using lambdas
		Comparator<Integer> integerComparator1 = ((Integer o1, Integer o2) -> {
			return o1.compareTo(o2);
		});

		/**
		 * No need for return statement No need to explicity define the type of the
		 * parameter, functional interface is smart enough to identify it
		 ***/
		Comparator<Integer> integerComparator = ((o1, o2) -> o1.compareTo(o2));
		
		System.out.println(integerComparator.compare(1, 2));
	}

}
