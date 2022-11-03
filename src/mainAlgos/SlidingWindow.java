package mainAlgos;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,1,4,5,2,3,6};
		int n=arr.length;
		int k=3;
		int[] ans=new int[n-k+1];
		Deque<Integer> dq=new LinkedList<>();
		int idx=-1;
		for(int i=0;i<n;i++) {
			while(!dq.isEmpty() && dq.peek()==i-k) {
				dq.poll();
			}
			
			while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]) {
				dq.pollLast();
			}
			
			dq.offer(i);
			if(i>=k-1) {
				ans[idx++]=arr[dq.peek()];
			}
		}

	}

}
