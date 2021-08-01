package simpleprograms;

import java.util.Scanner;

public class Pattern2 {
// This is pattern 1
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();
		int j;
		int i;
		for (i = 1; i <= n; i++) {
			for (j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	} 
} 
