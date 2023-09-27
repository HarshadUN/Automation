package java_Programs_05;


public class Print_Even_Odd_Number_Arrays {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even =" +a[i]);
			}
		}
		
	}

}
