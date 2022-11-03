package graph;
import java.util.*;
public class Prims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void prims(ArrayList<ArrayList<Integer>> adj, int n) {
		int[] par=new int[n];
		boolean[] mst=new boolean[n];
		int[] key=new int[n];
		
		for(int i=0;i<n;i++) {
			key[i]=Integer.MAX_VALUE;
			mst[i]=false;
			par[i]=-1;
		}
		
		key[0]=0;
		
		for(int i=0;i<n-1;i++) {
			int u=0,min=Integer.MAX_VALUE;
			for(int v=0;v<n;v++) {
				if(mst[v]==false && key[v]<min) {
					min=key[v];
					u=v;
				}
				
			}
			mst[u]=true;
			
			
//			for(Node it:adj.get(u)) {
//				if(mst[it.getV]==false && it.getW()<key[it.getW()]) {
//					par[it.getV()]=u;
//					key[it.getV()]=it.getW();
//				}
//			}
			
			
			
		}
	}

}
 class Node{
	 int v;
	 int w;
	 
	 Node(int _v , int _w) {
		 v=_v;
		 w=_w;
	 }
	 
	 Node(){};
	 
	 int getV() {
		 return v;
	 }
	 int getW() {
		 return w;
	 }
}