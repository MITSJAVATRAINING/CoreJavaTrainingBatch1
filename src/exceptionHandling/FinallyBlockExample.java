package exceptionHandling;

public class FinallyBlockExample {
	
	void divide() {
		int c;
		try {
			int a = 10, b = 0;
			c = a/b;
			System.out.println("value of c in try block is "+ c);
		} catch (ArithmeticException exception) {
			exception.printStackTrace();
		}
		finally {
			System.out.println("In finally block");
			c = 10;
			System.out.println("value of c in finally block is "+ c);
		}
	}

	public static void main(String args[]) {
		FinallyBlockExample finallyBlockExample = new FinallyBlockExample();
		finallyBlockExample.divide();
	}
}
