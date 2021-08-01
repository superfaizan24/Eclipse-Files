package hackerankprograms.picking_numbers;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(4);
		a.add(6);
		a.add(5);
		a.add(3);
		a.add(3);
		a.add(1);
		System.out.println(Solution.pickingNumbers(a));

	}

}
