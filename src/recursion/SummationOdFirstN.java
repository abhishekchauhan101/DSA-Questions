package recursion;
import java.util.*;
public class SummationOdFirstN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum=0;
//		find(3,sum);
//		System.out.println(sum);
		int arr[]= {3,1,2};
		ArrayList<Integer> ans=new ArrayList<>();
		int i=0;
		int n=arr.length;
		find(i,ans, n, arr);

	}
	public static void find(int i,ArrayList<Integer> ans,int n,int [] arr) {
//		int sum=0;
//		int i=0;
//		if(i>n) {
//			return sum;
//		}
//		sum+=1;
//		i++;
//		find(i+1,n,sum);
//		return sum;
		
//		if(n<1) {
//			return;
//		}
//		sum+=n;
////		i--;
//		find(n--,sum);
		if(i>=n) {
			for(int j=0;j<ans.size();j++) {
				System.out.println(ans.get(j));
			}
		}
		ans.add(arr[i]);
//		System.out.println(find(i+1,ans,n,arr));

		find(i+1,ans,n,arr);
		ans.remove(i);
		find(i+1,ans,n,arr); 
		
	}

}
