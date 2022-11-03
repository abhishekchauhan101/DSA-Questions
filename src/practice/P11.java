package practice;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=0;
		for(int i=1;i<=n;i++) {
			if(i*i<=n) {
				ans++;
			}
			else {
				break;
			}
		}
		System.out.println(ans);

	}

}
