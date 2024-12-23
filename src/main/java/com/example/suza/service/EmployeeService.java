package com.example.suza.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.suza.model.Employee;
import com.example.suza.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
    
    public List<Employee> getAllEmployees(){
        return  employeeRepo.findAll();

    }  

    public Employee getEmployeeById(Long employeeId) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(employeeId);
        return optionalEmployee.get();
     }

    public void deleteEmployee(Long employeeId) {
        employeeRepo.deleteById(employeeId);
    }

    public Employee updateEmployee(Long employeeId, Employee updatedEmployee) {
        Employee employee = employeeRepo.findById(employeeId) .orElseThrow(null);
 
         // update details from employee
 
         employee.setFirstName(updatedEmployee.getFirstName());
         employee.setLastName(updatedEmployee.getLastName());
         employee.setEmail(updatedEmployee.getEmail());
         employee.setEmployeeId(updatedEmployee.getEmployeeId());
         employee.setPhoneNumber(updatedEmployee.getPhoneNumber());
         employee.setZid(updatedEmployee.getZid());
         employee.setAddress(updatedEmployee.getAddress());
         employee.setDepartment(updatedEmployee.getDepartment());
 
         Employee updateEmployeeObj = employeeRepo.save(employee);
 
        return updateEmployeeObj;
     }
 

}
