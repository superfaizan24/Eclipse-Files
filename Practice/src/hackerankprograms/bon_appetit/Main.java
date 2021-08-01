package hackerankprograms.bon_appetit;

import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		List<Integer> bill = new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);
		int k = 1;
		int b = 12;
		Solution.bonAppetit(bill, k, b);
	}

}
