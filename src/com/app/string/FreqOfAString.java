package com.app.string;

import java.util.HashMap;

public class FreqOfAString {

	public static void main(String[] args)
	{
		HashMap<Character,Integer>map= new HashMap<>();
		String str = "prepinsta";
		char ch [] = str.toCharArray();
		for(Character ch1 : ch)
		{
			map.put(ch1, map.getOrDefault(ch1, 0) + 1);
		}
		System.out.println(map);
	}
}
