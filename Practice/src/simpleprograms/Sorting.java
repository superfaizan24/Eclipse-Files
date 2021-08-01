package simpleprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sorting {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Creating an object of Buffered
																					// reader class to accept an input
																					// from the console
		System.out.println("Enter the size of the array");
		int size = Integer.parseInt(br.readLine()); // Accepting the size of the array from the user
		System.out.println("Enter the elements of the array");
		String a[] = new String[size]; // Declaring a String array with user defined size
		int i, j; // Loop variables
		String temp; // Temporary variable to swap the Strings
		// To accept the elements of the array from the user
		for (i = 0; i < size; i++) {
			a[i] = br.readLine();
		}

		// TO print the unsorted array
		System.out.println("The unsorted array is:");
		for (i = 0; i < size; i++) {
			System.out.println(a[i] + "\t");
		}
		// Bubble sort algorithm
		for (i = 0; i < size; i++) {
			for (j = 0; j < size - i - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					// Swapping logic a[j] and a[j+1]
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		// To print the unsorted array
		System.out.println("\n \nThe sorted array is:");
		for (i = 0; i < size; i++) {
			System.out.println(a[i] + "\t");
		}

	}

}
