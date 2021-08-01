package simpleprograms;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = input.nextInt();
		int i;
		int sum=1;
		for (i = 2; i <=n/2; i++) {
			if (n % i == 0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("The number is a perfect number");
		}
		else {
			System.out.println("The number is not a perfect number");
		}
		
		

	}

}
