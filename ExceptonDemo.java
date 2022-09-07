import java.util.Scanner;

public class ExceptonDemo {
	void withException(int a,int b) {
		int result;
		try {
			result = a/b;
			System.out.println("The result of Division is "+result);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Function Completed Successfully");
	}
	
	void withMyException(int a, int b) {
		int result;
		try {
			if (b==0) throw new ArithmeticException("Division by zero");
			result = a/b;
			System.out.println("The result of Division is "+result);
		}
		catch (Exception ArithmeticException) {
			System.out.println("Invalid second parameter,Second parameter is zero");

		}
		System.out.println("Function Completed Successfully");
	}
	
	void withoutException(int a,int b) {
		int result;
		result = a/b;
		System.out.println("The result of Division is "+result);
		
		System.out.println("Function Completed Successfully");
	}
	
	
	public static void main(String[] args) {
		int a,b,option;
		ExceptonDemo edemo = new ExceptonDemo();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the integers a and b");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("Use exception handling"+"Type 0 for no, 1 for yes, 2 for my exception");
		option = scan.nextInt();
		if (option ==0)
			edemo.withoutException(a, b);
		else if(option==1)
			edemo.withException(a, b);
		else if(option==2)
			edemo.withMyException(a, b);
		else 
			System.out.println("Invalid option");
			scan.close();
	}

}
