package com.test.deem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author nao jinguji
 *
 */
public class Wipro {

	public static void main(String[] args) {
//		List<Integer> input = List.of(2,1,2,2,2,3,4,2);
//		List<Integer> input = Arrays.asList(arr);
//		int toMove = 2;
		/*
		List<Integer> output = new ArrayList(input.size());
		for(int i :input) {
			if(i!=toMove) {
				output.add(i);
			}
		}
		int len = input.size() -output.size();
		for(int i =0; i<len; i++ ) {
			output.add(toMove);
		}
		
		System.out.println(output);
		System.out.println("------------"); */
		
		int[] input = {2,1,2,2,2,3,4,2};
		int toMove = 2;
		int ptr = 0;
		for(int i =0; i<input.length; i++ ) {
			int value = input[i];
			if(value!=toMove) {
				input[ptr] = value;
				input[i] = toMove;
				ptr++;
			}
		}
		for(int i =0; i<input.length; i++ ) {
			System.out.print(input[i]);
		}
	}

}
