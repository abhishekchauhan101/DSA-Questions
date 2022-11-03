package practice;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,5,10};
		int n=arr.length;
		int ans=arr[n-1]=arr[0];
		int min=arr[0];
		int max=arr[n-1];
		int k=6;
		for(int i=1;i<n;i++) {
			if(arr[i]-k<0) {
				continue;
			}
			
			min=Math.min(arr[0]+k, arr[i]-k);
			max=Math.max(arr[i-1]+k,arr[n-1]-k);
			
			
			ans=Math.min(ans, max-min);
		}
		System.out.println(ans);

	}

}
