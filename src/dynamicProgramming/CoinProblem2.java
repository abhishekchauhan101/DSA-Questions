package dynamicProgramming;

public class CoinProblem2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int sum=5;
		int n=3;
		int[][] t=new int[n+1][sum+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(i==0 ) {
					t[i][j]=Integer.MAX_VALUE-1;
				}
				if(j==0) {
					t[i][j]=0;
				}
				
				
			}
		}
		
		t[0][0]=Integer.MAX_VALUE-1;
		for(int i=1;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(j%arr[0]!=0) {
					t[i][j]=j/arr[0];
				}else {
					t[i][j]=Integer.MAX_VALUE-1;
				}
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<sum;j++) {
				if(arr[i-1]<=j) {
					t[i][j]=Math.min(1+t[i][j-arr[i-1]], t[i-1][j]);
				}else {
					t[i][j]=t[i-1][j];
				}
			}
		}
		

	}

}
