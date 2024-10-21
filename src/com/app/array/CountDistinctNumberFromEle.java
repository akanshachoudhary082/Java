package com.app.array;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctNumberFromEle {

	//it will count of all element
	
	
//    public static void main(String[] args) {  // Corrected 'mian' to 'main'
//        int[] arr = {10, 40, 50, 20, 10, 20, 30, 10};
//        int n = arr.length;
//        countFreq(arr, n);  // Using camelCase for method name
//    }
//
//    static void countFreq(int arr[], int n) {
//        Map<Integer, Integer> mp = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            if (mp.containsKey(arr[i])) {
//                mp.put(arr[i], mp.get(arr[i]) + 1);
//            } else {
//                mp.put(arr[i], 1);
//            }
//        }
//
//        System.out.println(mp.size());
//    }
	
	
	//=====================this will distinct ele count=============================
	
	public static void main(String[] args) {
        int[] arr = {10, 40, 50, 20, 10, 20, 30, 10}; // Initialize the array
        countFreq(arr); // Call the method to count frequencies
    }

    static void countFreq(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>(); // Create a map to store frequencies

        // Count frequencies of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet())
        {
        	if(entry.getValue() == 1)
        	{
        		System.out.println(entry.getKey());
        	}
        }
         // Print the number of unique elements
        int uniqueCount = 0;
        for (Integer count : frequencyMap.values()) {
            if (count == 1) {
                uniqueCount++; // Increment count for each unique element
            }
        }
        System.out.println("Total unique elements: " + uniqueCount);
    
    }
}



