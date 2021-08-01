package simpleprograms;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int n = input.nextInt();
		int m = input.nextInt();
		int o = input.nextInt();

		if (m > n) {
			if (m > o)
				System.out.println(m);
			else
				System.out.println(o);
		} else {
			if (n > o)
				System.out.println(n);
			else
				System.out.println(o);

		}

	}
}