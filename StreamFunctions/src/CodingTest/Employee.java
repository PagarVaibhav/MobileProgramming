package CodingTest;

public class Employee {

	int id;
	
    String name;
    
    double salary;
    
    Number managerId;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Number getManagerId() {
		return managerId;
	}

	public Employee(int id, String name, double salary, Number managerId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", managerId=" + managerId + "]";
	}

    
}
