package com.app.program;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args)
	{
		System.out.println("enter the number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("number is even ");
		}else {
			System.out.println("number is not a even number");
		}
		
	}
}
