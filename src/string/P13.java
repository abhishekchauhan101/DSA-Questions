package string;

public class P13 {

	public static void main(String[] args) {
		String[] str={"lower","fow","fight"};
		String s1=str[0];
		for(int i=1;i<str.length;i++) {
			s1=lcp(s1,str[i]);
		}
		
		System.out.println(s1);

	}
	public static String lcp(String s1,String s2) {
		int len=Math.min(s1.length(), s2.length());
		int i=0;
		while(i<len && s1.charAt(i)==s2.charAt(i)) {
			i++;
			
		}
		return (String) s1.subSequence(0, i);
		
	}

}
