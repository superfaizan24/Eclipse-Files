package simpleprograms;

import java.util.Scanner;

public class NumberOfFactor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = input.nextInt();
		int i, f = 0;

		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				f++;
			}
		}
		System.out.println("Number of factors of " + n + " = " + f);
	}

}
