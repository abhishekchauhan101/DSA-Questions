package sorting;

public class P15 {

	public static void main(String[] args) {
		int arr[]={10, 3, 5, 6, 0};
		int temp=1;
		int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ans[i]=1;
		}
		for(int i=0;i<arr.length;i++) {
			ans[i]*=temp;
			temp*=arr[i];
		}
		temp=1;
		for(int i=arr.length-1;i>=0;i--) {
			ans[i]*=temp;
			temp*=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(ans[i]);
		}

	}

}
