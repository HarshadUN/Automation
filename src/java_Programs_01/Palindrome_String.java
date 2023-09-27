package java_Programs_01;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADAM";
		String rev = "";
		String org_str=str;
		
		int len = str.length();
		for(int i = len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not a Palindrome");
		}
				

	}

}
