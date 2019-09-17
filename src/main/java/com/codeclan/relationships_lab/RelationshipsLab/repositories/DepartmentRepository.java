package com.codeclan.relationships_lab.RelationshipsLab.repositories;

import com.codeclan.relationships_lab.RelationshipsLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
