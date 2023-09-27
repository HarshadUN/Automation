package java_Programs_02;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123454321;
		int rev=0;
		int org_num=num;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		if (org_num==rev) {
			System.out.println("Palindrome Number");
			
		}
		else {
			System.out.println("Number is NOt Palindrome");
		}

	}

}
