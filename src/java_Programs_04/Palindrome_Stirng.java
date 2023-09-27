package java_Programs_04;

public class Palindrome_Stirng {
	public static void main(String[] args) {
		String str = "MADAMDFG";
		String rev = "";
		String org_str = str;
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome Stirng");
		}
	}

}
