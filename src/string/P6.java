package string;

public class P6 {

	public static void main(String[] args) {
		String s= "aaaabbaa";
		int l,h;
		int start=0;
		int end=1;
		for(int i=1;i<s.length();i++) {
			if(s.length()%2==0) {
				l=i-1;
				h=i;
				while(l>=0 && h<s.length() && s.charAt(l)==s.charAt(h)) {
					if(h-l+1>end) {
						start=l;
						end=h;
					}
					l--;
					h++;
					
				}
			}
			//IF LENGTH IS ODD
			else {
				l=i-1;
				h=i+1;
				while(l>=0 && h<s.length() && s.charAt(l)==s.charAt(h)) {
					if(h-l+1>end) {
						start=l;
						end=h;
					}
					l--;
					h++;
					
				}
				
			}
		}
		System.out.println(s.substring(start, end));

	}

}
