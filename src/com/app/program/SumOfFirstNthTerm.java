package com.app.program;

public class SumOfFirstNthTerm {

//	public static void main(String [] args)
//	{
//		int n = 10;
//		System.out.println("sum of natural number :"+ n*(n+1)/2);
//	}
	
	
	//------------------2nd method using for loop 
	
	public static void main(String [] args)
	{
		int num = 10;
		int sum =0;
		for(int i=1;i<=num;i++)
		{
			sum = sum + i;
		}
		
		System.out.println("sum of natural number is :"+ sum);
	}
}
