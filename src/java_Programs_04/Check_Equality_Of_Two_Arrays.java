package java_Programs_04;

import java.util.Arrays;

public class Check_Equality_Of_Two_Arrays {
	public static void main(String[] args) {
		int [] a1 = {1,2,3,4};
		int [] a2 = {1,2,3,4};
		
		boolean Status=Arrays.equals(a1, a2);
		if(Status==true)
		{
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("Arrays are UnEqual");
		}
	}

}
