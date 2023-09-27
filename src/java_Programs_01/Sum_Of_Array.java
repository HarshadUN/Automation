package java_Programs_01;

public class Sum_Of_Array {
  public static void main(String[] args) {
	int a[] = {2,4,8,9,6,7};
	int sum=0;
	for(int i=0; i<a.length; i++)
	{
		sum= sum + a[i];
	}
	System.out.println(sum);
}
}
