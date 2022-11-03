package arrays;

public class P5 {

	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int temp,j=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}j++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
