package arrays;
import java.util.*;

public class P24 {

	public static void main(String[] args) {
		int arr[]= {1,4,45,6,10,8};
		int x=13;
		Set<Integer> s=new HashSet<>();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int curr=x-arr[i];
			for(int j=i+1;j<n;j++) {
				if(s.contains(curr-arr[j])){
					s.add(arr[j]);
				}
			}
			
		}
		if(s.isEmpty()==false) {
			System.out.println("PRESENT");
		}else {
			System.out.println("NOT PRESENT");
		}

	}

}
