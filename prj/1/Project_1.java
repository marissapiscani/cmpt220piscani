package cmpt220Revised;
// Package Name


//Calling Scanner
import java.util.*;
import java.lang.*;


public class Project_1 {
	// Project 1 start Class
	public static void main (String[] args) {
	        // Declared Main method

	        int h = 0,  w = 0, b = 0;

	        Scanner input = new Scanner(System.in);
	        h = input.nextInt();

	        w = input.nextInt();

	        b = input.nextInt();
	        // take input

	        boolean completedWall = false;
	        int width = 0;
	        int height = 0;
	        // While loop
	        while (b!=0) {
	            b--;
	            int s = 0;
	            s = input.nextInt();
	            if (height < h) {
	                width += s;
	                if (width == w) {
	                    ++height;
	                    width = 0;
	                } else if (width > w) {
	                    height = h + 1;
	                }
	                if (height == h)
	                    completedWall = true;
	            }
	        }
	        if (completedWall){
	            System.out.println("yes");
	        }
	        else {
	            System.out.println("No");
	        }
	    }
	}





