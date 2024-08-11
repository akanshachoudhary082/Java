/*8.	Write a Java program to convert a binary number to decimal number*/

package com.app.program;

import java.util.Scanner;

public class Conversion2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the binary number : ");
		String binaryString  = sc.nextLine();
		
		int decimalNumber = Integer.parseInt(binaryString,2);
		System.out.println("Converion of binary to decimal :"+decimalNumber);
	}
}
