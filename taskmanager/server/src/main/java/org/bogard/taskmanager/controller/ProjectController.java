package org.bogard.taskmanager.controller;

import org.bogard.taskmanager.model.Project;
import org.bogard.taskmanager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/projects")
    public List<Project> getAllTasks(){
        System.out.println("Get all Projects...");

        List<Project> projectList = new ArrayList<>();
        projectRepository.findAll().forEach(projectList::add);
        return projectList;
    }

    @PostMapping(path="/projects/create")
    public Project postTask(@RequestBody Project project){
        Project p = new Project();
        p.setName(project.getName());
        p.setDescription(project.getDescription());
        projectRepository.save(p);
        return p;
    }


}
