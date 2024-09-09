package com.app.program;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int r = 0;
		int sum =0;
		int temp = n ;
		
		while(n!=0)
		{
			r = n %10;
			sum = (sum * 10)+ r;
			n = n/10;
		}
		
		if(temp == sum )
		{
			System.out.println("it is a paindrome");
		}else {
			System.out.println("it is not a paildrome");
		}
	}
}
