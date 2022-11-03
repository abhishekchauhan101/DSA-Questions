package arrays;

import java.util.*;

public class P17 {

	public static void main(String[] args) {
		int A[] = {1, 5, 10, 20, 40, 80};
		int B[]= {6, 7, 20, 80, 100};
		int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
		int n=6,m=5,o=8;
		
		ArrayList<Integer> ans=new ArrayList<>();
		int i=0,j=0,k=0;
		int last=Integer.MIN_VALUE;
		while(i<n && j<m &&k<o) {
			if(A[i]==B[j] && A[i]==B[k] && A[i]!=last) {
				ans.add(A[i]);
				last=A[i];
				i++;
				j++;
				k++;
				
			}else if(Math.min(A[i], Math.min(B[j],C[k] ))==A[i]) {
				i++;
			}else if(Math.min(A[i], Math.min(B[j],C[k] ))==B[j]) {
				j++;
			}else {
				k++;
			}
		}
		//RETURN ANS
		

	}

}
