package Demo2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 1, 2, 4, 8, 5, 7, 6);
		Stream<Integer> stream = list.stream();
		
		for (Integer item : list) {
			System.out.print(" " + item);
		}
		System.out.println("\n");
		stream.forEach(item -> System.out.println(" - " + item));
	}

}
