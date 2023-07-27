package demo1;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Ha", "Minh", "Ngoc");
		 
		names.stream()
		.filter(s -> s.startsWith("H"))
		.forEach(System.out::println);
	}
}

