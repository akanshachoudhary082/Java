package com.app.array;

public class FindMissingNumberInArray {

//	public static void main(String[] args)
//	{
//		int [] arr = {1,2,4,5};
//		
//		int n = arr.length + 1; // 4 + 1 => 5
//		int totalSum  = n * (n + 1)/2; // 5 * (5 +1)/2 => 5* 6/2=> 5 *3 => 15
//		int arrSum = 0;
//		
//		for(int num : arr)
//		{
//			arrSum = arrSum + num; // 0+1=> 1 1 +2 =>3 3+4=> 7 7 +5=>12
//		}
//		
//		System.out.println("print missing number :"+ (totalSum - arrSum)); //15-12=>3
//	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,5};
		int n = arr.length + 1; // 4 + 1 => 5
		int missingNumber = findMissingNumber(arr,n);
		
		System.out.println(missingNumber);
	}
	
	public static int findMissingNumber(int[] arr,int n)
	{
		
		int totalSum = n * (n + 1)/2; // 5 * (5 + 1)/2 => 5 * 3 = 15
		int arrSum = 0;
		
		for(int num : arr)
		{
			arrSum = arrSum + num; // 0+1=1 1+2=3 3+3=6 6+5=11
		}
		
		return totalSum - arrSum; //15-11 => 4
	}
}
