package javaBasic;

public class HelloWorldExample {

	static int a = 10; // static variable
	int b; // class variable
	
	private static void sum(int a, int b) {
		int c; // local
		c = a + b;
		System.out.println("sum of variables a and b is " + c);
	}
	
	private void sum(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("sum of variables a,b and c is " + d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nested Loops
		for (int i = 0; i<10;i++) {
			for (int j =0; j<10;j++) {
				System.out.println("sum of i " + i  + " and j " + j + " is " + (i+j));
			}
		}
		
		int i = 0;
		while(i<10) {
			System.out.println(i);
		}
		// "is-a" relationship
		do {
			System.out.println("i is" + i);
		} while (i < 10);
//		System.out.println("Numbers in Desending  order");
//		for (int i = 10; i > 0 ;i--) {
//			System.out.println("In loop value of i is " + i);
//		}
		//HelloWorldExample e1 = new HelloWorldExample(); // 64 bytes of memory.
		//HelloWorldExample.sum(10, 20);
		//HelloWorldExample.sum(10, 10, 10);
	}
	// for// while // do-while // for-each
	// initiation
	// condition
	// limit
	// Polymorphism - static
	// Inheritance - NA
	// Encapsulation - classes
	// Abstraction - private/ default.
	
	

}
