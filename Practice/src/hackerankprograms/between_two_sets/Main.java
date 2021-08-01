package hackerankprograms.between_two_sets;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		List<Integer> b=new ArrayList<Integer>();
		a.add(16);
		a.add(32);
		a.add(96);
		System.out.println(Solution.getTotalX(a, b));

	}

}
