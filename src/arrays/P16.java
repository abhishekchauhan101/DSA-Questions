package arrays;

import java.util.HashMap;

public class P16 {

	public static void main(String[] args) {
		int arr[] = {1, 1, 1, 1};
		int i=0,j=1;
		int n=arr.length;
		int k=2;
		//WITHOUT HASHES
//		int count=0;
//		while(i<n && j<n) {
//			if(arr[i]+arr[j]==k) {
//				count++;;
//				j++;
//			}else {
//				i++;
//				j++;
//			}
//			
//		}
//		System.out.println(count);
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(i=0;i<n;i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 0);
			}else {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
		}
		int count=0;
		for(i=0;i<n;i++) {
			if(hm.containsKey(k-arr[i])) {
				count+=hm.get(arr[i]);
			}
			if(k-arr[i]==arr[i]) {
				count--;
			}
		}
		System.out.println(count);

	}

}
