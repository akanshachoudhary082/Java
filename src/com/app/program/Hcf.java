package com.app.program;

public class Hcf {

	public static void main(String[] args)
	{
		int num1 = 36;
		int num2=60;
		
		while(num1 != num2) // 36 != 60 36!=24 12!=24 12!=12
		{
			if(num1 > num2) // 36>60 36>24 12>24
			{
				num1 = num1 - num2; // 36-24=> 12
			}else {
				num2 = num2 - num1;//60-36=>24 24-12=>12
			}
		}
		
		
		System.out.println("hcf is :"+ num1); //12
	}
}
