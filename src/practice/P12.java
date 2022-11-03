package practice;

import java.util.*;

public class P12 {
	
	static class pair{
		int first,second;
		public pair(int first,int second){
			this.first=first;
			this.second=second;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,2,3,4,5,9,7,8};
		int x=23;
		HashMap<Integer,pair> mp=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				mp.put(arr[i]+arr[j], new pair(i,j));
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(mp.containsKey(x-arr[i]+arr[j])) {
					pair p=mp.get(x=arr[i]+arr[j]);
					if(p.first!=i && p.second!=j  || p.first!=j && p.second!=i ) {
						//ADD THE POINTER TO ANS ARRAYLIST
					}
				}
				
			}
		}
		

	}
	

}
