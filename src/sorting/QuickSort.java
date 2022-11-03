package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {4,6,2,5,7,9,1,3};
		sort(arr,0,7);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		
	}
	
	public static void sort(int[] arr, int l, int h) {
		if(l<h) {
			int pivot=partition(arr,l,h);
			sort(arr,l,pivot-1);
			sort(arr,pivot+1,h);
		}
	}
	
	public static int partition(int[]arr ,int l,int h) {
		int pivot=arr[l];
		int i=l;
		int j=h;
		while(i<j) {
			while(arr[i]<=pivot) i++;
			while(arr[j]>pivot) j++;
			if(i<j) {
				swap(arr[i],arr[j]);
			}
		}
		swap(arr[l],arr[j]);
		return j;
	}
	
	public static void swap(int a ,int b) {
		int temp=a;
		a=b;
		b=temp;
	}

}
