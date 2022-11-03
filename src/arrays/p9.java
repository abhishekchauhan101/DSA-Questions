package arrays;

import java.util.Arrays;

public class p9 {

	public static void main(String[] args) {
		int arr[] = {1, 5, 8, 10};
		int k=2,n=4;
		Arrays.sort(arr);
		int ans=arr[n-1]-arr[0];
		int min=arr[0]+k;
		int max=arr[n-1]-k;
		if(min>max) {
			int temp=min;
			min=max;
			max=temp;	
		}
		for(int i=0;i<n;i++) {
			int add=arr[i]+k;
			int sub=arr[i]-k;
			if(sub<=0) {
				continue;
			}
			if(sub>=min||add<=max) {
				continue;
			}
			if(max-sub<=add-min) {
				min=sub;
			}else {
				max=add;
			}
		}
		System.out.println( Math.min(ans, max-min));
	}

}
