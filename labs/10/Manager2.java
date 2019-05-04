package lab10;

public class Manager2 implements Printable {


		String name;
		long deptNumber;

		Manager2(String name, long deptNumber) {
			this.name = name;
			this.deptNumber = deptNumber;
		}
		public void print() {
			System.out.println("Manager name= " + this.name + " deptNumber= " + this.deptNumber);

		}
	}