import java.util.Scanner;

class stack {
	int elem,max,top;
	int[] st;
	public stack() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of stack");
		max = scan.nextInt();
		st = new int[max];
		top = -1;
		scan.close();
	}
	public void push(int elem) {
		if (top == max-1) {
			System.out.println("Stack Overflow");
		}
		else {
			st[++top] = elem;
		}
	}
	public int pop() {
		
		if (top == -1) {
			System.out.println("Stack Underflow");
		}
		else {
			elem = st[top];
			top--;
		}
		return elem;
	}
	public void display() {
		if (top == -1) {
			System.out.println("Stack is Empty");
		}
		else {
			for(int i=0;i<top+1;i++) {
				System.out.printf(" %d ",st[i]);
			}
		}
	}
}
public class prg1b {
	static int option;
	public static void main(String[] args) {
		stack obj = new stack();
		while(true)
		{
			System.out.println("\nEnter Your choice \n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();
			switch(option) {
			case 1: System.out.println("Enter Element");
					obj.elem = scan.nextInt();
					obj.push(obj.elem);
					break;
			case 2: System.out.printf("Poped element is %d", obj.pop());
					break;
			case 3: obj.display();
					break;
			case 4: System.exit(0);
					default:System.out.println("wrong option");
			scan.close();
			}
		}
		
		

	}

}
