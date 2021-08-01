package simpleprograms;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Word");
		String s = input.nextLine();
		char i;
		int j = 0;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a') {
				j++;
			}

		}
		System.out.println(j);

	}

}
