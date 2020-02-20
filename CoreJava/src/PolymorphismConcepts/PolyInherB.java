package PolymorphismConcepts;

/*  Two Possibilities 
 * 	First with the help of child ref_variable can call the parent method
 * 	Second child class can override the parent method
 */

public class PolyInherB extends PolyInherA
{
	
	public void Arithmatic(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		PolyInherB obj = new PolyInherB();
		obj.Arithmatic(20, 11); // First Possibilities
	}
}
