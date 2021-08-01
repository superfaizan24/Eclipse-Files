package simpleprograms;

import java.util.Scanner;

public class MaximumString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many words do you want to enter");
		int size = Integer.parseInt(input.nextLine()); // to store the size of the array
		String a[] = new String[size]; // to store the user defined size of the array
		System.out.println("Enter some words");
		
		int i;
		
		// accepting String inputs in the array
		for(i=0; i < size; i++) 
		a[i] = input.nextLine();
		
		for(i=0; i < size; i++)
		System.out.println(a[i]); 
		
		
		

	}

}
