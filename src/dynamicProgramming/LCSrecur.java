package dynamicProgramming;

public class LCSrecur {

	public static void main(String[] args) {
		String a="abcdeh";
		String b="bacjif";
		int n=a.length();
		int m=b.length();
		System.out.println(LCS(a,b,n,m));

	}
	
	public static int LCS(String a,String b,int n,int m) {
		if(n==0 || m==0) {
			return 0;
		}
		if(a.charAt(n-1)==b.charAt(m-1)) {
			return 1+LCS(a,b,n-1,m-1);
		}
		else{
			return Math.max(LCS(a,b,n-1,m),LCS(a,b,n,m-1));
		}
	}

}
