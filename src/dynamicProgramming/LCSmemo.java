package dynamicProgramming;

public class LCSmemo {
	static int[][] t=new int[1001][1001];
	public static void main(String[] args) {
		String a="abcdeh";
		String b="bacjif";
		int n=a.length();
		int m=b.length();
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[0].length;j++) {
				t[i][j]=-1;
			}
		}
		System.out.println(LCS(a,b,n,m,t));

	}
	
	public static int LCS(String a,String b,int n,int m,int[][] t) {
		if(n==0 || m==0) {
			return 0;
		}
		if(t[n][m]!=-1) {
			return t[n][n];
		}
		if(a.charAt(n-1)==b.charAt(m-1)) {
			return t[n][m]=1+LCS(a,b,n-1,m-1,t);
		}
		else{
			return t[n][m]=Math.max(LCS(a,b,n-1,m,t),LCS(a,b,n,m-1,t));
		}
	}
}
