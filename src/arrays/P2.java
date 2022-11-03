package arrays;

public class P2 {

	public static void main(String[] args) {
		pair minmax=new pair();
		int i=0;
		int arr[]= {34,14,45,341,24};
		int n=arr.length;
		if(n==1) {
			minmax.min=arr[0];
			minmax.max=arr[0];
		}
		if(arr[0]>arr[1]) {
			minmax.max=arr[0];
			minmax.min=arr[1];
		}else {
			minmax.max=arr[1];
			minmax.min=arr[0];
		}
		for(i=2;i<n;i++) {
			if(arr[i]>minmax.max) {
				minmax.max=arr[i];
				
			}else if(arr[i]<minmax.min) {
				minmax.min=arr[i];
			}
		}
		System.out.println(minmax.max);
		System.out.println(minmax.min);

	}
	static class pair{
		int min;
		int max;
		
	}

}
