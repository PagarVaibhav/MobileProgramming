package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List l=new ArrayList<>();
		
		l.add(new Employee("Vaibhav", 10000));
		l.add(new Employee("Akshay", 25000));
		l.add(new Employee("Shiv", 3000));
		l.add(new Employee("Mangesh", 40000));

		System.out.println("Sort By Salary Using Comparator");
		
		Collections.sort(l, new SalaryComparator());
		
		Iterator itr=l.iterator();  
		while(itr.hasNext()){  
		Employee emp=(Employee)itr.next();  
		System.out.println(emp.getName() + " " + emp.getSalary());  
		}  
	}
}
