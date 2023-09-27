package java_Programs_02;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "MADAM";
		String rev ="";
		
		int len=string.length();
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+string.charAt(i);
		}
		if(string.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("not a palindrome String");
		}

	}

}
