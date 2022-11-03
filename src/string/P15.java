package string;
import java.util.*;

public class P15 {

	public static void main(String[] args) {
		String a="ABCDGH";
		String b="AEDFHR";
		int n=a.length();
		int m=b.length();
		Map<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<n;i++) {
			mp.put(a.charAt(i), 1);
		}
		int ans=0;
		for(int i=0;i<m;i++) {
			if(mp.containsKey(b.charAt(i))) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
