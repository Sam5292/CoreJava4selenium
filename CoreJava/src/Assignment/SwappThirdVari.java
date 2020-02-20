package Assignment;

import java.util.Scanner;

public class SwappThirdVari 
{
	public static void main(String[] args) 
	
	{
		System.out.println("Enter the value of X ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		System.out.println("Enter the value of Y");
		int y = s.nextInt();
		
		System.out.println("The value of X & Y before swapping is: " +x+ " " +y);
		
		int z;
		z=x;
		x=y;
		y=z;
		
		System.out.println("The value of X & Y after swapping is: " +x+ " " +y);
	}
}
