package LoopCondition;

import java.util.Scanner;

public class IFCondition 
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter The Number: ");
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Value is Even Number" +a);
		}
//		else
//		{
//			System.out.println("Value is ODD Number" +a);
//					
//		}
	}
}
