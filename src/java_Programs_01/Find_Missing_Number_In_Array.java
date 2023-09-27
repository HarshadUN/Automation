package java_Programs_01;



public class Find_Missing_Number_In_Array {
	public static void main(String[] args) {
		int a[] ={1,2,4,5};
		int sum1=0;
		for(int i=0; i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
		}
		int sum2=0;
		for(int i=1; i<=5; i++)
		{
			sum2 = sum2 + i;
		}
		int Missing_Num = sum2 - sum1;
		System.out.println("Missing number = " + Missing_Num);
		

}
}