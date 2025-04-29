package edu.icet.dto;

import java.time.LocalDateTime;

public class Employee {
       private String id;
       private  String name;
       private String email;
       private String department;
        private final LocalDateTime createdAt;
        private LocalDateTime updatedAt;

    public Employee(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
