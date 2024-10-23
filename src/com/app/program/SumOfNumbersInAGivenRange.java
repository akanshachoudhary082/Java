package com.app.program;

public class SumOfNumbersInAGivenRange {

	public static void main(String [] args)
	{
		int a = 5;
		int b = 10;
		int sum =0;
		
		for(int i=a ;i<=b;i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}
