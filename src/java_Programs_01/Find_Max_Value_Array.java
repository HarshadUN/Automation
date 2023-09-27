package java_Programs_01;

public class Find_Max_Value_Array {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int max =a[0];
		for(int i=1; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Number in Array =" + max);
	}

}
