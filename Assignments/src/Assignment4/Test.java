package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List emplist=new ArrayList<>();
		
		emplist.add(new Employee(1, "Vaibhav Pagar", 25, 50000));
		emplist.add(new Employee(2, "Shiv Patil", 29, 60000));
		emplist.add(new Employee(3, "Akshay Vibhute", 26, 70000));
		emplist.add(new Employee(4, "Deepak Shirale", 30, 10000));
		emplist.add(new Employee(5, "Poonam Shende", 24, 20000));
		emplist.add(new Employee(6, "Vinod Kumar", 27, 25000));
		
		System.out.println("Determine the Custom Exception Based On Age");

	}
}
