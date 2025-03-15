package com.learningwithregan.taskmanager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TaskController {

    @GetMapping("/tasks")
    public String getTasks(Model model) {
        Task task = new Task(
            "Make sandwich", 
            "Make a sandwich with butter, peanut butter, and apricot jam.",
            "Regan",
            "Regan");

        model.addAttribute("task", task);
        return "tasks";
    }
}
