package com.app.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
//
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter the string  : ");
//	    String s1 = sc.nextLine();
//	    String s2 = sc.nextLine();
//	 
//	   boolean status =  isAnagramString(s1,s2);
//	   if(status)
//	   {
//		   System.out.println(s1 + " and " + s2 + " are anagram");
//	   }
//	   else {
//		   System.out.println(s1 + " and " + s2 + " are not anagram");
//	   }
//	}
//
//	 static boolean isAnagramString(String str1, String str2) {
//		 
//		 String s1 = str1.replaceAll("[\\s1]","");
//		 String s2 = str2.replaceAll("[\\s2]","");
//		 boolean status = true;
//		 
//		if(s1.length()!=s2.length())
//		{
//			status =  false;
//		}
//		else
//		{
//			char [] a = s1.toLowerCase().toCharArray();
//			char [] b = s2.toLowerCase().toCharArray();
//			
//			Arrays.sort(a);
//			Arrays.sort(b);
//			
//			status = Arrays.equals(a, b);
//		}
//		return status;
//		
//	}
	
	//------------------------ 2nd mehtod----------------------
	
	public static void main(String[] args)
	{
		String s1 = "arc";
		String s2 = "car";
		
		char [] a = s1.toLowerCase().toCharArray();
		char [] b = s2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(s1+ " " + s2);
		
		if(Arrays.equals(a, b))
		{
			System.out.println("it is a anagram");
		}else {
			System.out.println("it is not a anagram");
		}
	}
}
