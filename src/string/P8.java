package string;

public class P8 {

	public static void main(String[] args) {
		String  str = "0100110101";
		int c0=0;
		int c1=0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				c0++;
			}
			else {
				c1++;
			}
			if(c0==c1) {
				count++;
			}
		}
		System.out.println(count);

	}

}
