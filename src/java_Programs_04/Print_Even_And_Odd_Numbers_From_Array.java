package java_Programs_04;

public class Print_Even_And_Odd_Numbers_From_Array {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("Odd =" + a[i]);
			}
		}
	}

}
