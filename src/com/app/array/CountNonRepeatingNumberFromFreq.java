
package com.app.array;

import java.util.Arrays;

public class CountNonRepeatingNumberFromFreq {

	public static void main(String[] args)
	{
		int[] arr = new int[] {10, 40, 50, 20, 10, 20, 30, 10};
		int n = arr.length;
		Arrays.sort(arr);
		countFreq(arr,n);
	}
	static void countFreq(int arr[],int n)
	{
		boolean visited[] = new boolean [n];
		Arrays.fill(visited, false);
		
		for(int i=0;i<n;i++)
		{
			if(visited[i] == true)
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
			if(count == 1) {
				System.out.println("Pirnt the non repeating number :"+arr[i]);
				}
		}
		
	}
}
