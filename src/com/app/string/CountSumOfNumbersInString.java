package com.app.string;

public class CountSumOfNumbersInString {

//	public static void main(String[] args) {
//		String str = "4Prep2Insta6";
//		int sum = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//				sum = sum + str.charAt(i) - '0';
//			}
//
//		}
//		System.out.println("total count is :" + sum);
//	}
	
	//--------------------2nd method--------------------
	
	public static void main(String[] args)
	{
		int sum =0;
		String str = "4Prep2Insta6";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("total count :"+sum);
	}
}
