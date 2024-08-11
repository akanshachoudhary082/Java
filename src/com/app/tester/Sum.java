package com.app.tester;
import java.util.Scanner;

/*
 * public class Sum {
 * 
 * //sum of two numbers public static void main(String[] args) { int sum =
 * 24+36; System.out.println(sum);
 * 
 * } }
 */

public class Sum{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the frist number");
		int num1 = sc.nextInt();
		
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		 
		int sum = num1 + num2;
		
		System.out.println();
		System.out.println("Sum : "+ sum);
		
		
	}
}