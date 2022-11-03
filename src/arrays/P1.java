package arrays;

public class P1 {

	public static void main(String[] args) {
		int arr[]= {23,54,21,1,45,7,2};
		int n=arr.length;
		int i=0,j=arr.length-1;
//		System.out.println(arr.length);
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
