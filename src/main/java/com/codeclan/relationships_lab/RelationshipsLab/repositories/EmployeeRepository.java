package com.codeclan.relationships_lab.RelationshipsLab.repositories;

import com.codeclan.relationships_lab.RelationshipsLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
