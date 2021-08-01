package simpleprograms;

import java.util.Scanner;

public class PositionerArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creating an object of Scanner class to accept input from the console
		System.out.println("Enter the size of the array");
		int size = input.nextInt(); // Accepting the size of the array as input from the user
		System.out.println("Enter the elements of the array:");
		int i;// Loop variable
		int evenCount = 0, oddCount = 0; // Counters for even and odd numbers respectively, both initialized to zero
		int a[] = new int[size]; // Declaring an integer array with user defined size
		// Accepting inputs in the array
		for (i = 0; i < size; i++) {
			a[i] = input.nextInt();
		}
		// Displaying the array
		System.out.println("Entered array is:\n");
		for (i = 0; i < size; i++) {
			System.out.print(a[i] + "\t"); // Using print function instead of println function to display the elements
											// in a single line, \t is used for tab spaces
		}
		System.out.println("\n"); // For a new line
		// Calculating the even and odd numbers in the array and storing it in evenCount
		// and oddCount respectively
		for (i = 0; i < size; i++) 
			if (a[i] % 2 == 0)
				evenCount++;
			else
				oddCount++;

		int even[] = new int[evenCount]; // To declare an integer array with even elements
		int odd[] = new int[oddCount]; // To declare an integer array with odd elements
		int ec = 0, oc = 0; // Loop variables 
		// To store evenCount and oddCount in the respective arrays
		for (i = 0; i < size; i++)
			if (a[i] % 2 == 0)
				even[ec++] = a[i];
			else
				odd[oc++] = a[i];
		
		System.out.println("\nThe even elements are: ");
		for (i = 0; i < evenCount; i++) {
			System.out.println(even[i] + "\t");
		}
		System.out.println("\nThe odd elements are: ");
		for (i = 0; i < oddCount; i++) {
			System.out.println(odd[i] + "\t");
		}

		input.close();
	}

}
