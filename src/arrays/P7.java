package arrays;

public class P7 {

	public static void main(String[] args) {
		int arr[]= {3,7,9,4,1};
		int n=arr.length;
		int x=arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=x;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
