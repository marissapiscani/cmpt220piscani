package cmpt220Revised;

import java.util.Scanner;

public class Lab5_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students in the class: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];
		System.out.println("Enter the name and then that students grade:");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}

		sortDecreasing(students, scores);
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i] +" " +  scores[i]);
		}
	}
	public static void sortDecreasing(String[] strs, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int maxIndex = i;
			String temp;
		for (int j = i + 1; j < nums.length; j++) {
			if (nums[j] > max) {
				max = nums[j];
				maxIndex = j;
				}
			}
			if (maxIndex != i) {
				temp = strs[i];
				strs[i] = strs[maxIndex];
				strs[maxIndex] = temp;
				nums[maxIndex] = nums[i];
				nums[i] = max;
			}
		}
	}
} 
