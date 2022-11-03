package greedy;
import java.util.*;
import java.util.Arrays;

public class PlaceEl {

	public static void main(String[] args) {
		int arr[]= {8,4,2,1,9,43};
		Arrays.sort(arr);
		ArrayList<Integer> l=new ArrayList<>();
		int n=arr.length;
		for(int i=0;i<n/2;i++) {
			l.add(arr[i]);
			l.add(arr[n-i-1]);
			
		}
		if(n%2!=0){
			
			l.add(n/2);
		}
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		

	}

}
