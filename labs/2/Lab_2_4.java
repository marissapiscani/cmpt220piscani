package cmpt220Revised;

import java.util.Scanner;

public class Lab_2_4 {
	public static void main(String[] args) {
		// TODO 
		int num1, num2, sum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first character:");
		num1 = input.nextInt();
		
		System.out.println("Enter second character:");
		num2 = input.nextInt();
		
		input.close();
		sum = num1 + num2;
		System.out.println("Result is:" + sum);
				
		
		}

}





