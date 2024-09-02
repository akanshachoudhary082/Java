package com.app.array;

import java.util.Scanner;

public class SumOfArrayElements {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size");
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//
//		System.out.println("enter the elements :");
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int sum = sumOfEle(arr);
//		System.out.println("sum of array elements :" + sum);
//	}
//
//	static int sumOfEle(int arr[]) {
//		int sum = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		return sum;
//
//	}
	public static void main(String[] args)
	{
		int arr[] = {12,23,12,45,1};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)  //0<5 1<5 2<5 3<5 4<5
		{
			sum += arr[i]; // sum = sum + arr[i] => 0 + 12=12  12+23=35  35+12=47 47+45= 92  92+1=93
		}
		System.out.println("total sum : "+sum);
	}
	
	
}
