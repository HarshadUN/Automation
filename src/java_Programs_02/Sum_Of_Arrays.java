package java_Programs_02;

public class Sum_Of_Arrays {

	public static void main(String[] args) {
		int [] a = {2,4,5,6,9};
		int sum =0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum = sum +a[i];
		}
		System.out.println(sum);
	}
}
