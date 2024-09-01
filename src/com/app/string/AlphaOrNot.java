package com.app.string;
//Java program to check whether the character entered by the user is an alphabet or not.
public class AlphaOrNot {

//	public static void main(String[] args)
//	{
//		char ch ;
//        ch = '9';		
//		if((ch >='a'  || ch <='z') || (ch >='A'  || ch<='Z'))
//		{
//			System.out.println("the inserted character "+ ch + "is an alphabet");
//		}else {
//			System.out.println("the inserted character "+ ch + "is not an alphabet");
//		}
//	}
	
	
	public static void main(String[] args)
	{
		char ch ;
		//ch = 4;
		ch ='k';
		if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <=96))
				{
			System.out.println("the inserted is an alphabet");
				}
		else {
			System.out.println("the inserted is not alphabet");
		}
	}
}
