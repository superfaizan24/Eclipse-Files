package hackerankprograms.jumping_on_the_clouds;

import java.util.List;

public class Solution {
	public static int jumpingOnClouds(List<Integer> c) {
		Integer[] arr = new Integer[c.size()];
        arr = c.toArray(arr);
        int i,count=0;
        for(i=0;i<arr.length-2;i++) {
        	if(arr[i+2]!=1) 
        		i++;
        		count++;
        	
        	
        }
        if(i==arr.length-1)
		return count;
        return count+1;        
	    }
    }

