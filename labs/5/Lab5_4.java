package cmpt220Revised;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first array: ");
		int array1size = scanner.nextInt();
		int[]array1 = new int[array1size];
		for(int i=0; i<array1size; i++) {
			array1[i] = scanner.nextInt();
		}
		System.out.print("Enter the second array: ");
		int array2size = scanner.nextInt();
		int[]array2 = new int[array2size];
		for(int i=0; i<array2size; i++) {
			array2[i] = scanner.nextInt();
		}
		if(equal(array1, array2)) {
			System.out.println("The two arrays are identical.");
		}
		else {
			System.out.println("The two arrays are not identical.");
		}
		scanner.close();
	}

	 public static boolean equal(int [] array1, int [] array2){
	        if(array1.length!=array2.length){
	            return false;
	        }
	      
	        Arrays.sort(array1);
	        Arrays.sort(array2);
	        for(int i=0;i<array1.length;i++){
	            if(array1[i]!=array2[i]){
	                return false;
	            }
	        }
	        return true;
	    }
}

