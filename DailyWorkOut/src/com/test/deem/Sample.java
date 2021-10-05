/**
 *  Deem interview question
 */
package com.test.deem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author apple
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] fruits1 = { "apple", "banana", "grape" };
		String[] fruits2 = { "banana", "grape", "guava" };

		List<String> list1 = Arrays.asList(fruits1);
		List<String> list2 = Arrays.asList(fruits2);

		for (String fruit : fruits1) {
			if (!list2.contains(fruit)) {
				System.out.print(fruit+ " ");
			}
		}

		for (String fruit : fruits2) {
			if (!list1.contains(fruit)) {
				System.out.print(fruit+ " " );
			}
		}

		/**
		 * Second method
		 */
		System.out.println();
		
		Set<String> fruitSet = new HashSet<String>();
		fruitSet.addAll(list1);
		fruitSet.addAll(list2);
		
		List<String> nondup = fruitSet.stream().filter(fruit -> (!list1.contains(fruit) ||!list2.contains(fruit)) ).collect(Collectors.toList());
		
		
		for (String fruit : nondup) {
			
				System.out.print(fruit+ " ");
			
		}
	}

}
