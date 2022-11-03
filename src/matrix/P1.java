package matrix;

import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {
		int matrix[][] = {{1, 2, 3, 4},
		           {5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}};
		int r=4,c=4;
		int row=0;
		int col=0;
		ArrayList<Integer> ans=new ArrayList<>();
		while(row<r && col<c) {
			for(int i=0;i<c;i++) {
				ans.add(matrix[row][i]);
			}
			row++;
			for(int i=row;i<r;i++) {
				ans.add(matrix[i][c-1]);
			}
			c--;
			if(row<r) {
				for(int i=c-1;i>=col;i--) {
					ans.add(matrix[r-1][i]);
				}
				r--;
			}
			if(col<c) {
				for(int i=r-1;i>=row;i--){
					ans.add(matrix[i][col]);
				}
				col++;
			}
		}
		System.out.println(ans);
		


	}

}
