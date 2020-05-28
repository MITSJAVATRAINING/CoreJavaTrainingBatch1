package collectionExamples;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String args[]) {

		Queue q2 = new PriorityQueue<>();
		q2.add(10);
		q2.add(20);
		q2.add(30);
		System.out.println("Using for each loop");
		//q2.forEach(e -> System.out.println(e + " "));
		System.out.println("Using Iterator");
		Iterator i1 = q2.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
