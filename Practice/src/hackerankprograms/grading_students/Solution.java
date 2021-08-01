package hackerankprograms.grading_students;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<Integer> gradingStudents(List<Integer> grades) {
		int i;
		List<Integer> roundedGrades = new ArrayList<Integer>();
		for (i = 0; i < grades.size(); i++)
			if ((grades.get(i) % 5 == 3 || grades.get(i) % 5 == 4) && (grades.get(i) >= 38))
				roundedGrades.add(grades.get(i) + 5 - grades.get(i) % 5);
			else
				roundedGrades.add(grades.get(i));

		return roundedGrades;
	}
}
