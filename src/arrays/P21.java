package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P21 {

	public static void main(String[] args) {
		int arr[] ={2,6,1,9,4,5,3};
		Arrays.sort(arr);
		int count=0,c=0;
		int i=0,j=1;
		while(i<arr.length &&j<arr.length) {
			if(arr[j]==arr[i]+1) {
				count++;
				i++;
				j++;
			}else {
				c++;
				i++;
				j++;
			}
			count=Math.max(count, c);
			c=0;
		}
		System.out.println(count);
		
		
		
		//2ND SOLUTION USING SETS
//		Set<Integer> s=new HashSet<>();
//		for(int i=0;i<arr.length;i++) {
//			s.add(arr[i]);
//		}
//		int ans=0;
//		for(int i=0;i<arr.length;i++) {
//			if(!s.contains(arr[i]-1)) {
//				int j=arr[i];
//				while(s.contains(j)) {
//					j++;
//					if(ans<j-arr[i]) {
//						ans=j-arr[i];
//					}
//				}
//			}
//			
//		}
//		System.out.println(ans);
	}

}
