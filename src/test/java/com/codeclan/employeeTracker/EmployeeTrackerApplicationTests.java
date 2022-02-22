package com.codeclan.employeeTracker;

import com.codeclan.employeeTracker.models.Employee;
import com.codeclan.employeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee1 = new Employee("Peter Williams", 23, 642, "big_pete_the_legend@gmail.com");
		employeeRepository.save(employee1);
	}
}
