package dynamicProgramming;

import java.util.ArrayList;

public class SubSetMinDifference {

	public static void main(String[] args) {
		int n=5;
		int sum=11;
		int arr[]= {2,3,7,8,10};
		int range=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		ArrayList<Integer> ans=new ArrayList<>();
		boolean t[][]=sub(arr,n,sum,range);
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(j==n+1 && t[i][j]==true) {
					ans.add(i);
				}
			}
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<ans.size();i++) {
			min=Math.min(min, range-2*ans.get(i));
		}
		System.out.println(min);
			
	}
	
	public static boolean[][] sub(int[] arr,int n,int sum,int range){
		
		boolean[][] t=new boolean[n+1][sum+1];
		
		
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(i==0) {
					t[i][j]=false;
				}
				if(j==0) {
					t[i][j]=true;
				}
				
				
			}
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<sum;j++) {
				if(arr[i-1]<=j) {
					t[i][j]=t[i-1][j-arr[i-1]]||t[i-1][j];
				}
				else {
					t[i][j]=t[i-1][j];
				}
				
			}
		}
		return t;
	}
	
	
}
