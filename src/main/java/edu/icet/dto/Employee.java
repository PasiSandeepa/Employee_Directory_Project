package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@ToString
public class Employee {
       private Long id;
       private  String name;
       private String email;
       private String department;
        private final LocalDateTime createdAt;
        private LocalDateTime updatedAt;

    public Employee(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
