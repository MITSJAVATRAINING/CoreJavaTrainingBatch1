package exceptionHandling;

import java.util.InputMismatchException;

public class TryCatchExample {
	
	public static void main(String args[]) throws CustomException {
//	 try {
//			int a= 10, b = 0, c;
//			c = a/b;
//			System.out.println("value of c" + c);
//	 } catch(ArithmeticException | NumberFormatException exception) {
//		 exception.printStackTrace();
//	 } 
 System.out.println("In here");
	 
	 try {
		 throw new CustomException(" shaleen is calling Custom exception class");
	 } catch(CustomException ex) {
		 System.out.println(ex.getMessage());
	 }
	}
}
