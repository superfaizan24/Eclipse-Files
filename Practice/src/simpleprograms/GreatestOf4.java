package simpleprograms;

import java.util.Scanner;

public class GreatestOf4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = input.nextInt();
		System.out.println("Enter another Number");
		int b = input.nextInt();
		System.out.println("Enter another Number");
		int c = input.nextInt();
		System.out.println("Enter another Number");
		int d = input.nextInt();
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println(a + " is the greatest number");
				}
				else {
					System.out.println(d + " is the greatest number");
				}
			}
		}
		if(b>a) {
			if(b>c) {
				if(b>d) {
					System.out.println(b + " is the greatest number");
				}
				else {
					System.out.println(d + " is the greatest number");
				}
				
			}
		}
		if(c>a) {
			if(c>b) {
				if(c>d) {
					System.out.println(c + " is the greatest number");
				}
				else {
					System.out.println(d + " is the greatest number");
				}
				
			}
		}
		
		
	}

}
