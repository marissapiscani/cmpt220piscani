package cmpt220Revised;

import java.util.Scanner;

public class Lab5_6 {

	public static void main(String args[]) {
		//Creates scanner object
		Scanner input = new Scanner(System.in);
        
		//Creates int variable r and stores the input
		int r = 0;
        System.out.println("Enter the number of rows: ");
        r=input.nextInt();
        
        //Creates int variable c and stores the input 
        int c = 0;
        System.out.println("Enter the number of columns: ");
        c=input.nextInt();
        
        //Creates multidimensional array
        double[][] array = new double[r][c];
        
        //Asks user for elements in matrix and stores them 
        int i = 0;
        int j = 0;
	    for(i=0;i<r;i++) {
	    	for(j=0;j<c;j++) {
	    		System.out.print("Enter element:");
	    		array[i][j]=input.nextInt();
	    	}
	    }
	       
	    for(i=0;i<r;i++) {
	    	for(j=0;j<c;j++) {
	    		System.out.print(" "+ array[i][j]);
	    	}
	       
	    	  	System.out.println();
	    }
	    
	    //Askes user for column 
	    int column;
	    System.out.println("Enter the column number:");
	    column=input.nextInt();
	    
	    //Calls averageRow function
	    double avg=averageRow(array,column);
	    System.out.println("Average of column "+ column + " is "+avg);
        
      
     	 
        input.close();
	}
	
	//AverageRow function
	private static double averageRow(double[][] array, int column) {
		int i;
		double sum = 0.0;
		
		//Calculates the sum of the column
		for(i=0; i<array[0].length; i++) {
			sum += array[i][0];
		}
		//Returns the average
		return (double) sum/array[0].length;
	}
}