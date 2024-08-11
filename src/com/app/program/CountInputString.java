package com.app.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountInputString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string :");
		String input = sc.next();
		
		// using HashMap
		Map<String ,Integer> counts = new HashMap<>();
		counts.put("Letters", 0);
		counts.put("Spaces", 0);
		counts.put("numbers",0);
		counts.put("others",0);
		
		for(char ch : input.toCharArray()) {
			if(Character.isLetter(ch)) {
				counts.put("Letters", counts.getOrDefault("Letters",0)+1);
				
			}else if(Character.isWhitespace(ch)) {
				counts.put("Spaces",counts.getOrDefault("Spaces",0));
				
			}else if(Character.isDigit(ch)) {
				counts.put("Numbers",counts.getOrDefault("Numbers",0)+1);
				
			}else {
				counts.put("Others", counts.getOrDefault("Others",0)+1);
			}
		}
		System.out.println("Letters :"+counts.get("Letters"));
		System.out.println("Spaces : "+counts.get("Spaces"));
		System.out.println("Numbers : "+counts.get("Numbers"));
		System.out.println("Other characters : "+counts.get("Others"));
	}

}
