package simpleprograms;

import java.util.Scanner;

public class GreatestArrayNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int i = input.nextInt();
		int []a=new int[i];
		int j,max=a[0];
		
		for(j=0;j<i;j++) {
			a[j] = input.nextInt();
		}
		for(j=1;j<i;j++) {
			if(a[j] > max)
				max = a[j];
		}
		System.out.println(max);
		
		
		
		

	}

}
