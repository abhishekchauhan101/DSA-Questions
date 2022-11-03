package practice;

import java.util.Arrays;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,2,1,6};
		Arrays.sort(arr);
		int i=0;
		int j=i+1;
		int x=arr[1]-arr[0];
		boolean flag=false;
		while(j<arr.length) {
			if(arr[j]-arr[i]==x) {
				flag=true;
			}else {
				return;
			}
			i++;
			j++;
		}
		if(flag==true) {
			//return 1;
			System.out.println('1');
		}else {
			//return 0;
			System.out.println('0');
		}
		
		

	}

}
