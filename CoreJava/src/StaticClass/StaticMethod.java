package StaticClass;

public class StaticMethod {
	static int a = 343;
	public static void Static()
	{
		a = a / 2;
		System.out.println("I am Static Method");
	}
	
	
	public static void main(String[] args) 
	{
		StaticMethod.Static();
		
		System.out.println(StaticMethod.a);

	}

}
