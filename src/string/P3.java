package string;
import java.util.*;

public class P3 {

	public static void main(String[] args) {
		String s="geeksforgeeks";
		Map<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!mp.containsKey(s.charAt(i))) {
				mp.put(s.charAt(i), 1);
			}
			else {
				mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
			}
		}
		ArrayList<Character> ans=new ArrayList<>();
		System.out.println(mp.values());
		

	}

}
