package string;

public class P10 {

	public static void main(String[] args) {
		String s="abab";
		int n=s.length();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=0;
			
		}
		for(int i=1;i<n;i++) {
			int j=arr[i-1];
			while(j>0 && s.charAt(i)!=s.charAt(j) ) {
				j=arr[j-1];
			}
			if(s.charAt(i)==s.charAt(j)) {
				j++;
			}
			arr[i]=j;
		}
		System.out.println(arr[n-1]);
		
	
				

	}

}
