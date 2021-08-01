package simpleprograms;

import java.util.Scanner;

public class Pattern10 {
public static void main(String arr[]) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a Number");
int n = input.nextInt();

int i;
int j;


for (i = 100; i>100-n; i--) {
			for(j=100;j>=i;j--)
				System.out.print(j+" ");
	System.out.println();
}

}

}
