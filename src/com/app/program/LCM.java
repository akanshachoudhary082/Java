package com.app.program;

public class LCM {

	public static void main(String[] args)
	{
		int num1 =12;
		int num2 = 14;
		
		
		int hcf = getHcf(num1,num2);
		System.out.println("hcf is "+hcf);
		
		
		int lcm = (num1 * num2)/hcf;
		
		System.out.println("lcm is "+ lcm);
	}
	

	public static int getHcf(int num1 ,int num2)
	{
		while(num1 != num2)
		{
			if(num1 > num2)
			{
				num1 = num1 - num2;
			}else {
				num2 = num2 - num1;
			}
		
		}
		return num1;
	}
}

