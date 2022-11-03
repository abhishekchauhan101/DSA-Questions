package dynamicProgramming;

public class KnapSackTopDown {

	public static void main(String[] args) {
		
		int n=3;
		int W=4;
		int[][] t=new int[n+1][W+1];
		int val[]= {1,2,3};
		int wt[]= {4,5,1};
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<W+1;j++) {
				if(i==0 || j==0) {
					t[i][j]=0;
					
				}
				else if(wt[i-1]<=j) {
					t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][W]);
				}
				else {
					t[i][j]=t[i-1][W];
					
				}
			}
		}
		System.out.println(t[n][W]);

	}

}
