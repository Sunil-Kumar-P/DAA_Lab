import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("The answer is:" +c);
		sc.close();
	}

}
