package simpleprograms;

import java.util.Scanner;

public class PallindromeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = input.nextInt();
		int temp = n;
		/*
		 * while(n!=0) { System.out.print(n%10); n/=10; }
		 */
//		String rev="";
//		while(n!=0) {
//			rev=rev+(n%10);
//			n/=10;
//			
//		}
//		int n1=Integer.parseInt(rev);
//		
//
//		
//		if(temp==n1) {
//			System.out.println("The number is a pallindrome number");
//		}
//		else {
//			System.out.println("The number is not a pallindrome number");
//		}

		int rev = 0;
		
		while(n!=0) {
			rev = rev*10 + (n%10);
			n/=10;
		}
		
		if(temp==rev) {
			System.out.println("The number is a pallindrome number");
		}
		else {
			System.out.println("The number is not a pallindrome number");
		}
		
	}

}