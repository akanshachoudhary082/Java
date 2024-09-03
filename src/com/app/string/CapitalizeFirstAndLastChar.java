package com.app.string;

import java.util.Scanner;

public class CapitalizeFirstAndLastChar {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string  :");
		String s = sc.nextLine();
		String newstr = "";
		String[] str = s.split("[\\s]");
		
		for(String string : str)
		{
			int length = string.length();
			String firstchar = string.substring(0,1);
			String restchar = string.substring(1, length-1);
			String lastchar =Character.toString(string.charAt(length-1));
			newstr = newstr + firstchar.toUpperCase()+restchar+ lastchar.toUpperCase()+"";
		}
		System.out.println(newstr.trim());
		
		//In summary, trim() ensures that your output does not have unnecessary leading or trailing whitespace, making the result cleaner and more polished.
	}
}
