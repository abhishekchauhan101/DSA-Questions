package practice;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,22,5,75,65,80};
		
		int[] profit=new int[arr.length];
		
		for(int i=0;i<profit.length;i++) {
			profit[i]=0;
			
		}
		
		int n=arr.length;
		int max=arr[n-1];
		
		for(int i=n-2;i>=0;i--) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
			profit[i]=Math.max(profit[i+1], max-arr[i]);
		}
		
		int min=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
			profit[i]=Math.max(profit[i-1], profit[i]+arr[i]-min);
			
		}

		System.out.println(profit[n-1]);
	}

}
