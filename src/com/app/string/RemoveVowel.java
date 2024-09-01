package com.app.string;

public class RemoveVowel {

//	public static void main(String[] args) {
//		String s = "prepinsta";
//		String s1 = "";
//
//		s1 = s.replaceAll("[aeiou]","");
//		System.out.println("after remove vowel is :" + s1);
//	}
	
	
	static String remVowel(String str)
	{
		return str.replaceAll("[aeioAEIOU]","");
		
	}
	public static void main(String[] args)
	{
		String str = "prepInsta";
		System.out.println( "after remove vowel "+remVowel(str));
	}
}
