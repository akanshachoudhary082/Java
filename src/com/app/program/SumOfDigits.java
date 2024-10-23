package com.app.program;
import java.util.Scanner;

public class SumOfDigits {
//    public static void main(String[] args) {
//        // Create a Scanner object to read input from the console
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter an integer
//        System.out.print("Enter an integer: ");
//        String numberStr = scanner.nextLine();
//
//        // Close the scanner
//        scanner.close();
//
//        // Initialize the sum
//        int sum = 0;
//
//        // Iterate through each character in the string
//        for (char c : numberStr.toCharArray()) {
//            if (Character.isDigit(c)) { // Check if the character is a digit
//                sum += Character.getNumericValue(c); // Convert char to int and add to sum
//            }
//        }
//
//        // Print the result
//        System.out.println("The sum of the digits is: " + sum);
//    }
	
	public static void main(String[] args)
	{
		int num = 2345 ;
		int sum =0;
		int rem=0;
		
		while(num !=0)
		{
			rem = num %10;
			sum = sum  + rem;
			num = num /10;
		}
		
		System.out.println(sum);
	}
}
