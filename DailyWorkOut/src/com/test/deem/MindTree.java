/**
 * 
 */
package com.test.deem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author apple
 *
 */
public class MindTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e1 = new Employee(100, "test");
		Employee e2 = new Employee(100, "play");
		Employee e3 = new Employee(100, "rum");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1.equals(e2));
		
		
		List ls = List.of("ello","man","owl","apple");
		
		ls.stream().sorted().forEach(System.out::println);
		
		List<Employee> ls1 = new ArrayList<>();
		
		ls1.add(new Employee(1, "test"));
		ls1.add(new Employee(2, "play"));
		ls1.add(new Employee(3, "rum"));
		
		Collections.sort(ls1,new NameCompare());
		
		ls1.forEach(e-> System.out.println(e.getId()));

	}

}
