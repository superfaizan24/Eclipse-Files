package simpleprograms;

import java.util.Scanner;

public class ArrayPositionReturner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int size = input.nextInt();
		int[] a = new int[size];
		int j, i;

		for (i = 0; i < size; i++) {
			a[i] = input.nextInt();
		}
		for (i = 0; i < size; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n Enter a number to be searched");
		int s = input.nextInt();
		
		int pos=-1;
		for(i=0;i<size;i++) {
			if(a[i]==s){
				pos=i+1;
			}
		}
		if(pos==-1) {
			System.out.println("Element is not present in the array");
		}
		else {
			System.out.println(pos);
		}
		//Linear Search/Sequential Search
		
		
		}
		
	}


