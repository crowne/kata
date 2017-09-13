package com.crowlines.kata;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {

	private static final int bit3     = 0b00000100;
	private static final int bit7     = 0b01000000;
	private static final int bit3and7 = bit3 | bit7;
	
	public String echo(int number) {
		int mod3 = (number % 3 == 0) ? bit3 : 0;
		int mod7 = (number % 7 == 0) ? bit7 : 0;
		int mods = mod3 | mod7;
		String result = null;
		
		switch (mods) {
		case bit3:
			result = "Fizz";
			break;

		case bit7:
			result = "Buzz";
			break;

		case bit3and7:
			result = "FizzBuzz";
			break;

		default:
			result = Integer.toString(number) ;
			break;
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {

		System.out.println("Please enter a number, or type done to quit:");
		
	    Scanner scanner = new Scanner(System.in);
		boolean isFinished = false;
	    int number = 0;
	    FizzBuzz fb = new FizzBuzz();
	    String result = null;
	    
	    while (!isFinished) {
	    	try {
				number = scanner.nextInt();
				result = fb.echo(number);
				System.out.println(number + " : " + result);
			} catch (InputMismatchException e) {
				isFinished = true;
			}
	    }
	    
	    scanner.close();
	    System.out.println("Thanks for playing!");
	}
	
}
