package java_Programs_03;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int a=0 , b=1, sum=0;
		
		for(int i =2 ; i<10 ; i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}
	}

}
