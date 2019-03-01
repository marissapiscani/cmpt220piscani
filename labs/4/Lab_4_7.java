package cmpt220Revised;

import java.util.Scanner;

public class Lab_4_7 {
	public static void main(String[] args){
		
		int[] elements = new int[20];

		
		int initial_element,next_element;
		int i;
		

		Scanner in = new Scanner(System.in);
		
	
		System.out.print("Enter size you want array to be: ");
		int size = in.nextInt();
		
		
		System.out.println("Name elements in the array :");

		for(i=0;i<size;++i)
		{
			System.out.print("Enter array elements of index " +i +": ");
			elements[i] = in.nextInt();
		}

		
		System.out.println("Before duplicates are removed the array is :");

		
		for(i=0;i<size;++i)
		{
			System.out.println(elements[i]);
		}

		
		System.out.println("After removing duplicate elements of the array, the elements are :");
		for(initial_element=0;initial_element<size;++initial_element)
		{
			for(next_element=initial_element+1;next_element<size;){
				
				if(elements[initial_element] == elements[next_element]){
					for(int temp = next_element; temp<size; ++temp){
						elements[temp] = elements[temp+1];
					}
					size = size-1;		
				}		
				else
					next_element++;		
			}
		}
		
		
		for(i=0;i<size;++i)
			System.out.println(elements[i]);
	}

}




