package recursion;
import java.util.*;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,1};
//		int sum=2;
//		ArrayList<Integer> ans=new ArrayList<>();
//		int s=0;
//		int i=0;
//		find(arr,ans,i,s, sum,arr.length-1);
		int arr[]=  {6, -3, -10, 0, 2};
		int n=arr.length;
		int max=arr[0];
		int min=arr[0];
		int pro=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<0) {
				int temp=max;
				max=min;
				min=temp;
			}
			max=Math.max(arr[i], arr[i]*max);
			min=Math.min(arr[i], arr[i]*min);
			pro=Math.max(max, pro);
		}
		System.out.println(pro);
		
		

	}
//	public static class Node{
//		int data;
//		Node next;
//		public  Node(int data) {
//			this.data=data;
//			this.next=null;
//			
//		}
//	}
//	public static void reverse(Node root) {
//		Node next=null;
//		Node pre=null;
//		Node cur=root;
//		while(cur!=null) {
//			next=cur.next;
//			cur.next=pre;
//			pre=cur;
//			cur=next;
//			
//			
//		}
//	}
//	public static void find(int[] arr,ArrayList<Integer> ans,int i, int s,int sum,int n) {
//		if(i==n) {
//			if(s==sum) {
//				for(int j=0;j<ans.size();j++) {
//					System.out.println(ans.get(j));
//				}
//			}
//		}
//		ans.add(arr[i]);
//		s+=arr[i];
//		find(arr,ans,i+1,s,sum,n);
//		s-=arr[i];
//		ans.remove(ans.size()-1);
//		find(arr,ans,i+1,s,sum,n);
//		
//	}
//	public static void find(int[] arr, ArrayList<ArrayList<Integer>> ans,boolean[] check,ArrayList<Integer> ds) {
//		int n=arr.length;
//		if(ds.size()==n) {
//			ans.add(ds);
//			return;
//		}
//		for(int i=0;i<n;i++) {
//			if(!check[i]) {
//				check[i]=true;
//				ds.add(arr[i]);
//				find(arr,ans,check,ds);
//				check[i]=false;
//				ds.remove(ds.size()-1);
//			}
//			
//		}
	
	

}
