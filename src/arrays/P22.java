package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class P22 {

	public static void main(String[] args) {
		int arr[]={3, 1, 2, 2, 1, 2, 3, 3} ;
		int k=4;
		int n=8;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			}else {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
		}
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(hm.get(arr[i])>n/k) {
				ans.add(arr[i]);
			}
		}
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}

	}

}
