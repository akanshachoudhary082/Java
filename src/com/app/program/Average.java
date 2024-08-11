package com.app.program;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float  avg;
		float sum=0;
		int count=5;
		
		for(int i=0;i<=count;i++)
		{
			System.out.println("Enter number : "+ i + " :");
			float num = sc.nextFloat();
			sum = sum + i;
			
		}
		avg = sum /count;
		System.out.println("Numbers :"+ avg);
	}
}
