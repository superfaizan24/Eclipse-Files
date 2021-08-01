package simpleprograms;

import java.util.Scanner;

public class DigitAdder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		int num = number;
		int rem, sum = 0;
		while (number != 0) {
			rem = number % 10; // To fetch the last digit of the number
			sum = sum + (rem * rem * rem);
			number = number / 10; // To remove the last digit
		}
		System.out.println(sum );

	}

}
