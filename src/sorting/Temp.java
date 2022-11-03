package sorting;
import java.util.*;
public class Temp {

	public static void main(String[] args) {
		int n=3;
		int[] arr= {3,1,2};
		Map<Integer,Integer> mp=new HashMap<>();
		for(int i=0;i<n;i++) {
			mp.put(arr[i], i+1);
		}
		List<Integer> temp = new ArrayList<>(mp.keySet());
		Collections.sort(temp);
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		for(int i=0;i<mp.size();i++) {
			for(int j=0;j<temp.size();j++) {
				ans.add(mp.get(temp.get(j)));
			}
		}
	}

}
