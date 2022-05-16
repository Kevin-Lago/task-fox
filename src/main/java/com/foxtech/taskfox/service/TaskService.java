package com.foxtech.taskfox.service;

import com.foxtech.taskfox.dto.Note;
import com.foxtech.taskfox.dto.Task;
import com.foxtech.taskfox.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    TaskRepository taskRepository;
    EntityManager entityManager;

    public TaskService(TaskRepository taskRepository, EntityManager entityManager) {
        this.taskRepository = taskRepository;
        this.entityManager = entityManager;
    }

    public Task createTask(Task task) {
        task.setCreateDate(new Date());
        return taskRepository.save(task);
    }

    public Task getTaskByTaskId(Integer taskId) {
        Optional<Task> task = taskRepository.findById(taskId);

        return task.orElse(null);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getAllTasksByDate(Date date) {
        return taskRepository.findAllByCreateDate(date);
    }

    public Task updateTask(Task task) {
        return null;
    }

    public Task deleteTask(Task task) {
        return null;
    }

    public void deleteAllTasks() {
        taskRepository.deleteAll();
    }

}
