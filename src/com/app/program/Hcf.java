package com.app.program;

import java.util.Scanner;

public class Hcf {

	public static void mian(String[] args)
	{
		int num1 = 36 ;
		int num2 = 60;
		int HCF;
	    HCF= getHcf(num1,num2);
	    System.out.println("the hsf :"+HCF);
				
	}
	
	public static int getHcf(int n1,int n2)
	{
		return n2 == 0 ? n1 :getHcf(n2, n1 % n2);
		
	}
}
