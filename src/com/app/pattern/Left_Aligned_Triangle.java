package com.app.pattern;

public class Left_Aligned_Triangle {

	//Left-Aligned Triangle with Leading Spaces sam as full pyramid
	
		public static void main(String [] args)
		{
		
			int n = 6;
			
			for(int i=0;i<n;i++)
			{
				for(int j=n-i;j>1;j--)
				{
					System.out.print(" ");
				}
				
				for(int j=0 ;j<=i;j++)
				{
					System.out.print("#");
				}
				System.out.println();
			}
			
			
		}
		
		
		/*
		 *    #
		 *   ##
		 *  ###
		 */
}
