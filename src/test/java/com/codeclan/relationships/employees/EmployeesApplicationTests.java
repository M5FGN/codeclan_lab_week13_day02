package com.codeclan.relationships.employees;

import com.codeclan.relationships.employees.models.Department;
import com.codeclan.relationships.employees.models.Employee;
import com.codeclan.relationships.employees.models.Project;
import com.codeclan.relationships.employees.repositories.DepartmentRepository;
import com.codeclan.relationships.employees.repositories.EmployeeRepository;
import com.codeclan.relationships.employees.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void createTestModels() {
		Department department = new Department("Java Devs");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Gabe", "Neil", "EN723", department);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Mary", "Fagan", "EN747", department);
		employeeRepository.save(employee2);

		Project project = new Project("This lab", 1);
		projectRepository.save(project);
	}
}
