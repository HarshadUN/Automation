package java_Programs_01;

public class Reverse_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HarshadAgale";
		String rev="";
		
		int len= str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
