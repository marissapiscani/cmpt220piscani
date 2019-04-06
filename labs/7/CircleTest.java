package lab7;

public class CircleTest {

		public static void main(String[] args) {
			
			
	        Circle c1 = new Circle(2, 2, 5.5);
	        Circle c2= new Circle();
	        System.out.println("C1 area = " + c1.getArea() + " perimeter = " + c1.getPerimeter());
	        System.out.println("Does circle 1 contain coordinate (3,3)? " + c1.contains(3, 3));
	        System.out.println("Does circle 1 contain circle 2? " + c1.contains(new Circle(4, 5, 10.5)));
	        System.out.println("Does circle 1 overlap circle 3? " + c1.overlaps(new Circle(3, 5, 2.3)));
	        System.out.println(c2.getX());
	        
	        
	    }

	}
