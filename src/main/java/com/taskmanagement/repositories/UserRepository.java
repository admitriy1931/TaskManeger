package com.taskmanagement.repositories;

import com.taskmanagement.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}
