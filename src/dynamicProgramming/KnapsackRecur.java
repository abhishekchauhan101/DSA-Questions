package dynamicProgramming;
//RECURSIVE CODE
public class KnapsackRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int knap(int wt[],int val[],int W,int n) {
		if(n==0 || W==0) {
			return 0;
		}
		
		if(wt[n-1]<=W) {
			return Math.max(wt[n-1]+knap(wt,val,W-wt[n-1],n-1), knap(wt,val,W,n-1));
		}else {
			return knap(wt,val,W,n-1);
		}
	}

}
