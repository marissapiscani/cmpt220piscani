package cmpt220;

import java.util.Scanner;

public class lab1_Problem3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number in ounces:");
	double ounces = input.nextDouble();
	double grams = 28.3495 * ounces;
		System.out.println(ounces + "ounces is "+ grams + "grams");
		
		
}

}

