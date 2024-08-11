package com.app.program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two number : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
			int temp = num1 ;
			num1 = num2 ;
			num2 = temp;
		
		System.out.println("Swap the two numbers :"+ num1 + " "+ num2);
				
	}

	
}
