package sorting;

public class P8 {

	public static void main(String[] args) {
		int arr[]= {3,1,3,3,2};
		int n=arr.length;
		int idx=0;
		int cnt=1;
		int ans=-1;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[idx]) {
				cnt++;
				
			}else {
				cnt--;
			}
			if(cnt==0) {
				idx=i;
				cnt=1;
			}
		}
		int majC=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[idx]) {
				majC++;
				
			}
			if(majC>n/2) {
				ans=arr[idx];
			}else {
				ans=-1;
			}
			
		}
		System.out.println(ans);

	}

}
