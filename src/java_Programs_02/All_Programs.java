package java_Programs_02;

public class All_Programs {
	public static void main(String[] args) {
		Programs P = new Programs();
		P.SwapNumbers();
		P.Reverse_String();
		P.Revese_Number();
		P.Count_Sum_OF_Digits();
		P.Palindrome_Number();
		P.Count_Even_And_Odd();
	    
		
	}

}
 class Programs {
	public void SwapNumbers (){
		int a=10, b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.err.println("A value =" + a +"   B value =" + b);
		
	}
	public void Reverse_String() {
		String str = "Harshad";
		String rev = " ";
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reveres String is ="+rev);
		
	}
	public void Revese_Number() {
		int num = 12345;
		int rev =0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse number = " +rev);
	}
	public void Count_Sum_OF_Digits() {
		int num = 12345;
		int sum =0;
		while(num>0)
		{
			sum = sum + num%10;
			num =num/10;
		}
		System.out.println("Sum Of Digits =" + sum);
		
	}
	public void Palindrome_Number() {
		int num =12321;
		int rev =0;
		int org_Number = num;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(org_Number==rev) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not a Palindrome Number");
		}
	}
	public void Count_Even_And_Odd() {
		int num =123456;
		int even =0;
		int odd = 0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
			num = num/10;
		} 
		System.out.println("Even Number =" + even + " " + "Odd Number" + odd);
		
	}
	
	
}