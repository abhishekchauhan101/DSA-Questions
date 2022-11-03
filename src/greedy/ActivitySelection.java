package greedy;

public class ActivitySelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] =  {1, 3, 0, 5, 8, 5};
	    int f[] =  {2, 4, 6, 7, 9, 9};
	    int n = s.length;
	    int i,j;
	    i=0;
	    int ans=1;
	    for(j=1;j<n;j++) {
	    	if(s[j]<=f[i]) {
	    		ans++;
	    		
	    	}
	    	i=j;
	    }
	    System.out.println(ans);

	}

}
