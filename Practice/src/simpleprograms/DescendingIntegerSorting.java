package simpleprograms;

import java.util.Scanner;

public class DescendingIntegerSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creating an object of Scanner class to accept input from the console
		System.out.println("Enter the size of the array");
		int size = input.nextInt(); // accepting the size of the array
		int a[] = new int[size]; // declaring an array with the given size
		int j, temp;
		int i; // loop variable
		System.out.println("Enter " + size + " numbers");
		
		// accepting numbers in the integer array
		for (i = 0; i < size; i++)
			a[i] = input.nextInt();

		// displaying the unsorted array

		System.out.println("\nThe unsorted array is ");
		for (i = 0; i < size; i++)
			System.out.print(a[i] + "\t");
		// Bubble sort logic
		for (i = 0; i < size; i++) {
			for (j = 0; j < size - i - 1; j++) {
				// Swapping Logic
				if (a[j] < a[j + 1]) {
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
