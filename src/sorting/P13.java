package sorting;

import java.util.Arrays;

public class P13 {

	public static void main(String[] args) {
		int arr1[]={5,5,10,100,10,5};
		int arr2[]={0, 2, 6, 8, 9};
		int n=arr1.length;
		int m=arr2.length;
		int i=0,j=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		while(i<n &&j<m) {
			if(arr1[i]<arr2[j]) {
				i++;j++;
			}else {
				int temp=arr1[i];
				arr1[i]=arr2[j];
				arr2[j]=temp;
				i++;	
				
				Arrays.sort(arr2);
				
			}
		}
		
	}

}
