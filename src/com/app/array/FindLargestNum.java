package com.app.array;

import java.util.Arrays;

public class FindLargestNum {

//	public static void main(String[] args) {
//		int arr[] = { 12, 13, 14, 1, 34, 10 };
//		int max = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//			}
//
//		}
//		System.out.println("max number is :"+ max);
//	}
	
	public static void main(String[] args)
	{
		int arr[] = { 12, 13, 14, 1, 34, 10 };
	
		Arrays.sort(arr);
		
		int maxNumber = arr[arr.length -1];
		System.out.println("max numner:"+maxNumber);
	}
}