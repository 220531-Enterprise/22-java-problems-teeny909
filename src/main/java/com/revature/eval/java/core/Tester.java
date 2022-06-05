package com.revature.eval.java.core;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		LinkedList<Long> nums = (LinkedList<Long>) calculatePrimeFactorsOf(2L);
		System.out.println(nums);
	}
	
	public static List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		int number = (int)l;
		List<Long> nums = new LinkedList<>();
		for (int i = 2; i <= number; i++) {
			while (number% i == 0) {
				//System.out.println(i + " help ");
				nums.add((long) i);
				number = number / i;
			}
		}
		if (number > 2) {
			//System.out.println(number);
			nums.add((long) number);
		}
		return nums;
	}

	
		
	
	
}
