package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class P1 {

	public static void main(String[] args) {
		int m[][] = {{1, 0, 0, 0},
		         {1, 1, 0, 1}, 
		         {1, 1, 0, 0},
		         {0, 1, 1, 1}};
		int[][] vis=new int[5][5];
		Arrays.fill(vis, 0);
		ArrayList<String> ans=new ArrayList<>();
		int n=5;
		String s="";
		find(0,0,m,ans,s,n ,vis);
		System.out.println(ans);
		
		
	}
	
	public static void find(int x,int y,int[][] m,ArrayList<String> ans, String res ,int n ,int[][] vis) {
		if(x==n-1 && y==n-1) {
			ans.add(res);
			return;
		}
		if(m[x][y]==0|| vis[x][y]==1) {
			return;
		}
		vis[x][y]=1;
		if(x>0) {
			find(x-1,y,m,ans,res+'U',n,vis);
		}
		if(y>0) {
			find(x,y-1,m,ans,res+'L',n,vis);
		}
		if(x<n-1) {
			find(x+1,y,m,ans,res+'D',n,vis);
		}
		if(y<n-1) {
			find(x,y+1,m,ans,res+'R',n,vis);
		}
		vis[x][y]=0;
		
		
		
	}

}
