package sorting;

public class P7 {

	public static void main(String[] args) {
		int arr[]= {1,3,3};
		int n=arr.length;
		int rep=-1;
		int mis=-1;
		for(int i=0;i<n;i++) {
			if(arr[Math.abs(arr[i])-1]<0) {
				rep=Math.abs(arr[i]);
			}
			else {
				arr[i]=-(Math.abs(arr[i])-1);
			}
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				mis=i+1;
				break;
			}
		}
		System.out.println(mis);
		System.out.println(rep);

	}

}
