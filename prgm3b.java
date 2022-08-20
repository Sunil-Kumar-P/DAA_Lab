



class Compute{
	int n;
	int flag = 0, flag1 = 0;
	synchronized void generate() {
		while(flag==1 || flag == 1) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted Exception Caught");
			}
		}
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("Interrupted Exception Caught");
		}
		n = (int) (Math.random()*100+1);
		System.out.println("Random Number generated is "+n);
		flag = flag1 = 1;
		notifyAll();
	}
	synchronized void square() {
		while(flag == 0) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted Exception Caught");
			}
			
		}
		System.out.println("Sqare of "+n+" is "+(n*n));
		flag = 0;
		notify();
	}
	synchronized void cube() {
		while(flag1==0)
		{
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted Exception Caught");
			}
		}
		System.out.println("cube of "+n+" is "+(n*n*n));
		flag1 = 0;
		notify();
	}
}




public class prgm3b {

	public static void main(String[] args) {
		final Compute c = new Compute();
		new Thread() {
			public void run() {
				for(int i = 1;i<=10;i++) {
					c.generate();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i = 1;i<=10;i++) {
					c.square();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i = 1;i<=10;i++) {
					c.cube();
				}
			}
		}.start();
		
	}

}
