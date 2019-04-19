package lab8;


import java.util.ArrayList;
import java.util.Scanner;

public class Lab8_4 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			//Creates ArrayList
			ArrayList<Integer> list = new ArrayList<Integer>();

			//Enter 5 integers - user
			System.out.print("Enter 5 numbers: ");
				for (int i = 0; i < 5; i++) {
					list.add(input.nextInt());
				}

			//Sort list
			sort(list);

			//Displays in increasing order 
			System.out.println(list.toString());
					
			input.close();
		}
		
		//Sorting method
		public static void sort(ArrayList<Integer> list) {
			java.util.Collections.sort(list);		
		}
	}


