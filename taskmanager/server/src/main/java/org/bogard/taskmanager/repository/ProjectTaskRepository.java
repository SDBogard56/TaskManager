package org.bogard.taskmanager.repository;

import org.bogard.taskmanager.model.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "project_task", path = "project_task")
@CrossOrigin(origins = "http://localhost:4200")
public interface ProjectTaskRepository extends JpaRepository<ProjectTask, Long> {
}
