package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Employee;

@Service
public class EmployeeService {

	public List<Employee> inMemoryData() {

		Employee employee1 = new Employee(1, "name1", "surname1", 1000);
		Employee employee2 = new Employee(2, "name2", "surname2", 2000);
		Employee employee3 = new Employee(3, "name3", "surname3", 3000);

		return List.of(employee1, employee2, employee3);
	}
}
