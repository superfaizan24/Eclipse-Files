package simpleprograms;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = input.nextInt();
		
		int a,b,c,i;
		
		if (n == 1)
			System.out.println(0);
		if (n == 2)
			System.out.println("0, 1");
		if(n>2) {
			a=0;
			b=1;
			System.out.print("0, 1");
			for(i=3;i<=n;i++) {
				c=a+b;
				System.out.print(", "+c);
				a=b;
				b=c;
				
			}
			
		}

	}
}
