package simpleprograms;

import java.util.Scanner;

public class LargerOrSmaller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = input.nextInt();
		System.out.println("Enter number 2:");
		int b = input.nextInt();

		/*
		 * if (a > b) System.out.println(a); else System.out.println(b);
		 */
		
		System.out.println(a>b?a:b + " is larger");
	

	}
}