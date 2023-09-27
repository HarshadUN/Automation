package java_Programs_02;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Harshad Agale";
		String revString = "";
		
		int len = string.length();
		for(int i=len-1; i>=0; i--)
		{
			revString= revString + string.charAt(i);
		}
		System.out.println("Reverse String = " + revString);

	}

}
