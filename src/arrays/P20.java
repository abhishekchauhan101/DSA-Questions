package arrays;

public class P20 {

	public static void main(String[] args) {
		int arr[]={6, -3, -10, 0, 2};
		int min=arr[0];
		int max=arr[0];
		int pro=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<0){
				int temp=max;
				max=min;
				min=temp;
			}
			max=Math.max(arr[i], arr[i]*max);
			min=Math.min(arr[i],min*arr[i]);
			pro=Math.max(pro, max);
		}
		System.out.println(pro);
	}	
}


