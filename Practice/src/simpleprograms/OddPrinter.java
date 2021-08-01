package simpleprograms;

import java.util.Scanner;

public class OddPrinter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of numbers:-");
		int n = input.nextInt();
		int[] a = new int[n];

		System.out.println("Enter " + n + " numbers:");

		int i;

		for (i = 0; i < n; i++)
			a[i] = input.nextInt();

		for (i = 0; i < n; i++)
			if (a[i] % 2 != 0)
				System.out.println(a[i] + "\t");

	}

}
