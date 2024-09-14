package com.app.string;

public class RemoveAllAcceptNumbers {

	public static void main(String[] args)
	{
		// ONLY SHOW SPECIAL CHARACTERS -- @#$ NUMBRS ALSO REOVE 
		
//		String str = "abfhdk!@#$45856";
//		String s = str.replaceAll("[a-zA-Z0-9]"," ");
//		System.out.println("Print only numbers : "+ s);
		
		String str = "abfhdk!@#$45856";
		String s = str.replaceAll("[^0-9]","");
		System.out.println("print numbrs only :" + s);
	}
}
