package hackerankprograms.minimum_distances;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	static List<Integer> minimumDistances(int[] a) {
		List<Integer> store=new ArrayList<Integer>();
		int i,j,k;
		for(i=0;i<a.length;i++) {
 			for(j=0;j<a.length-i-1;j++) {
				if (a[j] > a[j + 1]) {
					k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;
				}
			}
		}
	
//		for(i=0;i<a.length-2;i++) {
//			if(a[i]==a[i+1]&&a[i]!=a[i+2]) {
//				store.add(a[i]);
//			}
			
//		}
		i=0;
		int count;
		while(i<a.length-1) {
			count=1;
			while(a[i]==a[i+1]) {
				count++;
				i++;
			}
			if(count==2) {
				store.add(a[i]);
			}
			i++;
		}
//		if(count==2) {
//		if(a[a.length-2]==a[a.length-1]&&a[a.length-2]!=a[a.length-3]) {
//			store.add(a[a.length-2]);
//		}
//		}
//		System.out.println(store);
		return store;


    }
}
