package cmpt220Revised;

import java.util.Scanner;

public class Lab_3_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the first number:");
		double a = input.nextDouble();
		System.out.print("Input the second number:");
		double b = input.nextDouble();
		System.out.print("Input the third number:");
		double c = input.nextDouble();
		System.out.print("The average of the numbers are" + average(a, b, c)+"\n" );
	}
	
	public static double average(double a, double b, double c) {
		return ( a + b + c)/3;
		
	}
}
