package cmpt220Revised;

import java.util.Scanner;

public class Lab_2_4correct {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first, second;
		System.out.print("Enter first character:");
		first = input.next().charAt(0);
		System.out.print("Enter second character:");
		second = input.next().charAt(0);
		int res = first + second;
		System.out.println("Result is" + res);
		input.close();
	}
}
