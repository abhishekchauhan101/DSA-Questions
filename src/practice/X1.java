package practice;
import java.util.*;
public class X1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,10,15};
//		int k=6;
//		int n=arr.length;
//		int min=arr[0];
//		int max=arr[n-1];
//		int ans=0;
//		for(int i=1;i<n;i++) {
//			min=Math.min(arr[0]+k, arr[i]-k);
//			max=Math.max(arr[n-1]-k, arr[i-1]+k);
//			ans=Math.max(ans, max-min);
//			
//		}
//		System.out.println(ans);

//		int arr[] = {10, 22, 5, 75, 65, 80};
//		int n=arr.length;
//		int[] pre= new int[n];
//		int maxP=arr[n-1];
//		Arrays.fill(arr,0);
//		for(int i=n-2;i>=0;i--) {
//			maxP=Math.max(maxP, arr[i]);
//			pre[i]=Math.max(pre[i+1], arr[i]-maxP);
//		}
//		int minP=arr[0];
//		for(int i=1;i<n;i++) {
//			minP=Math.min(minP, arr[i]);
//			pre[i]=Math.max(pre[i-1], pre[i]+(arr[i]-minP));
//		}
//		System.out.println(pre[n-1]);
//		
		
//		
//		int arr[]= {1,2,4,3,6};
//		int k=10;
//		Set<Integer> s=new HashSet<>();
//		for(int i=0;i<arr.length;i++) {
//			s.add(arr[i]);
//			
//		}
//		int ans=0;
//		for(int i=0;i<arr.length;i++) {
//			int sum=k-arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				if(s.contains(arr[j])) {
//					ans++;
//				}
//			}
//		}
//		System.out.println(ans);
//		Set<Integer> s=new HashSet<>();

//		for(int i=0;i<arr.length;i++) {
//			int sum=k-arr[i];
//			for(int j=i+1;j<arr.length;i++) {
//				Set<Integer> s=new HashSet<>();
//				if(s.contains(sum-arr[j])) {
//					ans++;
//				}
//				s.add(arr[j]);
//			}
//		}
//		System.out.println(ans);
//		int s=2 ;
//		s &=1;
//		System.out.println(s);
//		int[] arr=new int[40];
//		int idx=0;
//		while(s>0) {
//			arr[idx++]=s%2;
//			s/=2;
//		}
//		for(int i=idx-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
//		
		
//		int n=4;
//		int[] arr=new int[n+1];
//		arr[0]=arr[1]=1;
//		for(int i=2;i<=n;i++) {
//			arr[i]=0;
//			for(int j=0;j<i;j++) {
//				arr[i]+=arr[j]*arr[i-j-1];
//			}
//		}
//		System.out.println(arr[n]);
		
		
	}
	

}
