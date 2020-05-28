package exceptionHandling;

import java.util.InputMismatchException;

public class TryCatchExample {
	
	public static void main(String args[]) {
	 try {
			int a= 10, b = 0, c;
			c = a/b;
			System.out.println("value of c" + c);
	 } catch(ArithmeticException exception) {
		 System.out.println(exception);
	 } catch(InputMismatchException e) {
		 System.out.println(e);
	 }
	}
}
