package simpleprograms;

import java.util.Scanner;

public class LargestOrSmallest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int i;
		int max;
		System.out.println("Enter 10 numbers");

		for (i = 0; i < 10; i++)
			a[i] = input.nextInt();

		max = a[0];
		for (i = 1; i < 10; i++)
			if (a[i] > max)
				max = a[i];
		
		System.out.println(max);

	}

}
