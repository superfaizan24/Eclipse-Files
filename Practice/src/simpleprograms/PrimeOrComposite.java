package simpleprograms;

import java.util.Scanner;

public class PrimeOrComposite {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = input.nextInt();
		int i, f = 0;
		if (n == 1) {
			System.out.println("1 is neither prime or composite");
		} else {
			for (i = 1; i <= n; i++) {
				if (n % i == 0) {
					f++;
				}
			}

			if (f > 2) {
				System.out.println("The number is a composite number");
			} else {
				System.out.println("The number is a prime number");
			}
		}

	}

}
