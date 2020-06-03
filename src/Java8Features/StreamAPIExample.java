package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
	public static void main(String args[]) {
		List number = Arrays.asList(2,3,4,5); 
		//List square = number.stream().map(x-> x*x ).collect(Collectors.toList());
		//System.out.println(square);
	}
}
