package Demo2;

import java.util.stream.Stream;

public class CreateObjectStream {

	public static void main(String[] args) {
		Employee emp1 = new Employee("1", "Nhat Ha");
		Employee emp2 = new Employee("2", "Ngoc Thang");
		Employee emp3 = new Employee("3", "Nguyen Vy");
		Employee emp4 = new Employee("4", "Hoang Ha");
		
		Stream<Employee> stream = Stream.of(emp1, emp2, emp3, emp4);
		
		stream.forEach(item -> {
		System.out.println("ID: " + item.getId());
		System.out.println("Name: " + item.getName());
		System.out.println("----------------------------");
		});
	}

}
