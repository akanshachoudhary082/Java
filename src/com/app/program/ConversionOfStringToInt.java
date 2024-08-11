package com.app.program;

import java.util.Scanner;

public class ConversionOfStringToInt {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		try {
			int result = Integer.parseInt(str);
			System.out.println("the integer value is : "+result);
		}catch(NumberFormatException e){
			System.out.println("invalid input");
		}
		
	}
}

/*
 * Input: 123
 * 
 * Output: The integer value is: 123
 * 
 * Input: abc
 * 
 * Output: Invalid input! Please enter a valid integer string.
 */