package com.app.program;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int  sum = 0;
		System.out.println("enter the numbers :");
		int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("sum is "+ sum);
	}

}
