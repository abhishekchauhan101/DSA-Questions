package graph;

import java.util.ArrayList;

public class CycleUnDir {

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
		
		for(int i=0;i<v;i++) {
			if(util(adj,vis,i,-1)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean util(ArrayList<ArrayList<Integer>>adj ,boolean[] vis ,int v ,int parent) {
		vis[v]=true;
		for(int neighbor:adj.get(v) ) {
			if(util(adj ,vis, neighbor ,v)) {
				return true;
			}else if(neighbor!=v) {
				return true;
			}
		}
		return false;
	}
	
}
