import java.util.Scanner;
public class Greedy {
	int[] weights;
	int[] values;
	int objects;
	float W;
	float[][] v;
	Greedy(Scanner sc){
		System.out.println("Enter no. of objects and Total Weights");
		objects = sc.nextInt();
		W=sc.nextInt();
		values = new int[objects];
		weights = new int[objects];
		v = new float[objects][2];
		for(int i=0;i<objects;i++) {
			System.out.printf("Enter %d object value and weight", i+1);
			values[i]=sc.nextInt();
			weights[i]=sc.nextInt();
		}
		value();
	}
	public void sort() {
		int i,j;
		float temp;
		for(i=0;i<objects;i++) {
			for(j=0;j<objects-1;j++) {
				if(v[j][1]<v[j+1][1]) {
					temp = v[j][1];
					v[j][1]=v[j+1][1];
					v[j+1][1]=temp;
					temp = v[j][0];
					v[j][0]=v[j+1][0];
					v[j+1][0]=temp;
						
				}
			}
		}
	}
	public void value() {
		int i;
		for(i=0;i<objects;i++) {
			v[i][0]=i+1;
			v[i][1]=(float)values[i]/weights[i];
		}
		sort();
		for(i=0;i<objects;i++) 
			System.out.printf("%f\t%f\n",v[i][0],v[i][1]);
		float k=W,f;
		int ob;
		i = 0;
		System.out.println("Objects\t\tWeights");
		while(k>0) {
			ob=(int)v[i][0];
			ob = ob-1;
			if(k>=weights[ob]) {
				k=k-weights[ob];
				System.out.printf("%d\t\t%d\n",ob+1,weights[ob]);

			}
			else if(k<weights[ob]) {

				f=(float)k/weights[ob];
				k=k-(f*weights[ob]);
				System.out.printf("%d\t\t%f\n",ob+1,f*weights[ob]);
				
			}
			i++;
		}
	}

}
