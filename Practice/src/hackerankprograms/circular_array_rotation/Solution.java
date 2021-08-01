package hackerankprograms.circular_array_rotation;

public class Solution {
	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int i,j,temp=a[0],temp1=0,temp2=0;
		int b[] = new int [a.length];
		for(j=0;j<k;j++) {
			b[0]=a[a.length-1];
		for(i=1;i<b.length;i++) {
			b[i]=a[i-1];
		}
		for(int x=0; x<a.length;x++) {
			a[x]=b[x];
		}
		}
		return b;
    }
}
