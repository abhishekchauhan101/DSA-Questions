package matrix;

public class P3 {

	public static void main(String[] args) {
		int arr[][] = {{0, 1, 1, 1},
		           {0, 0, 1, 1},
		           {1, 1, 1, 1},
		           {0, 0, 0, 0}};
		int n=4,m=4;
		int i=0,j=m-1;
		int ans=-1;
		while(i<n && j>=0) {
			if(arr[i][j]==1) {
				ans=i;
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println(ans);
		
	}

}
