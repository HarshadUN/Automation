package java_Programs_02;

public class Print_Even_Odd_Arrays {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,};
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("Odd =" + a[i]);
			}
			else {
				System.out.println("Odd = " + a[i]);
			}
		}
		
	}

}