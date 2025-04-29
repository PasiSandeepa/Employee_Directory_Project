package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@ToString
@Entity
@Table(name="employee")
public class EmployeeEntity {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       private  String name;
       private String email;
       private String department;
        private final LocalDateTime createdAt;
        private LocalDateTime updatedAt;

    public EmployeeEntity(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
