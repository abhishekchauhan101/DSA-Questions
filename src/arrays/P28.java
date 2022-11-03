package arrays;

public class P28 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 3, 4};
		int n=arr.length;
		int a=1;
		int b=2;
		int start=0;
		int end=n-1;
		int temp=0;
		for(int i=0;i<end;) {
			if(arr[i]<a) {
				temp=arr[i];
				arr[i]=arr[start];
				arr[start]=temp;
				i++;
				start++;
			}
			else if(arr[i]>b) {
				temp=arr[i];
				arr[i]=arr[end];
				arr[end]=temp;
				end--;
			}else {
				i++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
