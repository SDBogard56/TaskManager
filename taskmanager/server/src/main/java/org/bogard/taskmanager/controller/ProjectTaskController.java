package org.bogard.taskmanager.controller;

import org.bogard.taskmanager.model.ProjectTask;
import org.bogard.taskmanager.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class ProjectTaskController {
    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    @GetMapping("/project_task")
    public List<ProjectTask> getAllTasks(){
        System.out.println("Get all Project Tasks...");

        List<ProjectTask> projectTaskList = new ArrayList<>();
        projectTaskRepository.findAll().forEach(projectTaskList::add);
        return projectTaskList;
    }
}
