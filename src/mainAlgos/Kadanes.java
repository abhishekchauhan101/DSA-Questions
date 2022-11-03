package mainAlgos;

public class Kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,-2,5};
		int curSum=0;
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			curSum=curSum+arr[i];
			if(curSum>ans) {
				ans=curSum;
			}
			if(curSum<0) {
				curSum=0;
			}
		}
		System.out.println(ans);

	}

}
