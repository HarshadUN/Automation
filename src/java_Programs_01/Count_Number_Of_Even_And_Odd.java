package java_Programs_01;

public class Count_Number_Of_Even_And_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456789;
		int Even_count =0;
		int Odd_Count =0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				Even_count++;
				
			}
			else {
				Odd_Count++;
			}
			num=num/10;
		}  //loop end here
		System.out.println(Even_count + " " +Odd_Count );
		
		

	}

}
