package hackerankprograms.grading_students;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		System.out.println(Solution.gradingStudents(grades));
	}

}
