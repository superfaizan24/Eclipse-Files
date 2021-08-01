package simpleprograms;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		int c = 0;
		if (number == 0) {
			System.out.println("1");
		} else {
			while (number != 0) {
				number = number / 10;
				c++;
			}
			System.out.println(c);

		}
	}
}