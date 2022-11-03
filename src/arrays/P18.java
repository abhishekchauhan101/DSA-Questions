package arrays;

public class P18 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, -4, -1, 4};
		int n=arr.length;
		int idx=-1;
		for(int i=0;i<n;i++) {
			if(idx==-1) {
				if(arr[i]>=0 && i%2==0 || arr[i]<0 && i%2==1) {
					idx=i;
				}
			}
			else if(idx>=0) {
				if(arr[i]>=0 && arr[idx]<0 || arr[i]<0 && arr[idx]>=0) {
					rightrotate(arr,n,idx,i);
				}
				if(i-idx>=2) {
					idx+=2;
				}else {
					idx=-1;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}
	public static void rightrotate(int[] arr,int n,int idx,int x) {
		int tmp=arr[x];
		for(int i=x;i>idx;i--) {
			arr[i]=arr[i-1];
		}
		arr[idx]=tmp;
	}

}
