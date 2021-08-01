package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		String n;
		System.out.println("Enter the elements. Enter -1 to stop.");
		while (true) {
			n = input.nextLine();
			if (n.equals("-1")) {
				break;
			}
			al.add(n);

		}
		
		System.out.println(al.get(2));

		input.close();
	}

}
