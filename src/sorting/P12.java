package sorting;

public class P12 {

	public static void main(String[] args) {
		int arr[]={5,5,10,100,10,5};
		int n=arr.length;
		int[] dp=new int[n];
		dp[0]=0;
		dp[1]=Math.max(arr[0], arr[1]);
		for(int i=2;i<n;i++) {
			dp[i]=Math.max(arr[i]+dp[i-2], dp[i-1]);
					
		
		}
		System.out.println(dp[n-1]);
		
	}

}
