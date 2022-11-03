package greedy;

import java.util.Arrays;
import java.util.Collections;

public class CutABoard {

	public static void main(String[] args) {
		int m = 6, n = 4;
        Integer X[] = {2, 1, 3, 1, 4};
        Integer Y[] = {4, 1, 2};
//        System.out.print(minimumCostOfBreaking(X, Y, m-1, n-1));
        Arrays.sort(X,Collections.reverseOrder());
        Arrays.sort(Y,Collections.reverseOrder());
        int i=0,j=0;
        int h=1,v=1;
        int ans=0;
        while(i<m &&j<n) {
        	if(X[i]>Y[j]) {
        		ans+=X[i]*v;
        		h++;
        		i++;
        	}else {
        		ans+=Y[j]*h;
        		v++;
        		j++;
        	}
        }
        int total=0;
        while(i<m) {
        	total+=X[i];
        	
        }
        ans+=total*v;
        total=0;
        while(j<n) {
        	total+=Y[i];
        }
        ans+=total*h;
        

	}

}
