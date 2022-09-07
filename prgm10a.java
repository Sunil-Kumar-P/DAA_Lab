import java.util.Scanner;

class Floyd{
	int d[][] =new int [10][10];
	public void dis_path(int n, int a[][]) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				d[i][j] = a[i][j];
			}
		}
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					d[i][j] = Math.min(d[i][j], (d[i][k]+d[k][j]));
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j = 0 ; j<n;j++) {
				System.out.print(d[i][j]+ " ");
			}
			System.out.println();
		}
	}
}

public class prgm10a {

	public static void main(String[] args) {
		int n;
		int a[][] = new int[10][10];
		Scanner scan = new Scanner(System.in);
		Floyd f = new Floyd();
		System.out.println("**Floyd's Algorithm");
		System.out.println("Enter the number of nodes:");
		n = scan.nextInt();
		System.out.println("Enter the cost matrix");
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Resultant is ");
		f.dis_path(n, a);
		scan.close();
	}

}
