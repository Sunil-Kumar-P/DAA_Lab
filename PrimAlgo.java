import java.util.Scanner;

class Prim {
	public static void my_prim(int [][] adj,int N ) {
		int i,j,nv,min,min_cost=0,u=0,v=0;
		int [] visit = new int[N];
		for (i=0;i<N;i++) {
			visit[i]=0;
		}
		visit[0]=1;
		nv=1;
		while(nv<N) {
			min = 999;
			for(i=0;i<N;i++) {
				if(visit[i]==1) {
					for(j=0;j<N;j++) {
						if(adj[i][j]<min && visit[j]==0) {
							min = adj[i][j];
							u=i;
							v=j;
						}
					}
				}
			}
				visit[v]=1;
				min_cost+=min;
				nv++;
				System.out.printf("Edge %d -%d : (%d)\n",u,v,min);
		}
		System.out.println("cost : "+min_cost);
	}
}
public class PrimAlgo {
	public static void main(String[] args) {
		int[][] adj;
		int N,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes");
		N=sc.nextInt();
		adj = new int[N][N];
		for(i=0;i<N;i++)
			for(j=0;j<N;j++)
				adj[i][j]=-1;
		System.out.println("Enter Adjacency Matrix");
		System.out.println("Enter 999 for no Connection");
		for(i=0;i<N;i++) {
			for(j=0;j<N;j++) {
				adj[i][j]=sc.nextInt();
//				if(adj[i][j]==0)
//					adj[i][j]=999;
			}
		}
		Prim.my_prim(adj, N);
		sc.close();
	}
}
