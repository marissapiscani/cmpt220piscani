package lab8;


import java.util.Scanner;


public class Lab8_1 {
	


		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

			//Tells user to enter sides of triangle
			System.out.print("Enter three side of the triangle: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();

			//Tells user to enter color
			System.out.print("Enter a color: ");
			String color = input.next();

			//Asks user if triangle is filled or not
			System.out.print("Is the triangle filled (true / false)? ");
			boolean filled = input.nextBoolean();

			//Creates triangle object with user input
			Triangle triangle = new Triangle(side1, side2, side3);
			triangle.setColor(color);
			triangle.setFilled(filled);

			System.out.println(triangle.toString());
			System.out.println("Area: " + triangle.getArea());
			System.out.println("Perimeter: " + triangle.getPerimeter());
			System.out.println("Color: " + triangle.getColor());
			System.out.println("The " + triangle.getColor() + " triangle is" + (triangle.isFilled() ? " " : " not ") 
						+ "filled.");
				
			input.close();
				
			}
	}

