package Assignment;

import java.util.Scanner;

public class SwappingNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of X");
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		System.out.println("Enter the value of Y");
		int y = s.nextInt();
		
		System.out.println("The Value Of X and Y Before Swapping is: " +x+ " " +y);
		
		x = x + y;
		y = x - y;
		x = x- y;
		
		System.out.println("The Value Of X and Y After Swapping is: " +x+ " " +y);

		
	}
}
