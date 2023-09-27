package java_Programs_05;

public class Find_Missing_Number_In_Arrays {
	public static void main(String[] args) {
		int [] a = {1,2,3,5,6,7,8};   // 4 
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum1 = sum1 +a[i];
		}
		for(int i=1; i<=8; i++)
		{
			sum2 = sum2 + i;
		}
		int Missing_Number = sum2- sum1;
		System.out.println(Missing_Number);
		
	}
	


}
