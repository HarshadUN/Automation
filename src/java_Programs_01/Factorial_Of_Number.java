package java_Programs_01;

public class Factorial_Of_Number {
	public static void main(String[] args) {
		int num=5;
		int factorial = 1;
		
		for(int i=1; i<=num; i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}

}
