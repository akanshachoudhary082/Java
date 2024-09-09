package com.app.program;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args)
	{
		//int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();
		int rev = 0;
		int sum =0;
		while(num!=0)
		{
			rev = rev * 10 + num%10;
			num = num/10;
		}
		System.out.println("rrev number is :"+rev);
	}

}
