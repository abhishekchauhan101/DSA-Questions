package arrays;

public class P8 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,-2,5};
		int n=arr.length;
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			currSum+=arr[i];
			if(currSum>maxSum) {
				maxSum=currSum;
			}
			if(currSum<0) {
				currSum=0;
			}
		}
		System.out.println(maxSum);
	}

}
