package simpleprograms;

import java.util.Scanner;

public class EvenSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the size of the array");
		int size = input.nextInt(); 
		int a[] = new int[size];
		int i;
		
		for(i=0;i<size;i++) {
			a[i] = input.nextInt();
		}
	}

}
