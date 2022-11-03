package arrays;

import java.util.*;

public class P6 {

	public static void main(String[] args) {
		int arr[]= {23,13,35,2,4};
		int n=arr.length;
		int arr2[]= {66,78,99};
		int m=arr2.length;
		HashSet<Integer> hm=new HashSet<>();
		for(int i=0;i<n;i++) {
			hm.add(arr[i]);
		}
		for(int i=0;i<m;i++) {
			if(!hm.contains(arr2[i])) {
				hm.add(arr2[i]);
			}else {
				break;
			}
		}
		for(int i=0;i<hm.size();i++) {
			System.out.println(hm.iterator());
		}
		
		

	}

}
