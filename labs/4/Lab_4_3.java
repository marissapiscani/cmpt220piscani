package cmpt220Revised;

import java.util.Scanner;

public class Lab_4_3 {
	public static void main(String[] args) {
		System.out.print("Enter a String = ");
		
		Scanner read = new Scanner(System.in);
		String S = read.nextLine();
		if( isPalindrome(S) )
		{
		System.out.println("The string is Palindrome");
		read.close();
		}
		else
		{
		System.out.println("The string is not Palindrome.");
		
		}
		
		}
		public static String reverse(String S)
		{
		String temp = "";
		for(int i=S.length()-1 ; i>=0 ; i--)
		{
		temp = temp + S.charAt(i);
		
		}
		return temp;
		
		}
		

	private static boolean isPalindrome(String s) {
	{
	int flag = 1;
	String S_reversed = reverse(s);
	for(int i=0 ; i<s.length(); i++)
	{
	if(s.charAt(i) != S_reversed.charAt(i))
	{
	flag = 0;
	break;
	
	}
	}
	if(flag==0)
	{
	return false;
	
	}
	else
	
	{
	return true;
	}
	
	}
	}
}

