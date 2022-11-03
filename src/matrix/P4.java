package matrix;

import java.util.Arrays;

public class P4 {

	public static void main(String[] args) {
		int[][] Mat= {{10,20,30,40},
		         {15,25,35,45}, 
		         {27,29,37,48}, 
				 {32,33,39,50}};
		int n=4;
		int[] arr=new int[n*n];
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[k]=Mat[i][j];
				k++;
			}
		}
		k=0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			for(int j=0;i<n;j++) {
				Mat[i][j]=arr[k];
				k++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;i<n;j++) {
				System.out.println(Mat[i][j]);
			}
		}
		

	}

}
