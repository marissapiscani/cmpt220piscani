package cmpt220Revised;

import java.text.DecimalFormat;

public class Lab_4_1 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print("\n in cm | cm in");
		System.out.print("\n------------------");
		
		for(int i=0, j=1;i<51;) {
			System.out.printf("\n%2d ",i);
			
			System.out.print(df.format(i*2.54));
			
			System.out.printf(" |%3d " ,j);
			
			System.out.print(df.format(j*0.393701));
			
			i=i+1; // increments i by 1
			
			j=j+5;
			
			
			
		}
	}
}

