package com.tech;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		Comparator<Employee> employeeComparator = (o1, o2) -> o1.name.compareTo(o2.name);

		Set<String> sortedNames = employees.stream().sorted(employeeComparator).map(e -> e.name)
				.collect(Collectors.toCollection(LinkedHashSet::new));

		System.out.println(sortedNames);

		Comparator<Employee> reversed = employeeComparator.reversed();
		LinkedHashSet<String> sortedNamesReversed = employees.stream().sorted(reversed).map(e -> e.name)
				.collect(Collectors.toCollection(LinkedHashSet::new));

		System.out.println(sortedNamesReversed);
		
	}
}
