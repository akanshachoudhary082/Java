package com.app.string;

import java.util.Scanner;

public class RemoveAllAlphaAceptSpecialChar {

	public static void main(String [] args)
	{
		System.out.println("enter the string :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String s= str.replaceAll("[a-zA-Z]"," ");
		
		System.out.println("Print special characters :"+s);
	}
}
