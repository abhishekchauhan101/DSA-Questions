package practice;

public class P1 {
//REVERSE AN ARRAY
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,24,14,54,23};
		int i=0;
		int j=arr.length-1;
		int temp;
		while(i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int z=0;z<arr.length;z++) {
			System.out.println(arr[z]);
		}
		

	}


}
