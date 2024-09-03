package com.app.string;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "prepinsta";
		boolean flag = true;
		
		for(char ch : str.toCharArray())
		{
			if(str.indexOf(ch)== str.lastIndexOf(ch))
			{
				System.out.println("first non repeating char is :"+ ch);
				 flag = false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("non repeating char is not found");
		}

	}

}
