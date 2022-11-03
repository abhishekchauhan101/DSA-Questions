package string;

public class P12 {

	public static void main(String[] args) {
		
		String s="IV";
		int ans=0;
		for(int i=0;i<s.length();i++) {
			int s1=find(s.charAt(i));
			if(i+1<s.length()) {
				int s2=find(s.charAt(i+1));
				if(s1<s2) {
					ans=ans+s2-s1;
					i++;
				}else {
					ans+=s1;
				}
			}else {
				ans+=s1;
			}
		}
		System.out.println(ans);

	}
	public static int find(char a) {
		if(a=='I') return 1;
        if(a=='V') return 5;
        if(a=='X') return 10;
        if(a=='L') return 50;
        if(a=='C') return 100;
        if(a=='D') return 500;
        if(a=='M') return 1000;
        return -1;
		    
	}

}
