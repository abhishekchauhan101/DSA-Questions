package arrays;

public class P4 {

	public static void main(String[] args) {
		int arr[]= {0,2,1,2,0};
		int n=arr.length;
		int cnt1=0;
		int cnt0=0;
		int cnt2=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				cnt0++;
			}
			if(arr[i]==1) {
				cnt1++;
			}
			if(arr[i]==2) {
				cnt2++;
			}
		}
		int i=0;
		while(cnt0<=0) {
			arr[i]=0;
			i++;
			cnt0--;
		}
		
		while(cnt1<=0) {
			arr[i]=1;
			i++;
			cnt1--;
		}
		while(cnt0<=0) {
			arr[i]=2;
			i++;
			cnt2--;
		}
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
