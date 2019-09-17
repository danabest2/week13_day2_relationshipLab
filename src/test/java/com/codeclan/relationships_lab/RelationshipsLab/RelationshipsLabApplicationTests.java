package com.codeclan.relationships_lab.RelationshipsLab;

import com.codeclan.relationships_lab.RelationshipsLab.models.Department;
import com.codeclan.relationships_lab.RelationshipsLab.models.Employee;
import com.codeclan.relationships_lab.RelationshipsLab.models.Project;
import com.codeclan.relationships_lab.RelationshipsLab.repositories.DepartmentRepository;
import com.codeclan.relationships_lab.RelationshipsLab.repositories.EmployeeRepository;
import com.codeclan.relationships_lab.RelationshipsLab.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationshipsLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddEmployeeAndDepartment(){
		Department department = new Department("Marketing");
		departmentRepository.save(department);
		Employee employee = new Employee("John", "Snow", "emp10", department);
		employeeRepository.save(employee);
	}

	@Test
	public void canAddProjectsToEmployeesAndEmployeesToProjects() {
		Department department = new Department("IT");
		departmentRepository.save(department);
		Employee employee = new Employee("Maria", "Black", "emp11", department);
		employeeRepository.save(employee);
		Project project = new Project("SecurityUpdate", 8);
		projectRepository.save(project);
		employee.addProjectToEmployee(project);
		employeeRepository.save(employee);
	}
}
