package com.tech;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ThenComparatorTest {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		/* thenComparing(Comparator<? super Employee> other) */
		Function<? super Employee, ? extends String> keyExtractor = Employee::getName;
		List<Employee> collect = employees.stream()
				.sorted(Comparator.comparing(Employee::getAge).thenComparing(keyExtractor))
				.collect(Collectors.toList());

		System.out.println(collect);

		// thenComparing(Function<? super Employee, ? extends ? extends String>
		// keyExtractor, Comparator<? super ? extends String> keyComparator)
		List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getAge)
				.thenComparing(keyExtractor, Comparator.comparing(String::valueOf))).collect(Collectors.toList());
		System.out.println(sortedEmployees);

		//thenComparing(Comparator<? super Employee> other)
		List<Employee> compareDtaas = employees.stream()
				.sorted(Comparator.comparing(Employee::getAge).thenComparing(Comparator.comparing(Employee::getName)))
				.collect(Collectors.toList());
		System.out.println(compareDtaas);

		//public java.util.Comparator thenComparingInt(java.util.function.ToIntFunction);

		//public java.util.Comparator thenComparingLong(java.util.function.ToLongFunction);

		//public java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction);
	}
}
