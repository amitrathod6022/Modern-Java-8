package com.amit.java8.functionalinterface.predicate;

import java.util.function.BiPredicate;

public class BiPredicateClass {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp = (a, b) -> a > b;
		System.out.println(bp.test(10, 20));
		
		BiPredicate<Integer, Integer> bp1 = (a, b) -> (a+b) < 100;
		
		System.out.println(bp.and(bp1).test(10, 20));
		System.out.println(bp.or(bp1).test(10, 20));
		System.out.println(bp.negate().test(10, 20));
		System.out.println(bp.and(bp1.negate()).test(10, 20));
	}
}
