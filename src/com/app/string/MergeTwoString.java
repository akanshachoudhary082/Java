package com.app.string;

public class MergeTwoString {

//	public static void main(String[] args)
//	{
//		String s1 = "Hello Beautiful ";
//		String s2 = "World";
//		
//		String merge = s1  + s2;
//		
//		System.out.println(merge);
//	}
	
	//=======================using string builder ========================
	
	
//	public static void main(String[] args)
//	{
//		String [] arr = {"Hello","Beatiful","World"};
//		StringBuilder merge = new StringBuilder();
//
//		
//		
//		for(int i = 0;i< arr.length ; i++)
//		{
//			
//			merge.append(arr[i]);
//			
//			if(i < arr.length - 1)
//			{
//				merge.append(" ");
//			}
//		}
//		
//		System.out.println(merge.toString());
//	}
	
	
	//=====================usig join method ===================
	
	public static void main(String[] args)
	{
		String[] arr = {"Hello" ,"Beautiful","world"};
		
		String merge = String.join(" ", arr);
		
		System.out.println(merge);
	}
}
