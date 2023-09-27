package java_Programs_01;

public class Print_Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0 , b=1 , sum = 0;
		
		for(int i=2; i<20; i++)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
		

	}

}
