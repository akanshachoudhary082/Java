package com.app.array;

import java.util.HashMap;

public class FreqOfElementOfArray {

	public static void main(String[] args)
	{
		int[] arr = {12,14,13,12,4,6,4};
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int num : arr)
		{
			map.put(num, map.getOrDefault(num,0)+1);
		}
		
		for(int key : map.keySet())
		{
			System.out.println("Element: "+ key +","+" Frequency:"+ map.get(key));
		}
	}
}
