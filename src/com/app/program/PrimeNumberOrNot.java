package com.app.program;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String [] args)
	{
		System.out.println("enter the number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println("Prime number");
		}else {
			System.out.println("not prime");
		}
	}
	
	//========================Print prime numner i to 100===========================
	
//	public static void main(String [] args)
//	{
//		int n=100;
//		
//		for(int i=2;i<=100;i++)
//		{
//			if(isPrime(i))
//			{
//				System.out.println(i + " ");
//			}
//			
//		}
//	}
//	
//	public static boolean isPrime(int n)
//	{
//		if(n <=1)
//		{
//			return false;
//		}
//		
//		for(int i=2;i<=Math.sqrt(n);i++)
//		{
//			if(n%i==0)
//			{
//				return false;
//			}
//		}
//	
//	
//	return true;
//}
}
