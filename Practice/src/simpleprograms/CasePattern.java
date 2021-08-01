package simpleprograms;

import java.util.Scanner;

public class CasePattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creating an object of Scanner class to accept input from the console
		System.out.println("Enter Something");
		String s = input.nextLine(); // accepting the input from the user
		int i; // Loop variable
		
		// Even Digit Upper Case Logic
		for(i = 0; i <= s.length() - 1; i++) {
			if(i%2== 0) {
				if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					System.out.print((char)(s.charAt(i) + 32));
				}
				else {
					System.out.print((char)(s.charAt(i)));
				}
			}
			// Odd Digit Lower Case Logic
			 if(i%2!= 0) {
				if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					System.out.print((char)(s.charAt(i) - 32));
				}
				else {
					System.out.print((char)(s.charAt(i)));
				}
			}
		}
		
		
		input.close();
	}

}
