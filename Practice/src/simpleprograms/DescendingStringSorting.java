package simpleprograms;

import java.util.Scanner;

public class DescendingStringSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creating an object of Scanner class to accept input from the console
		System.out.println("Enter the size of the array");
		int size = input.nextInt(); // accepting the size of the array
		String a[] = new String[size]; // declaring an array with the given size
		int j;
		int i; // loop variable
		String temp;
		System.out.println("Enter " + size + " elements");
		
		// accepting numbers in the integer array
		for (i = 0; i < size; i++)
			a[i] = input.nextLine();

		// displaying the unsorted array

		System.out.println("\nThe unsorted array is ");
		for (i = 0; i < size; i++)
			System.out.print(a[i] + "\t");
		// Bubble sort logic
		for (i = 0; i < size; i++) {
			for (j = 0; j < size - i - 1; j++) {
				// Swapping Logic
				if (a[j].compareTo(a[j + 1])<0) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("\n \nThe sorted array is");
		for (i = 0; i < size; i++)
			System.out.print(a[i] + "\t");
	}
}
