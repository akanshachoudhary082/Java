package com.app.program;

public class FactorialRecursion {

	public static void main(String[] args)
	{
		int num = 5;
		System.out.println("Factorial of "+ num  + " is " + factorial(num));
	}
	
	public static int factorial(int n)
	{
		
		if(n==0)
		{
			return 1;
		}
		return n * factorial(n - 1);
	}
}

//factorial(6)
//=> 6 * factorial(5)
//    => 5 * factorial(4)
//        => 4 * factorial(3)
//            => 3 * factorial(2)
//                => 2 * factorial(1)
//                    => 1 * factorial(0)
//                        => 1 (Base case)


//factorial(1) => 1 * 1 = 1
//factorial(2) => 2 * 1 = 2
//factorial(3) => 3 * 2 = 6
//factorial(4) => 4 * 6 = 24
//factorial(5) => 5 * 24 = 120
//factorial(6) => 6 * 120 = 720
