package dynamicProgramming;
//MEMOIZING THE RECURSIVE CODE
public class KnapsackMemoization {

	public static void main(String[] args) {
		int n=3;
		int val[]= {1,2,3};
		int wt[]= {4,5,1};
		int W=4;
		System.out.println(knap(wt,val,W,n));

	}
	
	public static int[][] t=new int[102][102];
	
	public static int knap(int wt[],int val[],int W,int n) {		
		for(int i=0;i<102;i++) {
			for(int j=0;j<102;j++) {
				t[i][j]=-1;
			}
		}
		
		if(n==0 || W==0) {
			return 0;
		}
		if(t[n][W]!=-1) {
			return t[n][W];
		}
		
		if(wt[n-1]<=W) {
			return t[n][W]=Math.max(wt[n-1]+knap(wt,val,W-wt[n-1],n-1), knap(wt,val,W,n-1));
		}else {
			return t[n][W]=knap(wt,val,W,n-1);
		}
	}

}
