package cmpt220Revised;

import java.util.Scanner;

public class Lab5_6 {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int n = 0;
        System.out.println("Enter the number of rows: ");
        n=input.nextInt(); 
        int c = 0;
        System.out.println("Enter the number of columns: ");
        c=input.nextInt();
        double[][] array = new double[n][c]; 
        int i = 0;
        int j = 0;
	    for(i=0;i<n;i++) {
	    	for(j=0;j<c;j++) {
	    		System.out.print("Enter element:");
	    		array[i][j]=input.nextInt();
	    	}
	    }
	       
	    for(i=0;i<n;i++) {
	    	for(j=0;j<c;j++) {
	    		System.out.print(" "+ array[i][j]);
	    	}
	    	  	System.out.println();
	    }
	    int column;
	    System.out.println("Enter the column number:");
	    column=input.nextInt();
	    double avg=averageRow(array,column);
	    System.out.println("Average of column "+ column + " is "+avg);
        input.close();
	}
	private static double averageRow(double[][] array, int column) {
		int i;
		double sum = 0;
		for(i=0; i<array[0].length; i++) {
			sum += array[i][0];
		}
		return (double) sum/array[0].length;
	}
}