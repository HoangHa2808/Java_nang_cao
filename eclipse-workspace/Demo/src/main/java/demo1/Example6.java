package demo1;

import java.util.stream.Stream;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Example6 {
	// filter() hoạt động giúp loại bỏ các yếu tố dựa trên các tiêu chí nhất định
	// collect() hoạt động giúp thu thập kết quả luồng trong một bộ sưu tập
	public static void main(String[] args) {
		// Lọc các số chia hết cho 3
//		 Stream.iterate(1, count -> count + 1) //
//         .filter(number -> number % 3 == 0) //
//         .limit(6) //
//         .forEach(System.out::println);

		// collect() hoạt động giúp thu thập kết quả luồng trong một bộ sưu tập
		// list
//		 Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
//	        List<String> languages = stream.collect(Collectors.toList());
//	        System.out.println(languages);

		// reduce() thao tác kết hợp các phần tử luồng thành một bằng cách sử dụng một
		// BinaryOperator
//		int result = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b);
//		System.out.println(result);

		// Max, Min
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//	      Integer maxx = list.stream().max(Integer::compare).get();
//	      Integer minn = list.stream().min(Integer::compare).get();
//	      System.out.println("Max: "+maxx+"\nMin: "+minn);

		// map() thao tác giúp ánh xạ các phần tử tới kết quả tương ứng
//		List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
//        data.stream() 
//                .map(String::toUpperCase) // convert each element to upper case
//                .forEach(System.out::println);

		// distinct
//		 List<Integer> list = Arrays.asList(1,2,2,2,2,3,4,5);
//	      list.stream().distinct().forEach(System.out::println);

		// sorted
//		 List<Integer> list = Arrays.asList(4,3,2,1,0,3,4,5);
//	      list.stream().sorted().forEach(System.out::println);

		// limit trả về một luồng bao gồm các thành phần của luồng này,
		// skip bị cắt bớt để không dài hơn maxSize về độ dài.
//		List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
//		data.stream() //
//				.skip(1) // In ra các phần tử trừ phần tử đầu tiên.
//				.limit(3) // lấy ra 3 phần tử đầu tiên.
//				.forEach(System.out::println);
		
		//Stream &  Parallel
		List<String> strings = Arrays.asList("code", "learn", "...");
	      String streamString = strings.stream().reduce(" I'm-", String::concat);
	      String parallelString = strings.parallelStream().reduce(" I'm-", String::concat);
	      System.out.println("Stream: "+streamString +"\nParallelStream: "+parallelString);
	}
}
