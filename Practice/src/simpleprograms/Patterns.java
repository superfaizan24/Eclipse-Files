package simpleprograms;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(
				"Which pattern do you want to see\n Pattern 1\n Pattern 2\n Pattern 3\n Pattern 4\n Pattern 5\n Pattern 6\n Pattern 7\n Pattern 8\n Pattern 9\n Pattern 10\n Enter your Choice:");
		int choice = input.nextInt();
		int a, b, c, d, e, f, g, h, i, j, k, l, m, o, p;

		if (choice == 1) {
			for (i = 1; i <= 2; i++) {
				for (j = 1; j <= 4; j++) {

					System.out.print(j);
				}
				System.out.println();

			}

		} else if (choice == 2) {
			System.out.println("Enter a number");
			int n = input.nextInt();

			for (i = 1; i <= n; i++) {
				for (j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		} else if (choice == 3) {
			
		} else if (choice == 4) {

		} else if (choice == 5) {

		} else if (choice == 6) {

		} else if (choice == 7) {

		} else if (choice == 8) {

		} else if (choice == 9) {

		} else if (choice == 10) {

		}

	}

}
