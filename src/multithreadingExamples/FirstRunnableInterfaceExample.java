package multithreadingExamples;

class Hi implements Runnable {
	public void run() {
		for (int i =0;i<10;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello implements Runnable {
	public void run() {
		for (int i =0;i<10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class FirstRunnableInterfaceExample {
	public static void main(String args[]) {
		Hi hi = new Hi();
		Hello hello = new Hello();
		
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		
		t1.start();
		t2.start();
	}
}
