package com.revature.eval.java.core;

public class Tester {
	public static void main(String[] args) {
		System.out.println(toMilesPerHour(430));
	}

	public static long toMilesPerHour(double kilometersPerHour) {
		// TODO Write an implementation for this method declaration
		
		//check if params is less than 0, if so return -1 
		//else, calc mph round and return 
		
		
		//find out formula to convert kph to mph, then return 
		
		if(kilometersPerHour < 0 )
			return -1;
		else {
			long mph = Math.round(kilometersPerHour/ 1.609); 
			return mph;
		}
		
	}
}
