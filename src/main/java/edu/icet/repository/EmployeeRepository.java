package edu.icet.repository;

import edu.icet.entity.EmployeeEntity;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    Object findById(SingularAttribute<AbstractPersistable, Serializable> id);
}
