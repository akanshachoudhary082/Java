package com.app.string;

public class RemoveBrackets {

	public static void main(String[] args)
	{
		String str = "(a+b)=c";
		String s1 = str.replaceAll("[(),{}]","");
		System.out.println("Expression without brackets"+ s1);
	}
}
