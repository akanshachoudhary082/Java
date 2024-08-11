package com.app.program;

/*14.	Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn*/
import java.util.Scanner;

public class ComputesNInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numberr :");
		int n = sc.nextInt();
		
		String nnString ="" +n + n;
		String nnnString = "" + n + n + n;
		
		int nn = Integer.parseInt(nnString);
		int nnn = Integer.parseInt(nnnString);
		
		int result = n + nn + nnn;
		System.out.println("the result : "+ result);

	}
//n = 5
	// n = 3
}
