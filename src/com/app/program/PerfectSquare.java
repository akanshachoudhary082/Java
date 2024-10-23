package com.app.program;

public class PerfectSquare {

	public static void main(String[] args)
	{
		int num = 4;
		
		if(Math.sqrt(num) == (int) Math.sqrt(num))
		{
			System.out.println("perfect square");
		}else {
			System.out.println("not perfect square");
		}
	}
}
