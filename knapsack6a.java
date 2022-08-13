import java.util.Scanner;

public class knapsack6a {
	public void solve(int[] wt, int[] val, int W, int N) {
		int i,j;
		int V[][] = new int[N+1][W+1];
		int selected[] = new int[N+1];
		for(i=0;i<=N;i++) {
			for(j=0;j<=W;j++) {
				if(i==0||j==0)
					V[i][j]=0;
				else if(wt[i]>j)
					V[i][j]=V[i-1][j];
				else
					V[i][j]=Math.max(V[i-1][j],(V[i-1][j-wt[i]]+val[i]));
			}
		}
		System.out.println("The profit table is : :");
		for(i=0;i<=N;i++) {
			for(j=0;j<=W;j++)
				System.out.println(V[i][j]+" ");
			System.out.println();
			
		}
		System.out.println("The optimal profit obatained is"+V[N][W]);
		i = N;
		j = W;System.out.println();
		while(i>0&&j>0) {
			if(V[i][j]!=V[i-1][j]) {
				selected[i] = 1;
				j = j-wt[i];
				
			}
			i--;
			System.out.println("\nItems selected");
			for(i=1;i<=N;i++)
				if(selected[i]==1)
					System.out.println(i+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		knapsack6a obj = new knapsack6a();
		System.out.println("****Knapsack problem dp");
		System.out.println();
		
		
		sc.close();
	}
}
