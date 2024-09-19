package com.app.string;

public class FindFirstNonRepeatingChar {

//	public static void main(String[] args) {
//		String str = "prepinsta";
//		boolean flag = true;
//		
//		for(char ch : str.toCharArray())
//		{
//			if(str.indexOf(ch)== str.lastIndexOf(ch))
//			{
//				System.out.println("first non repeating char is :"+ ch);
//				 flag = false;
//				break;
//			}
//		}
//		
//		if(flag)
//		{
//			System.out.println("non repeating char is not found");
//		}
//
//	}

	public static char findFirstNonRepeatingChar(String str) {
		int[] charCount = new int[256]; // Array to store count of each character (assuming ASCII)

		// Count the frequency of each character
		for (int i = 0; i < str.length(); i++) {
			charCount[str.charAt(i)]++;
		}

		// Find the first character with count 1
		for (int i = 0; i < str.length(); i++) {
			if (charCount[str.charAt(i)] == 1) {
				return str.charAt(i); // Return first non-repeating character
			}
		}

		return '_'; // Return '_' if no non-repeating character is found
	}

	public static void main(String[] args) {
		String str = "swiss";
		char result = findFirstNonRepeatingChar(str);
		System.out.println("First non-repeating character: " + result); // Output: 'w'
	}
}
