package ComparatorAndComparable;

import java.util.Comparator;

public class SalaryComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e2.getSalary().compareTo(e1.getSalary());
	}

	
}
