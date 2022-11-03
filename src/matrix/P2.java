package matrix;

public class P2 {

	public static void main(String[] args) {
		int matrix[][] = {{1,3,5,7},
				{10,11,16,20},
				{23,30,34,60}};
		int target=3;
		int n=matrix.length;
		int m=matrix[0].length;
//		boolean ans=false;
//		for(int i=0;i<n;i++) {
//			for(int j=0;i<m;j++) {
//				if(matrix[i][j]==target) {
//					ans=true;
//				}
//			}
//		}
//		System.out.println(ans);
		
		
		
		
		
		//--Solution through BINARY SEARCH--//
		int i=0;
		int j=m-1;
		while(i<n &&j>=0) {
			if(matrix[i][j]==target) {
				System.out.println("Yes target found");
				break;
			}
			else if(matrix[i][j]<target) {
				i++;
			}else {
				j++;
			}
		}
	}

}
