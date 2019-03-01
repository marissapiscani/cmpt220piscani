package cmpt220Revised;

public class Lab_4_6 {
	public static void main(String[] args) {
		int a[]= {-1};
		for(int i=1; i<=10; i++) {
		a=addInt(a,i);
		}
		
		System.out.println("Contents of the array ");
		for(int i:a) System.out.print(i+" ");
		System.out.println();
		a=insert(a,10,3);
		
		System.out.println("\nafter insertion of 10 at position 3");
		for(int i:a) System.out.print(i+" ");
		
		System.out.println();
		
		a=insert(a,100,7);
		System.out.print("\nafter insertion of 100 at position 7");
		for(int i:a) System.out.print(i+" ");
		System.out.println();
			
		}

	

		private static int[] insert(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}



		private static int[] addInt(int[] a, int n) {
		
		int b[]= new int[a.length+1];
		for(int i=0; i<a.length-1;i++) {
		b[i]=a[i];
		
		}
			
		b[b.length-2]=n;
		
		b[b.length-1]=-1;
		
		return b;
	
	}
	
}
	
	
	
	