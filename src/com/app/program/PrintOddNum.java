package com.app.program;

/*16.	Write a Java program to print the odd numbers from 1 to 20*/
import java.util.Scanner;

public class PrintOddNum {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
	}
}