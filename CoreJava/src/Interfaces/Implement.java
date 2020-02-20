package Interfaces;

public class Implement implements InterfaceExm 
{
	public void Test()
	{
		System.out.println("Body Given to Test method");
	}
	
	public void India()
	{
		System.out.println("Body Given to the India Method");
	}
	
	public static void main(String[] args) 
	{
		Implement obj = new Implement();
		obj.Test();
		obj.India();
	}
}
