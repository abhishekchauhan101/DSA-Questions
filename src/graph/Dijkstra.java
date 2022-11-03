package graph;

public class Dijkstra {

	public static void main(String[] args) {
		int graph[][] = {{ 0, 4, 0, 0, 0, 0, 0, 8, 0 },
						{ 4, 0, 8, 0, 0, 0, 0, 11, 0 },
						{ 0, 8, 0, 7, 0, 4, 0, 0, 2 },
						{ 0, 0, 7, 0, 9, 14, 0, 0, 0 },
           			 	{ 0, 0, 0, 9, 0, 10, 0, 0, 0 },
            			{ 0, 0, 4, 14, 10, 0, 2, 0, 0 },
           			 	{ 0, 0, 0, 0, 0, 2, 0, 1, 6 },
            			{ 8, 11, 0, 0, 0, 0, 1, 0, 7 },
            			{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		int v=9;
		dij(graph,0,v);
            

	}
	public static void dij(int[][] graph,int src,int v) {
		int[] dis=new int[v];
		boolean[] set=new boolean[v];
		
		for(int i=0;i<v;i++) {
			dis[i]=Integer.MAX_VALUE;
			set[i]=false;
		}
		
		dis[src]=0;
		
		for(int i=0;i<v-1;i++) {
			int u=minDis(dis,set,v);
			set[u]=true;
			for(int j=0;i<v;j++) {
				if(graph[u][j]+dis[u]<dis[v] && !set[v] &&graph[u][j]!=0 &&dis[u]!=Integer.MAX_VALUE) {
					dis[j]=graph[u][j]+dis[u];
				}
			}
		}
		
		
	}
	
	public static int minDis(int[] vis,boolean[] set,int v) {
		int minIdx=-1;
		int minVal=Integer.MAX_VALUE;
		for(int i=0;i<v;i++) {
			if(!set[i] && vis[i]<minVal) {
				minVal=vis[v];
				minIdx=i;
			}
		}
		return minIdx;
	}

}
