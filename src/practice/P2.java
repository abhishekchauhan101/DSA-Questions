package practice;

public class P2 {
//MIN AND MAX ELEMENT IN AN ARRAY
	public static void main(String[] args) {
		int arr[]= {64,132,54,231,545};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
