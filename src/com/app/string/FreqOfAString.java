package com.app.string;

import java.util.HashMap;

public class FreqOfAString {

//	public static void main(String[] args)
//	{
//		HashMap<Character,Integer>map= new HashMap<>();
//		String str = "prepinsta";
//		char ch [] = str.toCharArray();
//		for(Character ch1 : ch)
//		{
//			map.put(ch1, map.getOrDefault(ch1, 0) + 1);
//		}
//		System.out.println(map);
//	}
	
	public static void main(String [] args)
	{
		String str = "apple";
		freqOfString(str);
		
	}
	
	public static void freqOfString(String str)
	{
		int[] charCount = new int[256];
	
		for(int i=0;i<str.length();i++)
		{
			charCount[str.charAt(i)]++;
		}
	
		for(int i=0;i<charCount.length;i++)
		{
			if(charCount[i]>0)
			{
				
				System.out.println((char)i+ ":" + charCount[i]);
			}
		}
		
	}
}
