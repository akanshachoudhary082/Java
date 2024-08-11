package com.app.program;

/*11.	Write a Java program to compare two numbers*/
import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 > n2)
			
		{
			System.out.println("n1 is greater");
		}
		else if (n1< n2){
			System.out.println("n2 is greater");
		}
		else {
			System.out.println("both number is equal");
		}
	}
}
