package arrays;
import java.util.*;

public class P11 {

	public static void main(String[] args) {
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {0, 2, 6, 8, 9};
		int n=4;
		int m=5;
//		int arr3[]=new int[n+m];
//		for(int i=0;i<n;i++) {
//			arr3[i]=arr2[i];
//			
//		}
//		int i=n;
//		while(i<m) {
//			arr3[i]=arr2[i];
//		}
//		for( i=0;i<n+m;i++) {
//			System.out.println(arr3[i]);
//		}
//		Arrays.sort(arr3);
		int i=0,j=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				j++;
				i++;
			}else {
				int temp=arr1[i];
				arr1[i]=arr2[j];
				arr2[j]=temp;
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
		for(i=0;i<m;i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		

	}

}
