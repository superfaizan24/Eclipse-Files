package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the size of the array");
//		int size = input.nextInt();
//		System.out.println("Enter the elements of the array");
//		int a[] = new int[size];
//		int i;
//
//		for (i = 0; i < size; i++) {
//			a[i] = input.nextInt();
//		}
//
//		for (i = 0; i < size; i++) {
//			System.out.println(a[i]);
//		}
		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(5);
//		al.add(7);
//		al.add(9);
//		al.add(10);
		int i, n;
		System.out.println("Enter the elements. Enter -1 to stop.");
		while (true) {
			n = input.nextInt();
			if (n == -1) {
				break;
			}
			al.add(n);

		}
		System.out.println(al);

		input.close();

	}

}
