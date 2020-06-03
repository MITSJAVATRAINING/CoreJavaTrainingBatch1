package Java8Features;

import java.util.ArrayList;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.forEach(l -> {
			System.out.println(l);
		});
	}

}
