package hackerankprograms.comparing_the_triplets;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(5);
		a.add(6);
		a.add(7);
		List<Integer> b=new ArrayList<Integer>();
		b.add(3);
		b.add(6);
		b.add(10);
		System.out.println(Solution.compareTriplets(a,b));

	}

}
