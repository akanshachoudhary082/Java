package com.app.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesElements {

//	public static void main(String[] args)
//	{
//		int[] arr = {10,20,20,30,30,40,40,50,50,60};
//		int n = arr.length;
//		//Arrays.sort(arr); it does not work in hashset so we have to use treeset to sert the elements
//		Set hashSet = new HashSet();
//		for(int i=0;i<n;i++)
//		{
//			hashSet.add(arr[i]);
//		}
//		System.out.println(hashSet);
//	}
	
	
	public static void main(String[] args)
	{
		int [] arr = {10, 20, 20, 30, 30, 40, 40, 50, 50, 60};
		int n = arr.length;
		
		Set<Integer> sortedSet = new TreeSet<>();
		for(int i=0;i<n;i++)
		{
			sortedSet.add(arr[i]);
		}
		System.out.println(sortedSet);
	}
}
