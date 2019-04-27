package lab9;

import java.util.*;

public class Lab9_1 {
	public static void main(String[] args){
		int n=100,i;
		Random r=new Random();
		Scanner input = new Scanner(System.in);
		int []a=new int[n];
		for(i=0;i<n;i++)
			a[i]=r.nextInt();
		System.out.println("Your Array");
		for(i=0;i<n;i++)
			{System.out.print(a[i]+" ");
			if((i+1)%10==0)
				System.out.println();
			}
		System.out.println();
		for(; ;)
		{System.out.print("What element do you want to see the value: ");
	    	i=input.nextInt();
	    	if(i<0||i>=n)
	    		System.out.println("index Out of Bounds.");
	    	else
	    		System.out.println(a[i]);
	       
	    }
	}}

