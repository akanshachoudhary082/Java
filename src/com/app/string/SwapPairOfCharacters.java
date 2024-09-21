package com.app.string;

public class SwapPairOfCharacters {

//	public static void main(String[] args)
//	{
//		String str = "abcdefgh";
//		String s1 = swapPairs(str);
//		System.out.println(s1);
//	}
//	
//	static String swapPairs(String str)
//	{
//		char[] chars = str.toCharArray();
//		
//		for(int i=0;i<chars.length-1;i+=2)
//		{
//			char temp = chars[i];
//			chars[i] = chars[i+1];
//			chars[i+1]= temp;
//			
//		}
//		return new String(chars);
//		
//	}

	public static void main(String[] args) {
		String str = "abcdef";
		String s = " ";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length - 1; i += 2) {
			char temp = ch[i];
			ch[i] = ch[i + 1];
			ch[i + 1] = temp;
		}

		// Convert the modified char array back to a string
		String swappedStr = new String(ch);

		// Print the swapped string
		System.out.println("Swapped: " + swappedStr);

	}

}
