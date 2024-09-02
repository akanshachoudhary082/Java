package com.app.array;

import java.util.Scanner;

public class ReverseArray {

//	public static void main(String[] args)
//	{
//		int arr[] = {10,20,30,40};
//		
//		for(int i = arr.length-1;i>=0;i--)
//		{
//			System.out.println("reverse array "+ arr[i]+ "");
//		}
//		
//		
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size :");
//		int n = sc.nextInt();
//
//		int arr[] = new int[n];
//
//		System.out.println("enter the array element :");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("rev array are");
//		RevArrayElem(arr);
//
//	}
//
//	private static int RevArrayElem(int[] arr) {
//
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i] + "");
//		}
//
//		System.out.println(); // for a new line after printing the array
//		return 0;
//	}

	// -------------------------- 2nd mehtod in recursive way-----------------

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12, 13, 14 };
		int n = arr.length;
		int start = 0;
		int end = n - 1;

		reverseRecursive(arr, start, end);

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + "");
		}

	}

	static void reverseRecursive(int[] arr, int start, int end) {

		if (start >= end)
			return;

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		reverseRecursive(arr, start + 1, end - 1);
	}
}
