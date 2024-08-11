package com.app.program;

import java.util.Scanner;

public class CalculateAll {

	public static void main(String[] args) {
		int sum =0,sub = 0, mul,div,rem=0;
		System.out.println("Enter the two numbers : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//sum 
		sum = num1 + num2;
		//mul
		mul = num1 * num2;
		//sub
		sub = num1 - num2;
		//remaider
		rem = num1%num2;
		//divison
		div = num1/num2;
		
		System.out.println("Sum :"+ sum);
		System.out.println("Multiply : "+ mul);
		System.out.println("Subtraction :"+sub);
		System.out.println("Remainder :"+rem);
		System.out.println("Division :"+div);
	}
}
