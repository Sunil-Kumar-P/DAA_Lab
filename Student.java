import java.util.Scanner;

public class Student {
	String USN,Name,Branch,Phone;
	Scanner scan = new Scanner(System.in);
	void read() {
		System.out.println("Enter USN:");
		USN = scan.nextLine();
		System.out.println("Enter Name:");
		Name = scan.nextLine();
		System.out.println("Enter Branch:");
		Branch = scan.nextLine();
		System.out.println("Enter Phone no:");
		Phone = scan.nextLine();
	}
	void display() {
		System.out.printf("%-20s%-20s%-20s%-20s\n", USN, Name, Branch, Phone);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		Student s[] = new Student[n];
		for(int i=0;i<n;i++) {
			s[i] = new Student();
			s[i].read();
		}
		System.out.printf("%-20s%-20s%-20s%-20s\n", "USN", "Name", "Branch", "Phone");
		for(int i=0;i<n;i++) {
			s[i].display();
		}

	}

}
