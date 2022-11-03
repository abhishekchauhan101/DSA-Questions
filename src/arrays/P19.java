package arrays;

import java.util.*;

public class P19 {

	public static void main(String[] args) {
		int arr[]= {4,2,-3,1,6};
		int ans=-1;
		Set<Integer> s=new HashSet<>();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			s.add(sum);
			sum+=arr[i];
			if(s.contains(sum)) {
				ans=1;
			}
		}
		System.out.println(ans);
		

	}

}
