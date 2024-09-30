package com.app.array;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctNumberFromEle {

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

        System.out.println(frequencyMap.size()); // Print the number of unique elements
    }
}



