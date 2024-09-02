package com.app.array;

import java.util.ArrayList;
import java.util.Collections;

public class FindMinAndRemoveFirstOccurence {

	public static void main(String[] args)
	{
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(1);
		l1.add(13);
		l1.add(10);
		l1.add(34);
		l1.add(10);
		l1.add(1);
		
		int min = Collections.min(l1);
		
		l1.remove(Integer.valueOf(min));
		
		System.out.println("orginal list :"+l1);
		System.out.println("after removing the first occurence "+l1);
	}
}
