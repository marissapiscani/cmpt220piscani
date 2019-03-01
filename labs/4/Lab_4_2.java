package cmpt220Revised;

import java.util.Random;

public class Lab_4_2 {
	public static void main(String[] args) {
		char matrix[][] = new char[5][5];
		
		Random random = new Random();
		for(int i=0; i<5; i++) {
			for(int j=1; j<5; j++) {
				char c = (char)(random.nextInt(26)+'a');
				
				matrix[i][j] = c;
				System.out.print(matrix[i][j]+ " ");
				
				
			}
			System.out.print("\n");
		}
			
		
				
	}
	
}
