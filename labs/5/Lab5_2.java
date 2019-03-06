package cmpt220Revised;

import java.util.Scanner;

public class Lab5_2 {
	public static double deviation(double[] x){
		double dev = 0;
		double avg = mean(x);
		for(double d : x) {
			dev += Math.pow(Math.abs(avg - d),2);
		}
			return Math.sqrt(dev / x.length);
	}
	public static double mean(double[] x) {
		double sum = 0;
		for(double d : x) {
			sum += d;
		}
		return sum / x.length;
	}
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ten numbers : ");
		double[] nums = new double[10];
		for(int i = 0; i < 10; i++) {
			nums[i] = sc.nextDouble();
		}
		System.out.println("The mean is : " + mean(nums));
		System.out.println("The standard deviation is : " + deviation(nums));
	}
}






