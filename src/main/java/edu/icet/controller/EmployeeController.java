package edu.icet.controller;
import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody Employee employee) {
        service.addEmployee(employee);
    }

    @GetMapping("/get-all")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(Math.toIntExact(id));
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateEmployee(@RequestBody Employee employee) {
        service.updateEmployee(employee);

    }
}