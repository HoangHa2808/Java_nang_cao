package demo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Names name1 = new Names("Ha", 50);
		Names name2 = new Names("Minh", 100);
		Names name3 = new Names("Ngoc", 10);
		List<Names> list = Arrays.asList(name1, name2, name3);
		
		Stream<Names> stream2 = Stream.of(name1, name2, name3);
		
		Stream<Names> stream1 = list.stream();
	}
}
