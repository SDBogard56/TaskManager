package org.polaroid.taskmaster.controller;

import java.util.ArrayList;
import java.util.List;
import org.polaroid.taskmaster.model.Project;
import org.polaroid.taskmaster.model.Task;
import org.polaroid.taskmaster.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/project-tasks/{id}")
    public List<Task> getProjectTasksById(@PathVariable("id") long id){
        System.out.println("Get all Project tasks with ID = " + id + "...");

        List<Task> projectTasks = new ArrayList<>();
        Project project = projectRepository.getOne(id);
        System.out.println(project.toString() + " found...");
        projectRepository.getOne(id).getTasks().forEach(projectTasks::add);
        for(Task task: project.getTasks()){
            System.out.println(task.toString());
        }
        //projectRepository.findAll().forEach(projectList::add);
        return projectTasks;
    }

}
