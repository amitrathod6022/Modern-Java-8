package com.amit.java8.functionalinterface.consumer;

import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class BiConsumerMain {

		public static void main(String[] args) {
			// BiConsumer interface accepts two input arguments and returns nothing
			// It has a method accept(T t, U u)
			// BiConsumer<T, U> biConsumer = (t, u) -> { System.out.println(t + " : " + u);
			// };
			// biConsumer.accept("Amit", "Kumar");

			// BiConsumer chaining
			// BiConsumer<String, String> biConsumer1 = (t, u) -> { System.out.println(t + "
			// : " + u); };
			// BiConsumer<String, String> biConsumer2 = (t, u) -> { System.out.println(t + "
			// : " + u); };
			// biConsumer1.andThen(biConsumer2).accept("Amit", "Kumar");
			
			
			BiConsumer<String, Integer> biConsumer = (name, age) -> {
				System.out.println(name + " is " + age + " years old.");
			};
			
			ObjIntConsumer<String> objIntConsumer = (name, age) -> {
				System.out.println(name + " is " + age + " years old.");
			};
			
			ObjLongConsumer<String> objLongConsumer = (name, phone) -> {
				System.out.println(name + " has phone number " + phone);
			};
			
			//Additional BiConsumer interfaces
			biConsumer.accept("Amit", 30);
            objIntConsumer.accept("Amit", 30);
			objLongConsumer.accept("Amit", 12L);
		}
}
