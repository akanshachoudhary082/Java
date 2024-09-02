package com.app.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheElem {

//	public static void main(String[] args)
//	{
//		List<Integer> list = new ArrayList<>();
//		list.add(13);
//		list.add(12);
//		list.add(7);
//		list.add(2);
//		
//		Collections.sort(list);
//		
//		System.out.println("print the array list :"+list);
//	}

	// ----------------------------- 2 nd method without
	// collections-------------------

	public static void main(String[] args) {
		int arr[] = { 10, 2, 1, 6, 9, 5 };

		int temp = 0;

		// arrange in asc order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		//after sorting 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("sorted elements :"+arr[i]+"");
		}

	}
}
