package com.app.array;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctNumberFromEle {

    public static void main(String[] args) {  // Corrected 'mian' to 'main'
        int[] arr = {10, 40, 50, 20, 10, 20, 30, 10};
        int n = arr.length;
        countFreq(arr, n);  // Using camelCase for method name
    }

    static void countFreq(int arr[], int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        System.out.println(mp.size());
    }
}



