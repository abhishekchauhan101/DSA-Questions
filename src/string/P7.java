package string;
import java.util.*;

public class P7 {

	public static void main(String[] args) {
		String s="abc";
		String ans="";
		List<String> ls =new ArrayList<>();
		System.out.println(find(s,ans,ls));
		
		
	}
	public static List<String> find(String s,String ans ,List<String> ls ){
		if(s.length()==0) {
			ls.add(ans);
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String ros=s.substring(0,i)+s.substring(i+1);
			find(ros,ans+ch,ls);
		}
		
		
		return ls;
	}

}
