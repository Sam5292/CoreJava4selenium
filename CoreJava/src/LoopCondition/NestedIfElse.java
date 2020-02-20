package LoopCondition;

import java.util.Scanner;

public class NestedIfElse 
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter Number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("Number is Even Number");
			}
			else
			{
				System.out.println("Number is ODD Number");
			}
		}
		else
		{
			if(a==0)
			{
				System.out.println("Value of A is 0");
			}
			else
			{
				System.out.println("Value of A is -ve");
			}
		
		}
}
}
