package arrays;

public class P29 {

	public static void main(String[] args) {
		int arr[ ] = {2, 1, 5, 6, 3};
		int el=0;
		int n=arr.length;
		int k=3;
		for(int i=0;i<n;i++) {
			if(arr[i]<k) {
				el++;
			}
		}
		int bad=0;
		for(int i=0;i<el;i++) {
			if(arr[i]>k) {
				bad++;
			}
		}
		int ans=bad;
		for(int i=0,j=el;j<n;i++,j++) {
			if(arr[i]>k) {
				bad--;
			}
			if(arr[j]>k) {
				bad++;
			}
			ans=Math.min(ans, bad);
			
		}
		System.out.println(ans);
		
	}

}
