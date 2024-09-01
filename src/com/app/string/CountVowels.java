package com.app.string;

//Write a program to calculate the number of vowels present in the string in java
public class CountVowels {

	public static void main(String[] args) {
		String s = "prepinsta";
		char[] ch = s.toCharArray();
		int vowel = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowel++;
			}

		}
		System.out.println("the total count of vowel is :" + vowel);
	}
}
