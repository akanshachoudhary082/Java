package com.app.program;

import java.util.Scanner;

public class PositiveAndNegative {

	public static void main(String [] args)
	{
	   System.out.println("Enter the number :");
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   if(num > 0)
	   {
		   System.out.println("number is positive");
	   }else if(num < 0){
		   System.out.println("number is negative");
	   }else {
		   System.out.println("number is 0");
	   }
	   
	}
}
