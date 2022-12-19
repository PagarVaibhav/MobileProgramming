package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeTest {

	static List<Employee> emplist=new ArrayList<>();
	
	public static void main(String[] args) {
		
		emplist.add(new Employee(1, "Vaibhav Pagar", 25, "Male", "B.Development", 2022, 175000));
		emplist.add(new Employee(2, "Mangesh Chawhan", 28, "Male", "B.Development", 2022, 90000));
		emplist.add(new Employee(3, "Akshay Vibhute", 27, "Male", "B.Development", 2022, 60000));
		emplist.add(new Employee(4, "Shiv Borude", 29, "Male", "B.Development", 2022, 77000));
		emplist.add(new Employee(5, "Deepak Shirale", 30, "Male", "B.Development", 2021, 80000));
		emplist.add(new Employee(6, "Ajay Sisode", 28, "Male", "Development", 2020, 60000));
		emplist.add(new Employee(7, "Abdul Shaikh", 26, "Male", "F.Development", 2021, 75000));
		emplist.add(new Employee(8, "Punam Shende", 25, "Female", "B.Development", 2021, 75000));
		emplist.add(new Employee(9, "Prachi Landge", 20, "Female", "HR", 2020, 75000));
		emplist.add(new Employee(10, "Vinod Kumar", 26, "Male", "Python", 2019, 70000));
		emplist.add(new Employee(11, "Ashwini Aware", 25, "Female", "Development", 2021, 75000));
		emplist.add(new Employee(12, "Ganesh Patil", 20, "Male", "Testing", 2022, 55000));
		emplist.add(new Employee(13, "Pallavi Ande", 24, "Female", "Testing", 2022, 45000));
		emplist.add(new Employee(14, "Gajanan Jadhav", 26, "Male", "B.Development", 2019, 40000));
		emplist.add(new Employee(15, "Sampada Pawar", 30, "Female", "HR", 2022, 50000));

	         	// Query 1 : How many male and female employees are there in the organization?
				method1();
				System.out.println("\n");
				// Query 2 : Print the name of all departments in the organization?
				method2();
				System.out.println("\n");
				// Query 3 : What is the average age of male and female employees?
				method3();
				System.out.println("\n");
				// Query 4 : Get the details of highest paid employee in the organization?
				method4();
				System.out.println("\n");
				// Query 5 : Get the names of all employees who have joined after 2015?
				method5();
				System.out.println("\n");
				// Query 6 : Count the number of employees in each department?
				method6();
				System.out.println("\n");
				// Query 7 : What is the average salary of each department?
				method7();
				System.out.println("\n");
				// Query 8 : Get the details of youngest male employee in the product
				// development department?
				method8();
				System.out.println("\n");
				// Query 9 : Who has the most working experience in the organization?
				method9();
				System.out.println("\n");
				// Query 10 : How many male and female employees are there in the sales and
				// marketing team?
				method10();
				System.out.println("\n");
				// Query 11 : What is the average salary of male and female employees?
				method11();
				System.out.println("\n");
				// Query 12 : List down the names of all employees in each department?
				method12();
				System.out.println("\n");
				// Query 13 : What is the average salary and total salary of the whole
				// organization?
				method13();
				System.out.println("\n");
				// Query 14 : Separate the employees who are younger or equal to 25 years from
				// those employees who are older than 25 years.
				//method14();
				System.out.println("\n");
				// Query 15 : Who is the oldest employee in the organization? What is his age
				// and which department he belongs to?
				//method15();

	}

	
	public static void method1() {
		System.out.println("Query 1 : How many male and female employees are there in the organization with name and dept?");
		
		Map<String, List<Employee>> noOfMaleAndFemaleEmployees = emplist.stream().collect(Collectors.groupingBy(Employee::getGender));
		//System.out.println(noOfMaleAndFemaleEmployees);
		
		System.out.println();
		
		Set<Entry<String,List<Employee>>> entrySet = noOfMaleAndFemaleEmployees.entrySet();
		
		for (Entry<String, List<Employee>> en : entrySet) {
			System.out.println(en.getKey());
			System.out.println("----------------------------");
			List<Employee> value = en.getValue();
			
			 for (Employee e : value) 
			    {
			        System.out.println(e.getName());
			        System.out.println(e.getDepartment());
			        System.out.println();
			    }
		}			
	}
	
	public static void method2() {
		System.out.println("Query 2 : Print the name of all departments in the organization?");
		
		emplist.stream().map(m -> m.getDepartment()).distinct().forEach(System.out::println);
	}

	public static void method3() {
		System.out.println("Query 3 : What is the average age of male and female employees?");

		Map<String, Double> avgAge = emplist.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAge);
	}
	
	public static void method4() {
		System.out.println("Query 4 : Get the details of highest paid employee in the organization?");

		Optional<Employee> highpaid = emplist.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(highpaid.get().getName());
	}
	
	public static void method5() {
		System.out.println("Query 5 : Get the names of all employees who have joined after 2020?");

		emplist.stream().filter(e -> e.getYearOfJoining() > 2020).map(Employee::getName)
		.forEach(System.out::println);
	}
	
	public static void method6() {
		System.out.println("Query 6 : Count the number of employees in each department?");

		Map<String, Long> employeeCountByDepartment = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}			
	}
	public static void method7() {
		System.out.println("Query 7 : What is the average salary of each department?");

		Map<String, Double> avgSalaryOsEachDept = emplist.stream()
				  .collect(Collectors.groupingBy(Employee::getDepartment , Collectors.averagingDouble(Employee::getSalary)));
		
		Set<Entry<String,Double>> entrySet = avgSalaryOsEachDept.entrySet();
		for(Entry<String,Double> entry:entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	public static void method8() {
		System.out.println("Query 8 : Get the details of youngest male employee in the B. development department?");
		
		Optional<Employee> youngestMaleEmployee = emplist.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "B.Development").min(Comparator.comparingInt(Employee::getAge));
		
		Employee employee = youngestMaleEmployee.get();
		System.out.println(employee);
		
		System.out.println("----------------------------------------------");
        
		System.out.println("ID : "+ employee.getId());
		         
		System.out.println("Name : "+employee.getName());
	}
	
	public static void method9() {
		System.out.println("Query 9 : Who has the most working experience in the organization?");

		Optional<Employee> mostWokingExp = emplist.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		
		Employee srEmployee = mostWokingExp.get();
		System.out.println(srEmployee);
		
		System.out.println("----------------------------");
        
		System.out.println("ID : "+srEmployee.getId());
		         
		System.out.println("Name : "+srEmployee.getName());
		
		System.out.println("Dept : "+srEmployee.getDepartment());
	}
	
	public static void method10() {
		System.out.println("Query 10 : How many male and female employees are there in the b.development team?");

		Map<String, Long> countMaleFemaleEmployeesInBdevelopment = emplist.stream()
				.filter(e -> e.getDepartment() == "B.Development").collect(Collectors.groupingBy(Employee::getGender , Collectors.counting()));
		System.out.println(countMaleFemaleEmployeesInBdevelopment);
	}
	
	public static void method11() {
		System.out.println("Query 11 : What is the average salary of male and female employees?");

		Map<String,Double> avgSalaryOfMaleAndFemaleEmployees = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getGender , Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryOfMaleAndFemaleEmployees);
	}
	
	public static void method12() {
		System.out.println("Query 12 : List down the names of all employees in each department?");

		Map<String,List<Employee>> employeeListByDepartment = emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		Set<Entry<String,List<Employee>>> entrySet = employeeListByDepartment.entrySet();
		
		for (Entry<String, List<Employee>> entry : entrySet) 
		{
		    System.out.println("--------------------------------------");
		             
		    System.out.println("Employees In "+entry.getKey() + " : ");
		             
		    System.out.println("--------------------------------------");
		             
		    List<Employee> list = entry.getValue();
		             
		    for (Employee e : list) 
		    {
		        System.out.println(e.getName());
		    }
		}
	}
	
	public static void method13() {
		System.out.println("Query 13 : What is the average salary and total salary of the whole organization?");

		DoubleSummaryStatistics employeeSalaryStatistics = emplist.stream()
				                     .collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
		System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
	}
	
}
