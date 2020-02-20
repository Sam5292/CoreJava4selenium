package PolymorphismConcepts;


public class Polymorph 

{
	public void sum(int a, int b) // a & b are local variable and parameterized method
	{
		int c;
		c=a+b;
		System.out.println("The value of C is: " +c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d;
		d= a+b+c;
		System.out.println("The value of D id: " +d);
	}
		public static void main (String[] args)
		{
			Polymorph obj = new Polymorph();
			obj.sum(10, 30);
			obj.sum(11, 11, 11);
		}
		
	}

