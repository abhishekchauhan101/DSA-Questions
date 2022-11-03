package practice;

public class P10 {

	public static void main(String[] args) {
		String s1="This is a test text";
		String s2="test";
		int i=0,j=0;
		int ans=-1;
		while(i<s1.length()) {
			if(s1.charAt(i)==s2.charAt(j) && j<s2.length()) {
				ans=i;
				i++;
				j++;
			}else {
				i++;
				j=0;
				ans=-1;
			}
		}
		System.out.println("ans");

	}

}
