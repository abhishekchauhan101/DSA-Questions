package string;

public class P1 {

	public static void main(String[] args) {
		String s="Hello Guys";
		String n="";
		for(int i=s.length()-1;i>=0;i--) {
			n+=s.charAt(i);
			
			
		}
		System.out.println(n);
	}

}
