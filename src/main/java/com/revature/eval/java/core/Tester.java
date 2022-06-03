package com.revature.eval.java.core;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		
		int[] set = { 3, 5};
		System.out.println("78? " + getSumOfMultiples(20, set));
	}
	
public static int getSumOfMultiples(int i, int[] set) {
		
		//below i, multiples of nums in set 
		//for each num in set, find all multiples of the number in set that are below i 
		
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int x = 0; x < set.length; x++) {
			int num = set[x];
			int counter = 0; 
			
			while((set[x]*counter) < i) {
				counter++;	
				num = set[x] * counter;
				if(num < i)
					s.add(num);
			}
			
			//all multiples of one num in set done 
			
			System.out.println("list: " + s.toString());
		}
		//all multiples of all nums in set done 
		//sum of all the multiples now
		int sum = 0;
		for(Integer x: s)
			sum+=x;
		return sum;
	}
	
	

	
		
	
	
}
