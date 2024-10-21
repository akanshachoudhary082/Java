package com.app.array;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        // Call the function to find the second highest using Bubble Sort
        bubbleSort(arr);
        
        // The second highest element will be at the second last position
        if (arr.length >= 2) {
            System.out.println("The second highest element is: " + arr[arr.length - 2]);
        } else {
            System.out.println("There is no second highest element.");
        }
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
//        for(int i=0;i<n;i++)
//        {
//        	System.out.println(arr[i]);
//        }
    }
}
