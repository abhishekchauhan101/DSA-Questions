package heap;

public class Heapify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static void heapify(int[] arr,int n,int idx) {
		int largest=idx;
		int l=2*idx;
		int r=2*idx+1;
		if(arr[largest]<arr[l] && l<=n) {
			largest =l;
		}
		if(arr[largest]<arr[r] &&r<=n) {
			largest =r;
		}
		
		if(largest!=idx) {
			swap(arr[largest],arr[idx]);
			heapify(arr,n,largest);
		}
	}
	
	
	public static void swap(int a ,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
}
