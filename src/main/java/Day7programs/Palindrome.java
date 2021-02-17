package Day7programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		ArrayList<String> stringarray = new ArrayList<String>();
		
		System.out.println("Enter the String to Reverse ");
		String original=input.next();
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		System.out.println("The reversed string is " +reverse);
		if(original.equalsIgnoreCase(reverse))
		{
			System.out.println("It is a Palindrome ");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
