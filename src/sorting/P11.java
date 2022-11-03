package sorting;

import java.util.Arrays;

public class P11 {

	public static void main(String[] args) {
		int arr[]={10,2,3,4,5,7,8};
		int n=arr.length;
		int k=23;
		Arrays.sort(arr);
		for(int i=0;i<n-3;i++) {
			if(arr[i]>0&&arr[i]>k) {
				break;
			}
			for(int j=i+1;j<n-2;j++) {
				int left=j+1;
				int right=n-1;
				while(left<right) {
					int old_l=left;
					int old_r=right;
					int sum=arr[i]+arr[j]+arr[left]+arr[right];
					if(sum==k) {
						//add array elements to arraylist
						while(left<right && arr[left]==arr[old_l]) left++;
						while(left<right && arr[right]==arr[old_r]) right--;
					}
					else if(sum>k) {
						right--;
					}else {
						left++;
					}
				}
			}
		}

	}

}
