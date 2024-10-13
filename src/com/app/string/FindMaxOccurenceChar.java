package com.app.string;

import java.util.HashMap;

public class FindMaxOccurenceChar {

	// function that returns maximum occurring character
//	    static char getMaxOccurringChar(String str) {
//	         
//	        // create HashMap to store frequency of every character
//	        HashMap<Character, Integer> mp = new HashMap<>();
//	         
//	        // to store length of string
//	        int n = str.length();
//	         
//	        // to store answer 
//	        char ans = 0;
//	         
//	        // to check count of answer character is less or greater
//	        // than another elements count
//	        int cnt = 0;
//	         
//	        // traverse the string 
//	        for(int i = 0; i < n; i++) {
//	             
//	            // push element into map and increase its frequency 
//	            char c = str.charAt(i);
//	            mp.put(c, mp.getOrDefault(c, 0) + 1);
//	             
//	            // update answer and count
//	            if(mp.get(c) > cnt) {
//	                ans = c;
//	                cnt = mp.get(c);
//	            }
//	        }
//	         
//	        return ans;
//	    }
//	 
//	    // Driver Code
//	    public static void main(String[] args) {
//	        String str = "helloworld";
//	        System.out.println("Max occurring character is: " + getMaxOccurringChar(str));
//	    }

	public static void main(String[] args) {
		String str = "HelloWorld";
		int[] freq= new int[256]; // Array to store frequency of characters
		char maxChar = ' ';
		int max = -1;

		// Counting the frequency of each character
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		// Finding the maximum occurring character
		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] > max) {
				max = freq[str.charAt(i)];
				maxChar = str.charAt(i);
			}
		}

		System.out.println("Character with maximum occurrence: " + maxChar);
	}
}

// This code is contributed by kalyanbef
