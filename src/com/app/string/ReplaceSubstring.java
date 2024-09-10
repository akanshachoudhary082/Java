package com.app.string;

import java.util.Scanner;

public class ReplaceSubstring {

//	public static void main(String [] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string :");
//		String str = sc.nextLine();
//		
//		System.out.println("enter the substring to replace :");
//		String oldStr =sc.nextLine();
//		
//		System.out.println("enter the new substring :");
//		String newStr =sc.nextLine();
//		
//		
//		String newString = str.replace(oldStr,newStr);
//		
//		System.out.println("modified string :");
//		
//		System.out.println(newString);
//	}

	// ----------------------2nd method-------------------

	public static void main(String[] args) {
		String originalString = "Hello World";
		String replaceToSubstring = "World";
		String replacement = "Java";

		String modifiedString = replaceString(originalString, replaceToSubstring, replacement);
		
		System.out.println("originalString :"+originalString);
		System.out.println("modifed string :"+ modifiedString);
		

	}

	static String replaceString(String originalString, String toReplace, String replacement) {
	
    	 if(!originalString.contains(toReplace))
    	 {
    		 return originalString;
    	 }
    	 
    	 String modified = originalString.replaceAll(toReplace, replacement);
		return modified;
	
     }
}
