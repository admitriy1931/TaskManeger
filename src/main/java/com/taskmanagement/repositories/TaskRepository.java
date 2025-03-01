package com.taskmanagement.repositories;

import com.taskmanagement.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, Long> {
}
