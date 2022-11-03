package arrays;
import java.util.*;

public class P23 {

	public static void main(String[] args) {
		int a1[] = {11, 1, 13, 21, 3, 7};
		int a2[] = {11, 3, 8, 1};
		int n=a1.length,m=a2.length;
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<n;i++) {
			s.add(a1[i]);
		}
		int count=0;
		for(int i=0;i<m;i++) {
			if(s.contains(a2[i])) {
				count++;
			}else {
				continue;
			}
		}
		if(count==m) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		

	}

}
