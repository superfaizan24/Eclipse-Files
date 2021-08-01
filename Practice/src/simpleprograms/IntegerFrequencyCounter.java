package simpleprograms;

import java.util.Scanner;

public class IntegerFrequencyCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = Integer.parseInt(input.next());
		System.out.println("Enter the elements of the array");
		int a[] = new int[size];
		int i, count = 0;

		for (i = 0; i < size; i++) {
			a[i] = input.nextInt();
		}

		for (i = 0; i < size; i++) {
			if (a[i] == 2) {
				count++;
			}
		}
		System.out.println("The frequency of 2 in the array is " + count);

		input.close();
	}

}
