package com.app.string;

import java.util.Scanner;

public class ConstVowel {

//	public static void main(String[] args) {
//		//char c = 'g';
//		
//		System.out.println("ENTER THE CHARACTER");
//		Scanner sc = new Scanner(System.in);
//		char c = sc.next().charAt(0);
//		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
//				|| c == 'U') {
//			System.out.println(c + " is a vowel");
//
//		} else if (Character.isLetter(c)) {
//			System.out.println(c + " is a consonant");
//		}else {
//			System.out.println(c+"is not a valid letter");
//		}
//
//	}
	
	public static void main(String[] args)
	{
		//char c = 'f';
		System.out.println("Enter the character :");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		if(isLowercaseVowel(c)  || isUppercaseVowel(c))
		{
			System.out.println(c +" is a vowel");
		}else {
			System.out.println(c + " is a cononant");
		}
	}
	static boolean isLowercaseVowel(char c)
	{
		return (c == 'a' || c == 'e'  || c=='i'  || c=='o'  || c=='u' );
	}
	
	static boolean isUppercaseVowel(char c)
	{
		return (c =='A'  || c == 'E'  || c == 'I'  ||  c == 'O'  || c == 'U');
	}
}
