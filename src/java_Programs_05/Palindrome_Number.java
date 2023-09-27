package java_Programs_05;

public class Palindrome_Number {
	public static void main(String[] args) {
		int num =12321;
		int rev =0;
		int org_Num =num;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num =num/10;
		}
		if(org_Num==rev)
		{
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not A palindrome Number");
		}
	}

}
