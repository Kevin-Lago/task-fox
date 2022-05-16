package com.foxtech.taskfox.repo;

import com.foxtech.taskfox.dto.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findAllByCreateDate(Date date);

}
