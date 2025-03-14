package com.amit.java8.functionalinterface.function;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionClass {
	public static void main(String[] args) {
		/**
		 * Function interface accepts an input and returns a result It has a method
		 * apply(T t)
		 * return type is R
		 */
		String name1 = "Amit";
		Function<String, Integer> wordCount = (name) -> name.length();
		System.out.print(wordCount.apply(name1));
		
		
		ToIntFunction<String> toInt = (name) -> name.length();
		System.out.println(toInt.applyAsInt(name1));
		
		Function<Integer, String> square = (a) -> "Name";
		//First wordcount will execute and then square will execute
		System.out.println(wordCount.andThen(square).apply(name1));
		
		//First wordcount will execute and then square will execute
		System.out.println(square.compose(wordCount).apply(name1));
		
		Function<String, String> identity = Function.identity();
		System.out.println(identity.apply("Amit"));
		
	}
}
