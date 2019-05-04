package lab10;

public class Rectangle implements Printable {
	double width = 1;
	double height = 1;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void print() {
		System.out.println("Rectangle with width= " + this.width + " height= " + this.height);

	}
}