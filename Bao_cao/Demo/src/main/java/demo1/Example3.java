package demo1;

import java.util.Arrays;
import java.util.List;
import java.util.*; 

public class Example3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 1, 2, 4, 8, 5, 7, 6);
		double h = list.stream()
				.filter(i -> i % 2 == 0)
				.peek(System.out::println)
				.map(n -> Math.sqrt(n))
				.mapToDouble(d -> d)
				.average().getAsDouble();
		System.out.println(h);
		
//		Tăng lương 15%
//		list.stream().forEach(staff -> staff.setSalary(staff.getSalary()*1.15));
		
//		Tăng lương 15% và chuyển tên sang in hoa
//		list.stream().forEach(staff -> {
//			staff.setSalary(staff.getSalary()*1.15);
//			staff.setSalary(staff.getName().toUpperCase());
//		});
	}
}