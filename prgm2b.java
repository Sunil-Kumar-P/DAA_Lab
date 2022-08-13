import java.util.Scanner;
import java.util.StringTokenizer;



public class prgm2b {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.read();
		c.display();
	}

}

class Customer {
	String name,DOB;
	void read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name and Date of Birth");
		name = scan.next();
		DOB = scan.next();
	}
	void display() {
		StringTokenizer st = new StringTokenizer(DOB,"/");
		System.out.println("<name,date_of_birth>\n"+name);
		while(st.hasMoreTokens()) {
			System.out.print(","+st.nextToken());
		}
		
	}
}



