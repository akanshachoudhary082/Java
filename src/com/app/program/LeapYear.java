package com.app.program;

public class LeapYear {

	public static void main(String[] args)
	{
		int year = 2020;
		if(year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0))
		{
			System.out.println(year + " is a lap year");
		}else {
			System.out.println(year + " not a leap year");
		}
	}
}
