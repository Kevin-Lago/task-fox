package com.foxtech.taskfox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TaskFoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskFoxApplication.class, args);
	}

}
