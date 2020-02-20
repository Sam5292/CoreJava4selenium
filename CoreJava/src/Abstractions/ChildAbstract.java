package Abstractions;

public class ChildAbstract extends AbstractionExam
{
	public void xyz()
	{
		System.out.println("Body Given");
	}
	
	public static void main(String[] args) {
		ChildAbstract obj = new ChildAbstract();
		obj.abc();
		obj.xyz();
	}
}
