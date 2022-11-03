package arrays;

import java.util.Arrays;

public class P13 {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int n=arr.length;
		int idx=n-2;
		while(idx>=0 && arr[idx]>=arr[idx+1]) {
			idx--;
		}
		if(idx==-1) {
			Arrays.sort(arr);
		}
		for(int i=n-1;i>=0;i--) {
			if(arr[i]>arr[idx]) {
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
			}
		}
		Arrays.sort(arr,idx+1,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
