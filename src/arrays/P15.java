package arrays;

public class P15 {

	public static void main(String[] args) {
		int arr[]= {7,6,4,3,1};
		int minP=arr[0];
		int maxP=0;
		for(int i=0;i<arr.length;i++) {
			minP=Math.min(minP, arr[i]);
			int pro=arr[i]-minP;
			maxP=Math.max(maxP, pro);
			
		}
		System.out.println(maxP);

	}

}
