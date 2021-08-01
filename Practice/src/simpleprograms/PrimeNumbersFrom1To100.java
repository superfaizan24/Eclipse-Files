package simpleprograms;

import java.util.Scanner;

public class PrimeNumbersFrom1To100 {

	public static void main(String[] args) {
		long i, j, f, n = 100;
		for (i = 1; i <= n; i++) {
			f = 0;
			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					break;
			}
			if (f == 0)
				System.out.println(i + "\t");
		}
	}
}