package sorting;
import java.util.*;
public class P1 {

	public static void main(String[] args) {
		int arr[]= { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		int n=arr.length;
		int x=5;
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				ans.add(i);
				break;
			}
			
		}
		for(int i=n-1;i>=0;i--) {
			if(arr[i]==x) {
				ans.add(i);
				break;
			}
			
		}
		
		System.out.println(ans);
//		System.out.println(arr.length);
		
	}

}
