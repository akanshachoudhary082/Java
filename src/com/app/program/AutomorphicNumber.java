package com.app.program;

public class AutomorphicNumber {

	public static void main(String [] args)
	{
		int x = 5;
		int y = x * x;
		
		if(y%10 == x%10)
		{
			System.out.println("automorphic");
		}else {
			System.out.println("not ");
		}
	}
}
