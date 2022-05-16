package com.foxtech.taskfox.controller;

import com.foxtech.taskfox.dto.Note;
import com.foxtech.taskfox.dto.Task;
import com.foxtech.taskfox.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    public TaskService taskService;

    @PostMapping("/create")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @GetMapping("/read")
    public Task getTask(@RequestParam("taskId") Integer taskId) {
        return taskService.getTaskByTaskId(taskId);
    }

    @GetMapping("/read/all")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/read/{date}")
    public List<Task> getAllTasksByDate(@RequestParam("date") Date date) {
        return taskService.getAllTasksByDate(date);
    }

    @PutMapping("/update/{taskId}")
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping("/delete/{taskId}")
    public Task deleteTask(@RequestBody Task task) {
        return taskService.deleteTask(task);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllTasks() {
        taskService.deleteAllTasks();
    }

}
