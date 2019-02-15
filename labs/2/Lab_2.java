package cmpt220Revised;


import java.util.Scanner;

public class Lab_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		double num1 = input.nextDouble(); 
		System.out.print("Enter another number:");
		double num2 = input.nextDouble();
		
		boolean result1 = (num1 < num2);
		boolean result2 = (num1 <= num2);
		boolean result3 = (num1 == num2);
		boolean result4 = (num1 != num2);
		boolean result5 = (num1 > num2);
		boolean result6 = (num1 >= num2);
		
				
		System.out.println(num1 + "is less than" + num2 + "?" + result1);
		System.out.println(num1 + "is less than or equal to" + num2 + "?" + result2);
		System.out.println(num1 + "is equal to" + num2 + "?" + result3);
		System.out.println(num1 + "is not equal to" + num2 + "?" + result4);
		System.out.println(num1 + "is greater than" + num2 + "?" + result5);
		System.out.println(num1 + "is greater than or equal to " + num2 + "?" + result6);
		
	}	
		
}


