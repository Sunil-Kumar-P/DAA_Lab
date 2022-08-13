import java.util.Random;
import java.util.Scanner;

public class prgm5 {
	
	static int max = 5000000;
	static int a[] = new int[max];
	
	public static void mergesort(int low, int high) {
		int mid;
		if(low<high) {
			mid = (low+high)/2;
			mergesort(low, mid);
			mergesort(mid+1, high);
			merge(low,mid,high);
		}
	}
	
	public static void merge(int low, int mid, int high)
	{
		int b[] = new int[max];
		int h, i, j, k;
		h = i = low;
		j = mid+1;
		while((h<=mid) && (j<=high))
		if(a[h]<a[j])
			b[i++]=a[h++];
		else
			b[i++]=a[j++];

		if(h>mid)
			for(k=j;k<=high;k++) 
				b[i++] = a[k];
		else 
			for(k=h;k<=mid;k++) 
				b[i++] = a[k];
			
		for(k=low;k<=high;k++) 
			a[k]= b[k];
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		Random r = new Random();
		for(int i=0;i<n;i++)
		{
			a[i] = r.nextInt(500000);
		}
		System.out.println("Initial array:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
//		

		long startTime = System.nanoTime();
		mergesort(0,n-1);
		long endTime = System.nanoTime();
		long elaspedTime = endTime - startTime;
		System.out.println("\nTime taken in micro seconds is "+(elaspedTime/1000000));
		System.out.print("Sorted array is: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	
	
	
	}

}
