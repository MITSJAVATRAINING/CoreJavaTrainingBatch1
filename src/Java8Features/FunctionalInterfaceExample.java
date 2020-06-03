package Java8Features;

@FunctionalInterface
interface Square {
	public int calculate(int x);
	public default void sum(int a, int b) {
		System.out.println("The sum of numbers are" + a+b);
	}
}

public class FunctionalInterfaceExample {
	public static void main(String args[]) {
		//Square s = (int x)->x+x;
		//int a = s.calculate(10);
		//System.out.println("Value of a is "+ a);
	}
}
