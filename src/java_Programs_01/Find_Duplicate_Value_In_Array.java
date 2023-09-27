package java_Programs_01;

public class Find_Duplicate_Value_In_Array {
	public static void main(String[] args) {
		String a[] = {"java","c++","java","python","javascript","java"};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=1+i; j<a.length; j++)
			{
				if(a[i]==a[j]);
			}
			System.out.println("Duplicate value" +a[i]);
		}
		
		
	

}
}