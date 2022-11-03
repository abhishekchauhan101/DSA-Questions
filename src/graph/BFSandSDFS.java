package graph;
import java.util.*;

public class BFSandSDFS {
	
	public static void main(String[] args) {
		
		int V = 5;
        ArrayList<ArrayList<Integer> > adj
            = new ArrayList<ArrayList<Integer> >(V);
 
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
 
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 0, 4);
        addEdge(adj, 2, 4);
        
//        bfs(0,3,adj);
        

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
	
	public static int bfs(int source, int destination , ArrayList<ArrayList<Integer>>adj ) {
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		int dis=0;
		boolean vis[]=new boolean[adj.size()];
		int[] parent=new int[adj.size()];
		vis[source]=true;
		parent[source]=-1;
		while(q.isEmpty()!=false) {
			int curr=q.poll();
			if(curr==destination) {
				break;
			}
			for(int neighbor:adj.get(curr)) {
				if(vis[adj.get(curr).get(neighbor)]==false) {
					vis[neighbor]=true;
					q.add(neighbor);
					parent[neighbor]=curr;
				}
			}
			int cur=destination;
			
			while(parent[cur]!=-1) {
				System.out.println(cur+ " -->");
				cur=parent[cur];
				dis++;
			}

		}
		return dis;
	}
	
	public static boolean dfsRecur(int source ,int des ,ArrayList<ArrayList<Integer>>adj) {
		boolean[] vis=new boolean[adj.size()];
		if(source==des) {
			return true;
		}
		for(int neighbor:adj.get(source)) {
			if(!vis[neighbor]) {
				vis[neighbor]=true;
				boolean isCon=dfsRecur(neighbor,des,adj);
				if(isCon==true) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean dfs(int source ,int des , ArrayList<ArrayList<Integer>>adj) {
		boolean[] vis=new boolean[adj.size()];
		vis[source]=true;
		
		Stack<Integer> s=new Stack<>();
		s.push(source);
		
		while(!s.empty()) {
			int curr=s.pop();
			if(curr==des) {
				return true;
			}
			for(int neighbor:adj.get(curr)) {
				if(!vis[adj.get(curr).get(neighbor)]) {
					vis[adj.get(curr).get(neighbor)]=true;
					s.push(neighbor);
				}
			}
		}
		
		return false;
	}
	
	
}
