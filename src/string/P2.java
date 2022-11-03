package string;

public class P2 {

	public static void main(String[] args) {
		String s="abbas";
		boolean ans=false;
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				ans=true;
				i++;
				j--;

			}else {
				ans=false;
				break;
			}
		}
		System.out.println(ans);

	}

}
