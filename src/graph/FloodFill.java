package graph;

public class FloodFill {

	public static void main(String[] args) {
		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		boolean[][] visit=new boolean[image.length][image[0].length];
		int sr=1;
		int sc=1;
		int newC=2;
		floodFill(image,sr,sc,newC ,image[sr][sc]  ,visit);
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[0].length;j++) {
				System.out.println(image[i][j]);
			}
		}

	}
	public static void floodFill(int[][] image ,int i ,int j ,int newC ,int color ,boolean[][] vis) {
		if(i<0 || i>image.length ||j<0 || j>image[0].length || vis[i][j]==true || image[i][j]!=color) {
			return;
		}
		vis[i][j]=true;
		image[i][j]=newC;
		floodFill(image ,i+1 ,j ,newC ,color ,vis);
		floodFill(image ,i ,j+1 ,newC ,color ,vis);
		floodFill(image ,i-1 ,j ,newC ,color ,vis);
		floodFill(image ,i ,j-1 ,newC ,color ,vis);
	}

}
