package sorting;
import java.util.*;

public class P14 {

	public static void main(String[] args) {
		int arr[]= {6,-1,-3,4,-2,2,4,6,-12,-7};
		Map<Integer,Integer> hm=new HashMap<>();
		
		int sum=0;
		int ans=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==0) {
				ans++;
			}
			if(hm.containsKey(sum)) {
				ans+=hm.get(sum);
			}
			if(hm.containsKey(sum)) {
				int t=hm.get(sum);
				t++;
				hm.put(sum, t);
			}else {
				hm.put(sum, 1);
			}
		}
		System.out.println(ans);

	}

}
