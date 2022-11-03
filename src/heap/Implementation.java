package heap;

public class Implementation {

	public static void main(String[] args) {
		int arr[]= {23,5,2,6,9};
		int n=arr.length;
		insert(arr,1,n);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	//INSERTION OF AN ELEMENT
	
	public static void insert(int arr[],int x,int n) {
		n=n+1;
		int i=n;
		arr[n]=x;
		while(i>1) {
			int parent=i/2;
			if(arr[parent]<arr[i]) {
				swap(arr[parent],arr[i]);
				i=parent;
				
			}else {
				return;
			}
		}
	}
	
	
	//DELETION OF AN ELEMENT
	
	public static void delete(int[] arr,int n) {
		arr[1]=arr[n];
		n=n-1;
		int i=1;
		int left=2*i;
		int right=2*i+1;
		int x=-1; 			//denoting the larger of left and right
		if(left>right) {
			x=left;
		}else {
			x=right;
		}
		if(arr[i]<x) {
			swap(arr[i],arr[x]);
			i=x;
		}else {
			return;
		}
		
	}
	
	public static void swap(int a ,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
}
