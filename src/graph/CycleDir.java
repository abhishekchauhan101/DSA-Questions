package graph;

import java.util.ArrayList;

public class CycleDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void addEdge(ArrayList<ArrayList<Integer>>adj ,int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void print(ArrayList<ArrayList<Integer>>adj) {
		for(int i=0;i<adj.size();i++) {
			System.out.println("Adjancy list of vertex " +i);
			
			System.out.print("Head ");
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print("-->" +adj.get(i).get(j));
			}
			System.out.println();
		}
	}
	
	public static boolean detect(ArrayList<ArrayList<Integer>>adj ,int v) {
		boolean[] vis=new boolean[v];
		boolean[] rec=new boolean[v];
		
		for(int i=0;i<v;i++) {
			if(util(i ,adj ,vis ,rec)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean util(int i ,ArrayList<ArrayList<Integer>>adj ,boolean[] vis ,boolean[] rec) {
		if(rec[i]==true) {
			return true;
		}
		
		if(vis[i]==true) {
			return false;
		}
		
		rec[i]=true;
		vis[i]=true;
		
		for(int neighbor:adj.get(i)) {
			if(util(neighbor,adj,vis,rec)) {
				return true;
			}
		}
		rec[i]=false;
		return false;
	}

}
