import java.util.Scanner;

class staff {
	String staffid, name, sal, phone;
	void read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Staff ID:\t");
		staffid = scan.nextLine();
		System.out.println("Staff name:\t");
		name = scan.nextLine();
		System.out.println("Staff sal:\t");
		sal = scan.nextLine();
		System.out.println("Staff phone:\t");
		phone = scan.nextLine();
	}
	void display() {
		System.out.println("Staff ID:\t"+staffid);
		System.out.println("Name:\t"+name);
		System.out.println("Salary:\t"+sal);
		System.out.println("Phone:\t"+phone);
	}
}

class teaching extends staff {
	String domain, pub;
	Scanner scan =new Scanner(System.in);
	void read_teach() {
		super.read();
		System.out.println("Staff domain:\t");
		domain = scan.nextLine();
		System.out.println("Staff publication:\t");
		pub = scan.nextLine();
	}
	void display_teach() {
		super.display();
		System.out.println("Domain\t"+domain);
		System.out.println("Publication\t"+pub);
	}
}

class technical extends staff {
	String skills;
	Scanner scan =new Scanner(System.in);
	void read_tech() {
		super.read();
		System.out.println("Staff Skills:\t");
		skills = scan.nextLine();
	}
	void display_tech() {
		super.display();
		System.out.println("Skills\t"+skills);

	}
}

class contract extends staff {
	String period;
	Scanner scan =new Scanner(System.in);
	void read_con() {
		super.read();
		System.out.println("Staff period:\t");
		period = scan.nextLine();

	}
	void display_con() {
		super.display();
		System.out.println("Period\t"+period);

	}
}

public class prgm2a {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter no. of Staff");
		int n = scan.nextInt();
		teaching st[] = new teaching[n];
		technical stech[] = new technical[n];
		contract scon[] = new contract[n];
		System.out.println("Enter teaching staff");
		for (int i=0;i<n;i++) {
			st[i] = new teaching();
			st[i].read_teach();

		}
		System.out.println("Enter technical staff");
		for (int i=0;i<n;i++) {
			stech[i] = new technical();
			stech[i].read_tech();

			
		}
		System.out.println("Enter contract staff");
		for (int i=0;i<n;i++) {
			scon[i] = new contract();
			scon[i].read_con();
			
		}
		
		System.out.println("Detials of  staff");
		for (int i=0;i<n;i++) {
			st[i].display_teach();
			stech[i].display_tech();
			scon[i].display_con();
			
		}

	}

}
