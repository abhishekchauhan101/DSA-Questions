package dynamicProgramming;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String a="abcjdhfgdb";
		String b="abjfhgvkjsn";
		int n=a.length();
		int m=b.length();
		int[][] t=new int[n+1][m+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0 || j==0) {
					t[i][j]=0;
				}
			}
		}
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(a.charAt(i)==b.charAt(j)) {
					t[i][j]=1+t[i-1][j-1];
				}else {
					t[i][j]=0;
				}
			}
		}
		

	}

}
