package java_Programs_05;

public class Count_Number_Of_Digits {
	 public static void main(String[] args) {
		int num =123456789;
		int count =0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		
		
					
	}

}
