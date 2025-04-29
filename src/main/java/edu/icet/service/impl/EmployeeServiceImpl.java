package edu.icet.service.impl;

import edu.icet.dto.Employee;
import edu.icet.entity.EmployeeEntity;
import edu.icet.repository.EmployeeRepository;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl  implements EmployeeService {


    final EmployeeRepository repository;
    final ModelMapper mapper;


    @Override
    public void addEmployee(Employee employee) {
        repository.save(mapper.map(employee,EmployeeEntity.class));
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<>();
        List<EmployeeEntity> all = repository.findAll();
        all.forEach(employeeEntity -> {
            employeeList.add(mapper.map(employeeEntity, Employee.class));
        });
        return employeeList;
    }

    @Override
    public void deleteEmployee(Integer id) {
        repository.deleteById(Long.valueOf(id));
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return mapper.map(repository.findById(id), Employee.class);
    }


}



