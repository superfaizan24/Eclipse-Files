package simpleprograms;

import java.util.Scanner;

public class PerfectNumberArray {

	public static void main(String arr[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want in the array");
		int size = input.nextInt(); // to store the size of the array
		int[] a = new int[size]; // Declaring an array with user defined size
		int i,j; // Loop Variables
		int sum; // a variable to store the sum of factors of each element of the array
		
		// Accepting input in the array
		for (i = 0; i < size; i++)
			a[i] = input.nextInt(); 
		
		// Traversing the array and checking whether each element is a perfect number or not
		for (i = 0; i < size; i++) {
			sum = 0; // Initializing sum to 0 for each a[i]
			
			// Computing the sum of factors for a[i]
			for (j = 1; j <=a[i]; j++) {
				if (a[i] % j == 0) { 
					sum=sum+j;
				}
			}
			if(a[i]*2==sum) // Checking for perfect number condition for a[i]
			System.out.print(a[i] + "\t");
		}
	}
}