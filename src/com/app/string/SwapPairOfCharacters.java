package com.app.string;

public class SwapPairOfCharacters {

	public static void main(String[] args)
	{
		String str = "abcdefgh";
		String s1 = swapPairs(str);
		System.out.println(s1);
	}
	
	static String swapPairs(String str)
	{
		char[] chars = str.toCharArray();
		
		for(int i=0;i<chars.length-1;i+=2)
		{
			char temp = chars[i];
			chars[i] = chars[i+1];
			chars[i+1]= temp;
			
		}
		return new String(chars);
		
	}

	
}
