package com.app.string;

import java.util.Scanner;

public class RemoveAllCharAceptAlpha {

//	static String remChar(String str )
//	{
//		return str.replaceAll("[^a-zA-Z]","");
//	}
//	public static void main(String [] args)
//	{
//		
//		System.out.println("enter the string :");
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println("afeter remove string acept alphabet  "+ remChar(str));
//				
//	}
	
	//------------------------2ND METHOD----------------------
	
	public static void main(String[] args)
	{
		String s = "hel1456lo56wor%^ld";
		s = s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
	}
}
