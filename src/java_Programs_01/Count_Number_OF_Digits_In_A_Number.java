package java_Programs_01;

public class Count_Number_OF_Digits_In_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =12345678;
		int Count =0;
		
		while(num>0)
		{
			num=num/10;
			Count++;
		}
		
		System.out.println(Count);

	}

}
