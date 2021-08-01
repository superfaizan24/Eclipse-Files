package hackerankprograms.birthday_chocolate;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> s=new ArrayList<Integer>();
		s.add(2);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		int d = 4,m=2;
		System.out.println(Solution.birthday(s, d, m));

	}

}
