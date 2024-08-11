package com.app.program;

import java.util.Scanner;

/*19.	Write a Java program to convert seconds to hour, minute and seconds*/
public class ConversionOfHrMinSec {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of seconds:");
		int totalSeconds = sc.nextInt();
		
		int hours = totalSeconds/3600;
		int minutes = (totalSeconds % 3600) /60;
		int seconds = totalSeconds % 60;
		
		System.out.println(totalSeconds + "seconds is equilvalent");
		System.out.println(hours + "hours"+minutes + "minute and "+ seconds + "seconds ");
	}
}
