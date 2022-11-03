package practice;

public class P7 {

	public static void main(String[] args) {
		int arr[]= {6,-3,-10,0,2};
		int max=arr[0];
		int min=arr[0];
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<0) {
				int temp=min;
				min=max;
				max=temp;
			}
			max=Math.max(arr[i], max*arr[i]);
			min=Math.min(arr[i], min*arr[i]);
			
			ans=Math.max(max,ans );
			
		}
		System.out.println(ans);

	}

}
