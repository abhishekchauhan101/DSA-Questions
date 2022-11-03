package practice;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,1,2,1,2,0};
		int c0=0;
		int c1=0;
		int c2=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				c0++;
			}
			else if(arr[i]==1) {
				c1++;
			}
			else {
				c2++;
			}
		}
		int i=0;
		while(c0>0) {
			arr[i]=0;
			i++;
			c0--;
		}
		while(c1>0) {
			arr[i]=1;
			c1--;
			i++;
		}
		while(c2>0) {
			arr[i]=2;
			c2--;
			i++;
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
