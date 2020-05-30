package multithreadingExamples;

public class FirstThreadDemo extends Thread {
		@Override
	    public void run() {
	      for (int i = 1;i<=10;i++) {
	    	  System.out.println("Number after multiplication by 2 by " + Thread.currentThread().getId() + " and out put is " + i*2);
	      }
	    }
	  
	public static void main(String args[]) throws InterruptedException {
		
		Thread t1 = new FirstThreadDemo();
		Thread t2 = new FirstThreadDemo();
		Thread t3 = new FirstThreadDemo();
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		
	}
}
