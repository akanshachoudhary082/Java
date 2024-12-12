package com.app.string;

public class FindNonRepChar {

	public static void main(String[] args)
	{
		String str = "banana";
		findNonRepcharacter(str);
	}
	
	public static void findNonRepcharacter(String str)
	{
		int []freq = new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			freq[str.charAt(i)]++;
		}
		
		for(int i=0;i<freq.length;i++)
		{
		   if(freq[i] == 1)
		   {
			   System.out.println((char)i + "=" + freq[i]);
		   }
		}
	}
}
