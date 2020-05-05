import java.util.*;
public class DFS{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n+1][n+1];
		System.out.println("Matrix");
		for(int i=1;i<=n;i++){
			System.out.println("Column");
			for(int j=1;j<=n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int visited[]=new int[n+1];
		Arrays.fill(visited,0);
		dfs(a,sc.nextInt(),n,visited);
	}
	public static void dfs(int a[][],int u,int n,int visited[]){
		//System.out.println("n   "+n);
		if(visited[u]==0){
			System.out.println(u);
			
			visited[u]=1;
			for(int v=1;v<=n;v++){
				//System.out.println("u   "+u+"  v  "+v);
				if((a[u][v]==1)&&(visited[v]==0)){
					dfs(a,v,n,visited);
				}
			}
		}
	}
}