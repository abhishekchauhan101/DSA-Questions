package dynamicProgramming;

public class UnboundedKnap {

	public static void main(String[] args) {
		int n=4;
		int[] arr= {2,3,4,5,6};
		int[] w= {3,5,3,1,1};
		int wt=11;
		
		int[][] t=new int[n+1][wt+1];
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<wt+1;j++) {
				if(i==0 || j==0) {
					t[i][j]=0;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<wt;j++) {
				if(arr[i-1]<=wt) {
					t[i][j]=Math.max(w[i-1]+t[i][j-w[i-1]],t[i-1][j]);
				}else {
					t[i][j]=t[i-1][j];
				}
			}
		}
	}

}
