package simpleprograms;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");

		int a = input.nextInt();

		if (a % 3 == 0)
			System.out.println("The number is divisible by three.");

		else
			System.out.println("The number is not divisible by three");

	}

}
