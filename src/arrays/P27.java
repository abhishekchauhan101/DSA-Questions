package arrays;

public class P27 {

	public static void main(String[] args) {
		int arr[] = {1, 10, 5, 2, 7};
		int n=arr.length;
		int x=9;
		int len=n+1;
		int i=0,j=0;
		int sum=0;
		while(i<n ) {
			sum+=arr[i];
			i++;
			while(sum<=x && j<n) {
				if(i-j<len) {
					len=i-j;
				}
			}
			sum-=arr[j++];
			
			
		}
		System.out.println(sum);
		
	}

}
