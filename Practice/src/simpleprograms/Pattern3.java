package simpleprograms;

import java.util.Scanner;

public class Pattern3 {
// This is pattern 1
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();
		int j;
		int i;
		int k;
		for (i = 1; i <= n; i++) {
			for(k=1;k<=n-i;k++)
				System.out.print(" ");
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}