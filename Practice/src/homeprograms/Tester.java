package homeprograms;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = input.nextInt();
		int a[] = new int [size];
		int i;
		for(i=0;i<size;i++) {
			a[i]=input.nextInt();
		}
		for(i=0;i<size;i++) {
			delete(a[1]);
		}
		for(i=0;i<size;i++) {
			System.out.println(a[i]);
		}
	}

	private static void delete(int i) {
		// TODO Auto-generated method stub
		
	}

}
