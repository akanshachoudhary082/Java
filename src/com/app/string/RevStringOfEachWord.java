package com.app.string;

public class RevStringOfEachWord {

	public static void main(String[] args)
	{
		String [] str = {"Today","Is","Rocking","Day"};
		
		String  rev = "";
		
		for(int i=0;i<str.length;i++)
		{
			String word = str[i];
			String revWord = "";
			
			for(int j = word.length()-1;j>=0;j--)
			{
				revWord = revWord + word.charAt(j);
			}
			
			rev = rev + revWord;
			
			if(i != str.length-1)
			{
				rev = rev +  " ";
			}
			
		}
		
		System.out.println(rev);
		
		
		
	}
	
}
