package string;

public class P11 {

	public static void main(String[] args) {
		String s="geeksforgeeks";
		String out="";
		String str[] = {"2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
            };
		int n=s.length();
		for(int i=0;i<n;i++) {
			int pos=s.charAt(i)-'A';
			if(s.charAt(i)==' ') {
				out+='0';
			}else {
				out+=str[pos];
			}
		}
		System.out.println(out);

	}

}
