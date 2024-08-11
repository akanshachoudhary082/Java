package com.app.tester;
import java.util.Scanner;

public class Bodmas {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = -5 + 8 * 6;
		int y = (55 + 9) % 9;
		int z = 20 + (-3 * 5 /8);
		int c = 5 + 15 /3 * 2 - 8 % 3;
		System.out.println( x+ "\n" + y + "\n" + z + "\n"  + c + "\n");
	}
}
