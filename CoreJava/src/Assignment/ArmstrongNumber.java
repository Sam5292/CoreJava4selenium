package Assignment;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		
		int a=0,b,temp;  
	    int n=153;//It is the number to check Armstrong  
	    temp=n;  
	    
	    while(n>0)  
	    {  
	    	b=n%10;  
	    	n=n/10;  
	    	a=a+(b*b*b);  
	    }  
	    
	    if(temp==a)
	    {
	    	System.out.println("The Number is Armstrong number");   
	    }
	    	else
	    	{
	        System.out.println("The Number is not Armstrong number and code in git hub");   
	   }  
	
	}
}
