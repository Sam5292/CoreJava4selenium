package Assignment;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int num = 0;
		int num1 = 1;
		int sum = 0;
		System.out.println(num);
		System.out.println(num1);
		for(int i=0; i<10; i++)
		{
			sum = num+num1;
			num=num1;
			num1=sum;
			System.out.println(sum);
		}
	}

}
