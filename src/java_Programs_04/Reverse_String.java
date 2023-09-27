package java_Programs_04;

public class Reverse_String {
	public static void main(String[] args) {
		String str ="Harshad";
		int len = str.length();
		String rev ="";
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse String is =" + rev);
	}

}
