package graph;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		int v=5;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}

	}
	public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void FloodFill() {
		 int arr[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                 {1, 1, 1, 1, 1, 1, 0, 0},
                 {1, 0, 0, 1, 1, 0, 1, 1},
                 {1, 2, 2, 2, 2, 0, 1, 0},
                 {1, 1, 1, 2, 2, 0, 1, 0},
                 {1, 1, 1, 2, 2, 2, 2, 0},
                 {1, 1, 1, 1, 1, 2, 1, 1},
                 {1, 1, 1, 1, 1, 2, 2, 1},
                 };
//		 boolean vis[arr.length][arr[0].length]=new 
		 int x=4,y=4;
		 int newC=3;
		 int oldC=arr[x][y];
		 floodFillUtil(arr,x,y,newC,oldC);
		
	}
	
	public static void floodFillUtil(int[][] arr,int x,int y,int newC,int oldC) {
		if(x<0||y<0 ||x>7||y>7 ||arr[x][y]!=oldC) {
			return;
		}
		arr[x][y]=newC;
//		Now bacckTracking	
		
	}
}
