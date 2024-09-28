package com.app.array;

public class ArrayMadeEqual {

	public static void main(String [] args)
	{
		int [] arr = {50,100,75};
		int n = arr.length;
		
		if(isArrayEqual(arr,n)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}
	
	public static boolean isArrayEqual(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			while(arr[i] % 2== 0)
			{
				arr[i] = arr[i] /2;
				
			}
			
			while(arr[i] % 3 == 0)
			{
				arr[i] = arr[i] /3;
			}
		
		}
		
		for (int i=0;i<n;i++)
		{
			if(arr[i] != arr[0]) {
				return false;
			}
		}
		return true;
		
	}
}
