package string;
import java.util.*;

public class P17 {

	public static void main(String[] args) {
		String[] word= {"act","god","cat","dog","tac"};
		Map<String,List<String>> mp=new HashMap<>();
		List<List<String>> ans=new ArrayList<List<String>>();
		for(String i:word) {
			char[] ch=i.toCharArray();
			Arrays.sort(ch);
			String s=String.valueOf(ch);
			
			if(mp.containsKey(s)) {
				mp.get(s).add(i);
			}else {
				List<String> li=new ArrayList<>();
				li.add(i);
				ans.add(li);
				
				mp.put(s, li);
				
			}
			
		}
		
		System.out.println(ans);

	}

}
