package cmpt220Revised;

import java.util.Scanner;
import java.util.Random;

public class Lab_2_3 {
	public static void main(String[] args) {
		int n1, n2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Lower Limit Number");
		n1 = input.nextInt();
		System.out.println("Enter Upper Limit Number");
		n2 = input.nextInt();
		for (int i = 0; i < 3; i++) {
			System.out.println(getRand(n1,n2));
			input.close();
		}
		}
	
		private static int getRand(int n1, int n2) {
			
			if (n1 >= n2) {
				throw new IllegalArgumentException("max must be greater than min");
				
			}
			
			Random r = new Random();
			return r.nextInt((n2 - n1) + 1) + n1;
		}
}			