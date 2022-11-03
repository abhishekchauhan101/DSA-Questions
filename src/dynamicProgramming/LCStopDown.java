package dynamicProgramming;

public class LCStopDown {

	public static void main(String[] args) {
		String s="acbedcgfd";
		String b="abcdknd";
		int n=s.length();
		int m=b.length();
		int[][] t=new int[n+1][m+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				t[i][j]=0;
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s.charAt(i-1)==b.charAt(j-1)) {
					t[i][j]=1+t[i-1][j-1];
				}
				else{
					t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
				}	
				
			}
		}
//		return t[n][m];
		
	}

}
