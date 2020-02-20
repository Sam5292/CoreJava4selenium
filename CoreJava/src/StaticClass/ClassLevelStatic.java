package StaticClass;

public class ClassLevelStatic {
	
	static int a = 0;
	
	public void classlevelStatic()
	{
		a = a + 1;
	}

	public static void main(String[] args) 
	{
		ClassLevelStatic obj = new ClassLevelStatic();
		obj.classlevelStatic();
		System.out.println(obj.a);
		
		ClassLevelStatic obj1 = new ClassLevelStatic();
		obj1.classlevelStatic();
		System.out.println(obj1.a);
	}

}
