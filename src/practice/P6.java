package practice;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,2,6,7};
		
		if(arr[0]==0) {
			System.out.println("Not possible behenchod");
		}
		
		int maxR=arr[0];
		int step=arr[0];
		int jump=1;
		
		for(int i=1;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.println(jump);
			}
			
			maxR=Math.max(maxR,i+arr[i]);
			step--;
			
			if(step==0) {
				jump++;
				
				
				if(i>=maxR) {
					System.out.println("Nahi ho payega bsdk");
				}
				
				step=maxR-1;
				
			}
			
		}

	}

}
