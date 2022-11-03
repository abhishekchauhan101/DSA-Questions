package string;

public class P16 {

	public static void main(String[] args) {
		String s="AACECAAAA";
		int ans=0;
		int flag=0;
		while(s.length()>0) {
			if(check(s)==true) {
				flag=1;
				break;
			}else {
				ans++;
				s=s.substring(0, s.length()-1);
			}
		}
		if(flag==1) {
			System.out.println(ans);
		}
		

	}
	public static boolean check(String s) {
		int n=s.length();
		for(int i=0,j=n-1;i<=j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
