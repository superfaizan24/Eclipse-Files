package simpleprograms;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creating an object of Scanner class to accept input from the console
		System.out.println("Enter the size of the array");
		int size = input.nextInt(); // accepting the size of the array
		System.out.println("Enter the elements of the array");
		int a[] = new int [size]; // declaring an integer with the given size
		int i; // loop variables
		
		// accepting numbers in the integer array
		for(i=0;i<size;i++) {
			a[i] = input.nextInt();
		}
		
		// displaying the inputed array
		System.out.println("The entered array is:");
		for(i=0;i<size;i++) {
			System.out.print(a[i] + "\t");
		}
		
		int b[] = new int [size]; // creating an array equal to array a
		
		// Reversing Logic
		for(i=0;i<size;i++) {
			b[size-i-1] = a[i];
		}
		// displaying the reversed array
		System.out.println("\n\nThe reversed array is:\n");
		for(i=0;i<size;i++) {
			System.out.print(b[i] + "\t");
		}
		
		
		
		input.close();
	}

}
