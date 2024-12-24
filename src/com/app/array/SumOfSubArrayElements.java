package com.app.array;

public class SumOfSubArrayElements {

	public static void main(String[] args)
	{
		int [] arr = {10,30,29,30};
		
		int n = arr.length;
		int sum = 0;
		
		int start = 1;
		int end = 3;
		
		for(int i = start ;i<=end;i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
	}
}
