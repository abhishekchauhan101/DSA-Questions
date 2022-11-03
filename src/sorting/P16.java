package sorting;

public class P16 {

	public static void main(String[] args) {
		int arr[]= {12,34,67,90};
		int n=arr.length;
		int min=max(arr,n);
		int max=0;
		int res=0;
		int k=2;
		for(int i=0;i<n;i++) {
			max+=arr[i];
		}
		while(min<=max) {
			int mid=(min+max)/2;
			if(feasible(arr,n,k,mid)) {
				res=mid;
				max=mid-1;
			}
			else{
				min=mid+1;
			}
		}
		System.out.println(res);
		
		
	}
	
	public static boolean feasible(int[] arr,int n,int k,int mid) {
		int stu=1,sum=0;
		for(int i=0;i<n;i++) {
			if(sum+arr[i]>mid) {
				stu++;
				sum=arr[i];
			}else {
				sum+=arr[i];
			}
		}
		return stu<=k;
	}
	
	
	public static int max(int[] arr,int n) {
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<ans) {
				ans=arr[i];
			}
		}
		return ans;
		
	}

}
