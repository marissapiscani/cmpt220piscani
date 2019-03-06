package cmpt220Revised;

import java.util.Scanner;
public class Lab5_5 {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		
		size = scanner.nextInt();
		
		int mat[][] = new int[size][size];
		System.out.println("Enter numbers into the matrix: ");
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Original matrix");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(mat[i][j]+ " ");
			}
			
			System.out.println();
		}
		
		System.out.println("Transpose of the matrix:");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(mat[j][i]+ " ");
	}
			System.out.println();

}
		scanner.close();
	}
}