package cmpt220Revised;

import java.util.Scanner;

public class Lab5_7 {


    public static void main(String[] args) {
    	
    	
    	int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		
		size = scanner.nextInt();
		
		double[][] array = new double[size][size];
		System.out.println("Enter numbers into the matrix: ");
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
        
        
        
        if(isUpperTriangular(array)) {
            System.out.println("The array is an upper triangluar matrix");
        } else {
            System.out.println("The array is not an upper triangular matrix.");
        }
    }

	public static boolean isUpperTriangular(double[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(i > j) {
                    if(!(array[i][j] == 0)) {
                        return false;
                    }
                }
            }
        }
        return true; 
    }
}




