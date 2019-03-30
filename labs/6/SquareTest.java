package lab6;

public class SquareTest {
	public static void main(String[] args) {
			Square sq1 = new Square(40);
			Square sq2 = new Square(35.9);

			System.out.print("Square 1 \n");
			System.out.println("Width: " + sq1.width);	
			System.out.println("Area: " + sq1.getArea());
			System.out.println("Perimeter: " + sq1.getPerimeter());

			System.out.println();
				
			System.out.print("Square 2 \n");
			System.out.println("Width: " + sq2.width);
			System.out.println("Area: " + sq2.getArea());
			System.out.println("Perimeter: " + sq2.getPerimeter());

			}
		}
