package Assignment;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String args[])
	   {
	      int a, b, fact = 1;
	     
	      System.out.println("Enter an integer to calculate it's factorial");
	      Scanner s = new Scanner(System.in);
	     
	      a = s.nextInt();
	     
	      if (a < 0)
	      {
	         System.out.println("Number should be non-negative.");
	      }
	         else
	      {
	         for (b = 1; b <= a; b++)
	         {
	            fact = fact*b;
	            System.out.println("Factorial of "+a+" is = "+fact);
	      }
	      }
	   }
	
}
