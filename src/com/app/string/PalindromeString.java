package com.app.string;

import java.util.Scanner;

public class PalindromeString {

//	public static void main(String[] args) {
//		String str="racecar";
//		int n=str.length()/2;
//		int count=0;
//		for (int i=0;i<n;i++){
//		if(str.charAt(i)!=str.charAt(str.length()-1-i)){
//		System.out.println("Not palindrome");
//		count++;
//		break;
//		}
//		}
//		if(count==0){
//		System.out.println("Palindrome");
//		}
//		}
	
	//----------------------- 2 nd method ---------------
	
//	public static void main(String[] args)
//	{
//		//String s = "arora";
//		System.out.println("enter the string :");
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		String rev = "";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev = rev + s.charAt(i);
//		}
//		
//		if(s.equals(rev))
//		{
//			System.out.println("string is palindrome");
//		}else {
//			System.out.println("string is not palindrome");
//		}
//	}



    public static void main(String[] args) {
        String input = "madam";
        boolean result = isPalindrome(input);
        System.out.println("Is \"" + input + "\" a palindrome? " + result);
    }

    public static boolean isPalindrome(String str) {
        int start = 0; // Start index
        int end = str.length() - 1; // End index

        // Compare characters from start and end
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++; // Move start index to the right
            end--;   // Move end index to the left
        }
        return true; // It's a palindrome
    }
}

