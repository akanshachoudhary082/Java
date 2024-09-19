package com.app.string;

import java.util.Scanner;

public class ReverseString {

//	public static void main(String[] args)
//	{
//		System.out.println("enter the string :");
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		String rev = "";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev = rev + s.charAt(i);
//		}
//		
//		System.out.println("reverse string "+ rev);
//		
//	}
	
	//--------------------using array ----------------------
	
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the string : ");
//		String str = sc.nextLine();
//		String rev = "";
//		
//		char a[] = str.toCharArray();
//		int n = str.length();
//		for(int i = n-1;i>=0;i--)
//		{
//			rev = rev + a[i];
//		}
//		
//		System.out.println("reverse string is :"+rev);
//		
//		
//				
//	}
	
	
	public class ReverseString {
	    public static void main(String[] args) {
	        String input = "hello";
	        
	        // Use StringBuilder to reverse the string
	        String reversed = new StringBuilder(input).reverse().toString();
	        
	        System.out.println("Reversed string: " + reversed);
	    }
	}

}


