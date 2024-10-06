/*7.	Write a Java program to convert a decimal number to binary numbers*/

package com.app.program;

import java.util.Scanner;

public class Conversion {
//
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int decimalNumber = sc.nextInt();
//		
//		String binaryString = Integer.toBinaryString(decimalNumber);
//		
//		System.out.println("Conversion of decimal to binary :"+binaryString );
//				
//	}
	
	public static void main(String[] args)
	{
		int decimalNumber = 23;
		String binaryString = Integer.toBinaryString(decimalNumber);
		System.out.println("binary string is :"+ binaryString);
	}
}


