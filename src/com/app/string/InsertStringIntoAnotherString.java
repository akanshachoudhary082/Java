package com.app.string;

public class InsertStringIntoAnotherString {

	public static void main(String[] args)
	{
		String original = " Hello World ";
		String toInsert = " Beautiful ";
		int position = 6;
		
		String result = original.substring(0 , position) + toInsert + original.substring(position);
		
		System.out.println("print the new string :"+ result);
	}
}
