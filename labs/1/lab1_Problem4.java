package cmpt220;

import java.util.Scanner;

public class lab1_Problem4 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter the mass (in kilograms):");
	double m = input.nextDouble();
	double c = 299972458;
	double E = m * c * c;
	System.out.println("The energy is" + E);
	}
	
	
}



