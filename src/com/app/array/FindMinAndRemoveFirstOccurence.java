package com.app.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMinAndRemoveFirstOccurence {

//	public static void main(String[] args)
//	{
//		ArrayList<Integer> l1 = new ArrayList<>();
//		l1.add(12);
//		l1.add(1);
//		l1.add(13);
//		l1.add(10);
//		l1.add(34);
//		l1.add(10);
//		l1.add(1);
//		
//		int min = Collections.min(l1);
//		System.out.println("orginal list :"+l1);
//		l1.remove(Integer.valueOf(min));
//		
//		
//		System.out.println("after removing the first occurence "+l1);
//	}
	
	
	//with sorting 
//	
//	    public static void main(String[] args) {
//	        int[] arr = {12, 1, 13, 10, 34, 1};
//	        
//	        // Step 1: Sort the array
//	        Arrays.sort(arr);
//	        
//	        // Step 2: Find the minimum value
//	        int min = arr[0];
//	        
//	        // Step 3: Create a new array with one element less
//	        int[] newArr = new int[arr.length - 1];
//	        int newIndex = 0;
//
//	        // Step 4: Copy all elements except the first occurrence of the minimum
//	        boolean minRemoved = false;
//	        for (int i = 0; i < arr.length; i++) {
//	            // Skip the first occurrence of the minimum value
//	            if (arr[i] == min && !minRemoved) {
//	                minRemoved = true;
//	            } else {
//	                newArr[newIndex++] = arr[i];
//	            }
//	        }
//
//	        // Step 5: Print the results
//	        System.out.println("Original Array: " + Arrays.toString(arr));
//	        System.out.println("Minimum value: " + min);
//	        System.out.println("Array after removing the first occurrence of the minimum: " + Arrays.toString(newArr));
//	    }
	
	//-----------------------without sorting-----------------------
//
//	    public static void main(String[] args) {
//	        int[] arr = {12, 1, 13, 10, 34, 1};
//	        
//	        // Step 1: Find the minimum value and its first occurrence
//	        int min = arr[0];
//	        int minIndex = 0;
//
//	        for (int i = 1; i < arr.length; i++) {
//	            if (arr[i] < min) {
//	                min = arr[i];
//	                minIndex = i;
//	            }
//	        }
//
//	        // Step 2: Create a new array with one element less
//	        int[] newArr = new int[arr.length - 1];
//
//	        // Step 3: Copy all elements except the first occurrence of the minimum
//	        for (int i = 0, j = 0; i < arr.length; i++) {
//	            if (i != minIndex) {
//	                newArr[j++] = arr[i];
//	            }
//	        }
//
//	        // Print results
//	        System.out.println("Original Array: " + Arrays.toString(arr));
//	        System.out.println("Minimum value: " + min);
//	        System.out.println("Array after removing first occurrence of the minimum: " + Arrays.toString(newArr));
//	    }
	
	
	public static void main(String[] args)
	{
		int [] arr = {12, 1, 13, 10, 34, 1};
		int min = arr[0];
		int minIndex = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		
		int [] newArr = new int [arr.length-1];
		int newIndex = 0;
		for(int i=0;i<arr.length ;i++)
		{
			if(i!=minIndex)
			{
				newArr[newIndex++] = arr[i];
			}
		}
		
		System.out.println("Original Array :"+ Arrays.toString(arr));
		System.out.println("Min value :"+ min);
		System.out.println("After after removing the first occurence of the min"+Arrays.toString(newArr));
	}
	
}
