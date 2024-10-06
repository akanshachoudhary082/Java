package com.app.array;

import java.util.Arrays;
//import java.util.HashMap;

public class FreqOfElementOfArray {
	
	
//	public static void main(String[] args)
//	{
//		int[] arr = {12,14,13,12,4,6,4};
//		HashMap<Integer,Integer> map = new HashMap<>();
//		
//		for(int num : arr)
//		{
//			map.put(num, map.getOrDefault(num,0)+1);
//		}
//		
//		for(int key : map.keySet())
//		{
//			System.out.println("Element: "+ key +","+" Frequency:"+ map.get(key));
//		}
//	}
	
	public static void main(String[] args)
	{
		int [] arr = {12,14,13,12,4,6,4};
		int n = arr.length;
		countArrayFreq(arr,n);
	}
	
	 static void countArrayFreq(int arr[] ,int n)
	{
		boolean visited[] = new boolean [n];
		Arrays.fill(visited, false);
		
		for(int i=0;i<n;i++)
		{
			if(visited[i] ==true)
			  continue;
			
			int count = 1;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					visited[j] = true;
					count = count + 1;
				}
			}
			System.out.println("array :"+ arr[i] + " "+ "frequency :"+ count);
		}
		
		
	}
}
