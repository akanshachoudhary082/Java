package com.app.program;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		int mul=0;
		System.out.println("enter the numbers : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		mul = num1 * num2;
		System.out.println("prdouct of two numbers :" +mul);
		
	}
}
