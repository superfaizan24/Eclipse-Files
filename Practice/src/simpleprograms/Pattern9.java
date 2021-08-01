package simpleprograms;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = input.nextInt();
		int i;
		int j;
		int l = 1;
		for (i = 10; i < 2*n+10; i=i+2) {
			for (j = 10; j <= i; j=j+2) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}

	}

}
