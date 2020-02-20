package StaticClass;

public class StaticClass {

	int a = 0;
		public void ObjectLevelStatic()
		{
			a = a +1;
//			System.out.println("I am Static Method");
		}
		
		public static void main(String[] args) 
		{
			StaticClass obj = new StaticClass();
			obj.ObjectLevelStatic();
			System.out.println(obj.a);
			
			StaticClass obj1 = new StaticClass();
			obj1.ObjectLevelStatic();
			System.out.println(obj1.a);
		}

	}


