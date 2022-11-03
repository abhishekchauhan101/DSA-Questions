package arrays;

public class P14 {

	public static void main(String[] args) {
		int arr[]= {2, 3, 4, 5, 6};
		int count=0;
		int i=0,j=1;
		while(i<arr.length && j<arr.length) {
			if(arr[i]>arr[j]) {
				j++;
				count++;
			}else {
				i++;
			}
		}
		System.out.println(count);
	}

}
