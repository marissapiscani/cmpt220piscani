package lab10;

public class SportCar implements Printable {
	String name;
	long number;

	SportCar(String name, long number) {
		this.name = name;
		this.number = number;
	}
	public void print() {
		System.out.println("SportCar name= " + this.name + " number= " + this.number);

	}
}
