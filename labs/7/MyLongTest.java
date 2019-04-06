package lab7;

public class MyLongTest {

		public static void main(String[] args) {
			MyLong n1 = new MyLong(7);
			System.out.println("n1 is even? " + n1.isEven());
			System.out.println("n1 is prime? " + n1.isPrime());

			char[] chars = {'2', '4', '2', '8'};
			System.out.println(MyLong.parseLong(chars));

			String s = "3539";
			System.out.println(MyLong.parseLong(s));

			MyLong n2 = new MyLong(28);
			System.out.println("n2 is odd? " + n2.isOdd());
			System.out.println("n1 is equal to n2? " + n1.equals(n2));
			System.out.println("n1 is equal to 7? " + n1.equals(7));
			
		}
	}

