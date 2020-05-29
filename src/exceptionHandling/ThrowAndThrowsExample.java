package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowAndThrowsExample {
	
	void divide() throws ArithmeticException{
		int c = 10/0;
		throw new ArithmeticException();
	}
	void readFile() throws  FileNotFoundException {
         FileInputStream file = new FileInputStream("d:/abc/txt");
		
	}

	public static void main(String args[]) {
		ThrowAndThrowsExample throwAndThrowsExample = new ThrowAndThrowsExample();
		try {
			throwAndThrowsExample.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		throwAndThrowsExample.divide();
	}
}
