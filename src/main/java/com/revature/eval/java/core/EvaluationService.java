package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class EvaluationService {

	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration

			// check if params is less than 0, if so return -1
			// else, calc mph round and return

			// find out formula to convert kph to mph, then return

			if (kilometersPerHour < 0)
				return -1;
			else {
				long mph = Math.round(kilometersPerHour / 1.609);
				return mph;
			}

		}

		/**
		 * 1.B Speed Converter - Print Conversion
		 * 
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
		public static String printConversion(double kilometersPerHour) {
			// TODO Write an implementation for this method declaration
			String s = "";
			if (kilometersPerHour < 0)
				s = "Invalid Value";
			else {
				long mph = toMilesPerHour(kilometersPerHour);
				// we have both, now return str
				s = kilometersPerHour + " km/h = " + mph + " mi/h";
			}

			return s;

		}
	}

	/**
	 * 2. MegaBytes and KiloBytes
	 * 
	 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
	 * int with the name kiloBytes.
	 * 
	 * The method should return a String and it needs to calculate the megabytes and
	 * remaining kilobytes from the kilobytes parameter.
	 * 
	 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
	 * 
	 * XX represents the original value kiloBytes. YY represents the calculated
	 * megabytes. ZZ represents the calculated remaining kilobytes.
	 * 
	 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
	 * = 2 MB and 452 KB"
	 * 
	 * If the parameter kiloBytes is less than 0 then print the text "Invalid
	 * Value".
	 */
	public String printMegaBytesAndKiloBytes(int XX) {
		if (XX < 0)
			return "Invalid Value";
		else {
			int mb = 0;
			int remKb = 0;

			mb = XX / 1024;
			remKb = XX % 1024;

			String str = XX + " KB = " + mb + " MB and " + remKb + " KB";
			return str;

		}

	}

	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		// TODO Write an implementation for this method declaration
		if (hourOfDay > 23 || hourOfDay < 0)
			return false;
		else if ((hourOfDay < 8 || hourOfDay > 22) && isBarking) {
			return true;
		}

		return false;
	}

	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 */
	public boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		// TODO Write an implementation for this method declaration
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.DOWN);
		String str1 = df.format(firstNum);
		String str2 = df.format(secondNum);

		if (str1.equals(str2))
			return true;
		return false;
	}

	/**
	 * 5. Teen Number Checker
	 * 
	 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
	 * Write a method named hasTeen with 3 parameters of type int.
	 * 
	 * The method should return boolean and it needs to return true if ONE of the
	 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
	 * false.
	 */
	static class TeenNumberChecker {

		public static boolean hasTeen(int x, int y, int z) {
			if (isTeen(x) || isTeen(y) || isTeen(z))
				return true;
			return false;
		}

		// We can initialize isTeen method first
		// Then pass the parameter to hasTeen method

		public static boolean isTeen(int number) {
			// TODO Write an implementation for this method declaration
			if (number >= 13 && number <= 19)
				return true;
			return false;
		}
	}

	/**
	 * 6. Minutes To Years and Days Calculator
	 * 
	 * Write a method printYearsAndDays with parameter of type long named minutes.
	 * The method should not return anything (void) and it needs to calculate the
	 * years and days from the minutes parameter.
	 * 
	 * If the parameter is less than 0, print text "Invalid Value".
	 * 
	 * Otherwise, if the parameter is valid then it needs to print a message in the
	 * format "XX min = YY y and ZZ d".
	 * 
	 * XX represents the original value minutes. YY represents the calculated years.
	 * ZZ represents the calculated days.
	 */
	public String printYearsAndDays(long minutes) {
		// TODO Write an implementation for this method declaration
		if (minutes < 0)
			return "Invalid Value";
		long YY = minutes / 525600;
		long mod = minutes % 525600;
		long ZZ = mod / 1440;
		return minutes + " min = " + YY + " y and " + ZZ + " d";

	}

	/**
	 * 7. Number In Word
	 * 
	 * Write a method called printNumberInWord. The method has one parameter number
	 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
	 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
	 * for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */
	public String printNumberInWord(int number) {
		// TODO Write an implementation for this method declaration
		switch (number) {
		case 0:
			return "ZERO";
		case 1:
			return "ONE";
		case 2:
			return "TWO";
		case 3:
			return "THREE";
		case 4:
			return "FOUR";
		case 5:
			return "FIVE";
		case 6:
			return "SIX";
		case 7:
			return "SEVEN";
		case 8:
			return "EIGHT";
		case 9:
			return "NINE";
		default:
			return "OTHER";
		}

	}

	/**
	 * 8. Greatest Common Divisor
	 * 
	 * Write a method named getGreatestCommonDivisor with two parameters of type int
	 * named first and second.
	 * 
	 * If one of the parameters is < 10, the method should return -1 to indicate an
	 * invalid value. The method should return the greatest common divisor of the
	 * two numbers (int).
	 * 
	 * The greatest common divisor is the largest positive integer that can fully
	 * divide each of the integers (i.e. without leaving a remainder).
	 * 
	 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12 30 can be
	 * divided by 1, 2, 3, 5, 6, 10, 15, 30
	 * 
	 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
	 * and there is no resulting remainder.
	 */
	public int getGreatestCommonDivisor(int first, int second) {
		// TODO Write an implementation for this method declaration
		int gcd = 1;
		if (first < 10 || second < 10)
			return -1;
		for (int i = 1; i <= first && i <= second; i++) {
			if (first % i == 0 && second % i == 0)
				gcd = i;
		}
		return gcd;
	}

	/**
	 * 9. First and Last Digit Sum
	 * 
	 * Write a method named sumFirstAndLastDigit with one parameter of type int
	 * called number.
	 * 
	 * The method needs to find the first and the last digit of the parameter number
	 * passed to the method, using a loop and return the sum of the first and the
	 * last digit of that number.
	 * 
	 * If the number is negative then the method needs to return -1 to indicate an
	 * invalid value.
	 */
	public int sumFirstAndLastDigit(int num) {
		// TODO Write an implementation for this method declaration
		int n = num;
		if (num < 0)
			return -1;
		int last = (num % 10);
		while (n >= 10)
			n /= 10;

		return last + n;
	}

	/**
	 * 10. Reverse String
	 * 
	 * Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 */

	// DONE
	public String reverse(String string) {
		// TODO Write an implementation for this method declaration
		String str = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			str += string.charAt(i);
		}
		return str;
	}

	/**
	 * 11. Acronyms
	 * 
	 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 */
	public String acronym(String phrase) {
		String[] strArr = phrase.split(" ");

		String acr = "";
		for (String str : strArr) {
			// resolve dashes

			if (str.contains("-")) {
				String[] dashArr = str.split("-");
				for (String s : dashArr)
					acr += s.toUpperCase().charAt(0);
			} else {
				acr += str.toUpperCase().charAt(0);
			}

		}

		return acr;
	}

	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			return ((this.getSideOne() == this.getSideTwo()) && this.getSideTwo() == this.getSideThree());

		}

		public boolean isIsosceles() {
			return ((this.getSideOne() == this.getSideTwo()) || this.getSideTwo() == this.getSideThree()
					|| this.getSideOne() == this.getSideThree());
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			return ((this.getSideOne() != this.getSideTwo()) && this.getSideTwo() != this.getSideThree());
		}

	}

	/**
	 * 13. Scrabble Score
	 * 
	 * Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		int pts = 0;
		string = string.toUpperCase();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == 'G' || ch == 'D')
				pts += 2;
			else if (ch == 'B' || ch == 'C' || ch == 'M' || ch == 'P')
				pts += 3;
			else if (ch == 'F' || ch == 'H' || ch == 'V' || ch == 'W' || ch == 'Y')
				pts += 4;
			else if (ch == 'K')
				pts += 5;
			else if (ch == 'J' || ch == 'X')
				pts += 8;
			else if (ch == 'Z' || ch == 'Q')
				pts += 10;
			else
				pts += 1;
		}
		return pts;

	}

	/**
	 * 14. Clean the Phone Number
	 * 
	 * Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// remove all non-numeric characters via regex / replace all
		String s = string.replaceAll("[^0-9]", "");
		// if invalid throw illegal arg except
		if (s.length() != 10)
			throw new IllegalArgumentException();
		// remove 1 if first one
		if (s.charAt(0) == '1')
			s = s.substring(1);
		return s;
	}

	/**
	 * 15. Recurring Word Counter
	 * 
	 * Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration

		Map<String, Integer> wc = new HashMap<String, Integer>();

		String string1 = string.replaceAll("\\n", "");// replace all newlines w nothing
		String[] str = string1.split("[^a-zA-Z0-9]");// split anything that isnt part of a word (whitepsace, commas,
														// etc)
		// now that we have list, insert
		for (String s : str) {
			// if present, incrmeent val
			// else, put new pair, occurs 1
			if (wc.containsKey(s))
				wc.put(s, (wc.get(s) + 1));
			else
				wc.put(s, 1);
		}

		return wc;
	}

	/**
	 * 16. Armstrong Number
	 * 
	 * An Armstrong number is a number that is the sum of its own digits each raised
	 * to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 */
	public boolean isArmstrongNumber(int input) {

		if ((input % 10) == input)
			return true;
		// string it
		// add each (digit^num of digits) to list, sum list
		ArrayList<Integer> list = new ArrayList<Integer>();
		String num = String.valueOf(input);
		char[] digits = num.toCharArray();

		for (char c : digits) {
			int digit = Integer.parseInt(String.valueOf(c)); // cast back to int

			// now we can do it
			int val = (int) Math.pow(digit, digits.length);
			list.add(val);

		}
		int sum = 0;
		for (Integer i : list)
			sum += i;
		if (sum == input)
			return true;

		return false;
	}

	/**
	 * 17. Prime Factors
	 * 
	 * Compute the prime factors of a given natural number. A prime number is only
	 * evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 */

	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		int number = (int) l;
		List<Long> nums = new LinkedList<>();
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				// System.out.println(i + " help ");
				nums.add((long) i);
				number = number / i;
			}
		}
		if (number > 2) {
			// System.out.println(number);
			nums.add((long) number);
		}
		return nums;
	}

	/**
	 * 18. Calculate Nth Prime
	 * 
	 * Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 */
	//checks if a num is prime 
	public static boolean isPrime(int n) {
		if(n <= 1)
			return false;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
			
		}
		return true;
	}
	public int calculateNthPrime(int k) {
		if(k < 1)
			throw new IllegalArgumentException();
		if(k==1)
			return 2;
		int i = 1;
		int count = 1;
		//run until we find kth prime 
		//count != k
		while(count != k) {
			//all evens are NOT prime, check only odds 
			i+=2;
			if(isPrime(i))
				count++;
			
		}
		return i;
		
	}

	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: ?????? ????????????, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */
	public boolean isPangram(String string) {
		String str = string.toLowerCase();
		str = str.replace(" ", "");

		// casting char->int gives ascii code
		// use it w respect to 'a' and we get ez encoding
		boolean[] present = new boolean[26]; // 26 letters in alphabet

		// for each letter in our string, mark it if it is present
		// a -> present[0]
		// z -> present[25]
		for (int i = 0; i < str.length(); i++) {
			int letter = str.charAt(i) - 'a';
			present[letter] = true;
		}
		// for every letter in the word, if it is present we marked it as true
		// if it is not present, defaulted to false so it is flagged in the next bit

		// now for every letter in alphabet, if current char is not present in string,
		// return false otherwise true
		for (int i = 0; i < 26; i++) {
			if (!present[i])
				return false;
		}
		return true;

	}

	/**
	 * 20. Sum of Multiples
	 * 
	 * Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 */
	public int getSumOfMultiples(int i, int[] set) {

		// below i, multiples of nums in set
		// for each num in set, find all multiples of the number in set that are below i
		ArrayList<Integer> arr = new ArrayList<Integer>();

		// below i, multiples of nums in set
		// for each num in set, find all multiples of the number in set that are below i

		Set<Integer> s = new HashSet<Integer>();

		for (int x = 0; x < set.length; x++) {
			int num = set[x];
			int counter = 0;

			while ((set[x] * counter) < i) {
				counter++;
				num = set[x] * counter;
				if (num < i)
					s.add(num);
			}
			// all multiples of one num in set done

		}
		// all multiples of all nums in set done
		// sum of all the multiples now
		int sum = 0;
		for (Integer x : s)
			sum += x;
		return sum;
	}

	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas. Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random
	 * class.
	 */

	public int[] threeLuckyNumbers() {
		Random r = new Random();
		int[] nums = r.ints(3, 1, 101).toArray();

		int[] ret = { nums[0], nums[1], nums[2] };
		return ret;
	}

	/*
	 * 22. Easy Guessing Game
	 * 
	 * Create a program to generate a number between the given range: int x =
	 * minimum iny y = maximum (inclusive)
	 * 
	 * You must use the Math.random class to generate a random number between x and
	 * y.
	 */

	public int guessingGame(int x, int y) {
		return (int) ((Math.random() * (y - x)) + 1);

	}
}
