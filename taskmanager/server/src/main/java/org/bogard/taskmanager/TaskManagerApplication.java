package org.bogard.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class TaskManagerApplication implements ErrorController {

    private static final String PATH = "/error";

    public static void main(String[] args) {
        SpringApplication.run(org.bogard.taskmanager.TaskManagerApplication.class, args);
    }

    @RequestMapping(value = PATH)
    public String error() {
        return "forward:/index.html";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }

}
