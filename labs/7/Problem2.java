package lab7;

import java.util.Scanner;

public class Problem2 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a positive integer: ");
			int num = input.nextInt();
			
			StackOfIntegers stack = new StackOfIntegers();
			findFactors(num, stack);
			
			for (int i = 0; i < stack.getSize(); i++) {
				System.out.print(stack.pop() + " ");
			}
			input.close();
		}


		private static void findFactors(int num, StackOfIntegers stack) {
			for(int k = 2; k < num; k++) {
				while(num%k == 0) {
					stack.push(k);
					num = num / k;
				}
			}
			
		}
	}

