package arrays;

import java.util.Arrays;

public class P26 {

	public static void main(String[] args) {
		int arr[]= {3, 4, 1, 9, 56, 7, 9, 12};
		int n=8;
		int m=5;
		Arrays.sort(arr);
		int i=0;
		int ans=Integer.MAX_VALUE;
		while(i<n) {
			int j=i;
			ans=Math.min(ans, arr[m+i]-arr[j]);
			i++;
		}
		System.out.println(ans);
	}
}






