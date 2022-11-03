package string;

public class P5 {

	public static void main(String[] args) {
		int n=3;
		if(n==1) {
			System.out.println("1");
		}
		if(n==2){
			System.out.println("11");
		}
		String x="21";
		
		for(int i=3;i<n;i++) {
			String t="";
			x+="&";
			int c=1;
			for(int j=1;j<x.length();j++) {
				if(x.charAt(j)!=x.charAt(j-1)) {
					t+=String.valueOf(c);
					t+=x.charAt(j-1);
					c=1;
				}else {
					c++;
				}
			}
			x=t;
			
		}
		System.out.println(x);
		

	}

}
