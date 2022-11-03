package arrays;

public class P10 {

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int jump=1;
		int reach=arr[0];
		int step=arr[0];
		if(arr.length==1) {
			System.out.println("1");
		}
		if(arr[0]==0) {
			System.out.println("Not Possible");
		}
		for(int i=1;i<arr.length;i++) {
			if(i>=arr.length) {
				System.out.println(jump);
			}
			reach=Math.max(reach, i+arr[i]);
			step--;
			if(step==0) {
				if(i>reach) {
					System.out.println("-1");
				}else {
					step=reach-i;
				}
			}
			//NEXT QUESTION OF SHEET IS DONE ON LEETCODE
		}

	}

}
