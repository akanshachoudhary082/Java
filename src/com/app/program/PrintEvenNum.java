package com.app.program;

/*17.	Write a Java program to print the even numbers from 1 to 20*/
public class PrintEvenNum {

	public static void main(String[] args)
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
