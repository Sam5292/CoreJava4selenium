package LoopCondition;

import java.util.Scanner;

public class ElseIfLadder 
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter Your Marks To Know Your Result: ");
		Scanner s = new Scanner(System.in);
		int Marks = s.nextInt();
		
		if((Marks>=0)&&(Marks<35))
		{
			System.out.println("Better Luck Next Time Work Hard");
		}
		else if ((Marks>=35)&&(Marks<60))
		{
			System.out.println("Congratulation You Clear The Examination");
		}
		
		else if ((Marks>=60)&&(Marks<80))
		{
			System.out.println("Congratulation You Holding First Class");
		}
		
		else if ((Marks>=80)&&(Marks<=100))
		{
			System.out.println("Congratulation You Holding Merit Class");
		}
		else
		{
			System.out.println("Invalid Marks Entered");
		}
	}
}
