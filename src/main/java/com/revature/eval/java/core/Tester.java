package com.revature.eval.java.core;

import java.text.DecimalFormat;

public class Tester {
	public static void main(String[] args) {
		System.out.println(toMilesPerHour(430));
		
		areEqualByThreeDecimalPlaces(-3.1756, -3.175);
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
	public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		// TODO Write an implementation for this method declaration
		
		DecimalFormat df = new DecimalFormat("#.###");
		
		String str1 = df.format(firstNum);
		String str2 = df.format(secondNum);
		
		System.out.println("fround: " + str1);
		System.out.println("sround"+str2);
		if(str1.equals(str2))
			return true;
		return false;
	}
	
	
}
