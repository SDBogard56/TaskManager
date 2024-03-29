package org.bogard.taskmanager.repository;

import org.bogard.taskmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "project", path = "project")
@CrossOrigin(origins = "http://localhost:4200")
public interface ProjectRepository extends JpaRepository<Project, Long>{
}
