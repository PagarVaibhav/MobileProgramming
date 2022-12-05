package Prepcall;

import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;

public class Prep14 {
// Find Highest Salary
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10000,15000,40000,25000,25000,35000);
		
		LongSummaryStatistics statistics = l.stream().mapToLong((x)-> x).summaryStatistics();
		
		System.out.println(statistics.getMax());
	}
}
