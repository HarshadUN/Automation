package java_Programs_01;

public class Prime_Number {
	public static void main(String[] args) {
		int num=19;
		int count =0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i ==0)
				count++;
				
			}
			if(count ==2)
			{
				System.out.println("It is a Prime Number");
			}
			else {
				System.out.println("It is not a prime Number");
			}
		}
		
		
	}

}
