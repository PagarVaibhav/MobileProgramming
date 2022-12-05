package CodingTest;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	static List<Employee> emp=new ArrayList<>();
	
	public static void main(String[] args) {
		
		emp.add(new Employee(1, "Vaibhav", 150000, 2));
		emp.add(new Employee(2, "Akshay", 140000, 1));
		emp.add(new Employee(3, "Shiv", 100000, 2));
		emp.add(new Employee(4, "Mangesh", 200000, null));

		// total addition of salary column
		
//		DoubleSummaryStatistics collect = emp.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//		System.out.println(collect.getSum());
		
		System.out.println(emp.stream().map(p-> p.getSalary()).reduce(0.0, (a,b)-> a+b));
		
		// Print Manager id for given employee name
		
		emp.stream().filter(p->p.getName().equals("Mangesh")).forEach(System.out::println);
	}
}
