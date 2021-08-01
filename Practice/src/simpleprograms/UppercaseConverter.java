package simpleprograms;

import java.util.Scanner;

public class UppercaseConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creating an object of Scanner class to accept input from the console
		System.out.println("Enter Something");
		String s = input.nextLine(); // accepting the input from the user
		int i; // Loop Variables
		
		// Converting Logic
		System.out.println("The uppercase form of the input is: ");
		for (i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				System.out.print((char)(s.charAt(i) - 32));
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
		input.close();
	}
}
