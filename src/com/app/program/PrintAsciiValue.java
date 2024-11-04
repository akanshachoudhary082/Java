package com.app.program;

/*13.	Write a Java program to print the ascii value of a given character*/
import java.util.Scanner;

public class PrintAsciiValue {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the character:");
    char ch = sc.next().charAt(0);
    
    int asciiValue = ch;
    
    System.out.println("the Ascii value :"+ ch + " is "+ asciiValue);
    
	}

}
