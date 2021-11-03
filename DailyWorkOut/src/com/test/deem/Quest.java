/**
 * 
 */
package com.test.deem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author apple
 * 
 * Finding duplicate elements from a list
 *
 */
public class Quest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		
		Predicate<Integer> frequentValue = i-> Collections.frequency(list, i)>1;
		
		Set<Integer> set = list.stream().filter(frequentValue ).collect(Collectors.toSet());
		
		System.out.println(set);
		
		
		
		//solution 2
		
		Set<Integer> temp =  new HashSet<>();
		
		Set<Integer> set2 = list.stream().filter(i-> !temp.add(i)).collect(Collectors.toSet());
		
		System.out.println(set2);

	}

}
