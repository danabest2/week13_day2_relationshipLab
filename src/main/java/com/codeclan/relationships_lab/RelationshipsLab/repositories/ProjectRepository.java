package com.codeclan.relationships_lab.RelationshipsLab.repositories;

import com.codeclan.relationships_lab.RelationshipsLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
