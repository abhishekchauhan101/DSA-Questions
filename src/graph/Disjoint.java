package graph;

public class Disjoint {
	static int[] par=new int[Integer.MAX_VALUE];
	static int[] rank=new int[Integer.MAX_VALUE];
	static int n=6;
	
	public static void main(String[] args) {
		makeset();

	}
	
	public static void makeset() {
		for(int i=0;i<n;i++) {
			par[i]=i;
			rank[i]=0;
		}
	}
	
	public static int findPar(int node) {
		if(node==par[node]) {
			return node;
		}
		return par[node]=findPar(par[node]);		//FOR PATH COMPRESSION
		
	}
	
	public static void union(int u ,int v) {
		u=findPar(u);
		v=findPar(v);
		
		if(rank[u]<rank[v]) {
			par[u]=v;
		}
		else if(rank[v]<rank[u]) {
			par[v]=u;
			
		}
		else {
			par[v]=u;								//COULD HAVE BEEN ANYTHING
			rank[u]++;
		}
	}

}
