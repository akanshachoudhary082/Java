package com.app.string;

import java.util.Scanner;

public class RemoveSpaces {

//	public static void main(String[] args)
//	{
//		String str = "Prepinsta is the best";
//		str = str.replaceAll(" ","");
//		System.out.println("print the string after removing spaces :"+str);
//	}
	
	//-----------------------2nd mehtod-------------------
	
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the string :");
//		String str = sc.nextLine();
//		String s1 = "";
//		
//		s1 = str.replaceAll("[\\s]","");
//		System.out.println("print the string after removing spaces:"+ s1);
//	}
	
	//------------------------3rd mehtod using in-built method------------------
	
	public static void main(String[] args)
	{
		 StringBuffer sb = new StringBuffer();
		 String str = "Prep is best for coding practice";
		 String[] s1 = str.split("[\\s]");
		 for(String string : s1)
		 {
			 sb.append(string);
		 }
		 System.out.println(sb);
	}
	
}
