package cmpt220Revised;
import java.util.Scanner;
import java.util.Random;


public class Lab_2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter");
		String str1 = input.nextLine();
		System.out.println("enter");
		String str2 = input.nextLine();
		
		int result = str1.compareTo(str2);
		if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
		
        }	
}
}



 