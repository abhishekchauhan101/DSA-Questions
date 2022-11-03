package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {25,64,12,22,4};
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int idx=i;
			for(int j=i+1;j<n;i++) {
				if(arr[j]<arr[idx]) {
					idx=j;
				}
			}
			int temp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	

}
