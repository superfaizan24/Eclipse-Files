package hackerankprograms.migratory_birds;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(4);
		a.add(4);
		a.add(4);
		a.add(5);
		a.add(3);
		System.out.println(Solution.migratoryBirds(a));
	}

}