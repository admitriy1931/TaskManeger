package com.taskmanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "tasks")
public class Task {
    @Id
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    public Task(String ignoredSampleTask, String ignoredTaskDescription) {
    }

}
