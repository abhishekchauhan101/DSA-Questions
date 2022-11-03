package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class P12 {

	public static void main(String[] args) {
		int intervals[][]=  {{1,3},{2,6},{8,10},{15,18}};
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		ArrayList<int[]> ans=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        int i=1;
        while(i<intervals.length){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(s<=end){
                end=Math.max(end,e);
            }
            else{
                ans.add(new int[]{start,end});
                start=s;
                end=e;
            }
            i++;
        }
        ans.add(new int[]{start,end});
        int ans1[][]=ans.toArray(new int[0][]);
        
		

	}

}
