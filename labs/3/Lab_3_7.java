package cmpt220Revised;

public class Lab_3_7 {
	public static void main(String[] args){
        System.out.println("The first 50 pentagonal number are:");
        for (int i = 1; i < 51; i++){
            System.out.printf("%7d ", getPentagonalNumber(i));
            if (i % 10 == 0)
                System.out.println();
        }
    }

    public static int getPentagonalNumber(int n){
        return (n * (3 * n - 1)) / 2;
    }

}




    