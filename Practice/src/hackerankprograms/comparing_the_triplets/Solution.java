package hackerankprograms.comparing_the_triplets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int counta=0,countb=0;
		if(a.get(0)>b.get(0)) {
			counta++;
		}
		else if(a.get(0)<b.get(0)){
			countb++;
		}
		if(a.get(1)>b.get(1)) {
			counta++;
		}
		else if(a.get(1)<b.get(1)) {
			countb++;
		}
		if(a.get(2)>b.get(2)) {
			counta++;
		}
		else if(a.get(2)<b.get(2)) {
			countb++;
		}
		List<Integer> c=new ArrayList<Integer>();
		c.add(counta);
		c.add(countb);
		return c;
	}

}
