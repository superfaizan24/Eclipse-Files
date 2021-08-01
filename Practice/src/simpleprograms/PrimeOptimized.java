package simpleprograms;

import java.util.Scanner;

public class PrimeOptimized {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// System.out.println("Enter a Number");
		// int n = input.nextInt();
		long n = 104787656;
		long i, f = 0;
		// Logic Starts
		long nano_startTime = System.nanoTime();

		if (n <= 1)
			System.out.println(n + " is not a prime number.");
		else {
			for (i = 1; i < (int)Math.sqrt(n); i++)
				if (n % i == 0)
					break;
			if (f == 0)
				System.out.println(n + " is not a prime number.");
			else
				System.out.println(n + " is a prime number.");
		}
		// Logic ends

		System.out.println(System.nanoTime() - nano_startTime);

	}

}
