package com.app.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountRepeatedNumberFromFreq {

//	public static void main(String[] args) {
//		int[] arr = new int[] { 10, 30, 30, 20, 10, 20, 50, 10 };
//		int n = arr.length;
//		countFreq(arr, n);
//	}
//	static void countFreq(int arr[], int n) {
//		boolean visited[] = new boolean[n];
//
//		Arrays.fill(visited, false);
//
//		for (int i = 0; i < n; i++) {
//			if (visited[i] == true)
//				continue;
//
//			int count = 1;
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] == arr[j]) {
//					visited[j] = true;
//					count = count + 1;
//				}
//
//				
//			}
//			if (count != 1) {
//				System.out.println("Print the repeated number :" + arr[i]);
//			}
//		}
//	
//
//	}
	
	//--------------------2nd method--------------------------------
	
	public static void main(String[] args)
	{
		int[] arr = new int[]{ 10, 30, 30, 20, 10, 20, 50, 10 };
		
		int n = arr.length;
		countFreq(arr,n);
	}
	
	static void countFreq(int arr[],int n)
	{
	  Map<Integer,Integer> mp = new HashMap<>();
	  int count = 1;
	  for(int i=0;i<n;i++)
	  {
		  if(mp.containsKey(arr[i]))
		  {
			  mp.put(arr[i], mp.get(arr[i])+1);
		  }else {
			  mp.put(arr[i], 1);
		  }
	  }
	  
	  for(Map.Entry<Integer,Integer> entry : mp.entrySet())
	  {
		  if(entry.getValue()>1)
		  {
			  System.out.println(entry.getKey()+"");
		  }
	  }
	}
}
