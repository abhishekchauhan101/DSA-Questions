package graph;

import java.util.*;
import java.util.Arrays;

public class BipartiteBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean check(ArrayList<ArrayList<Integer>> adj,int v) {
		boolean ans=true;
		int[] color=new int[v];
		Arrays.fill(color, -1);
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<v;i++) {
			if(color[i]==-1) {
				q.add(i);
				color[i]=0;
				while(!q.isEmpty()) {
					int u=q.poll();
					for(int j:adj.get(u)) {
						if(color[j]==-1) {
							color[j]=color[u]^1;
							q.add(j);
						}else if(color[j]==color[u]) {
							ans=false;
						}
					}
				}
				
			}
		}
		
		
		return ans;
	}

}
