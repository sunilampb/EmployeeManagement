package com.ade.service;

import com.ade.entity.Employee;
import com.ade.exception.BadRequestException;
import com.ade.exception.ResourceNotFoundException;
import com.ade.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IService {
    @Autowired
    private EmployeeRepo repository;
    public List<Employee> getAll() {
        return repository.getAll();
           }

    public Employee getOne(String id) {
        Employee ext = repository.getOne(id);
        //ext = null;

        if(ext == null){
            //Exception handling 404
            throw new ResourceNotFoundException("No entry for key : " + id);
        }
        return ext;
    }

    public Employee update(String id, Employee employee) {
        Employee ext = repository.getOne(id);

        if(ext == null) {
            //Exception handling 404
            throw new ResourceNotFoundException("No entry for key : " + id);
        }
        return  repository.update(id, employee);
    }

    public Employee create(Employee employee) {
        Employee ext = repository.getByEmail(employee.getEmail());
        if(ext != null){
            //Exception handling 400 Bad req
            throw new BadRequestException("The employee with Email :" +employee.getEmail() + " Already Exist.");
            }
        return repository.create(employee);
    }

    public void delete(String id) {
        Employee ext = repository.getOne(id);
        if(ext == null){
            //Exception handling  404
            throw new ResourceNotFoundException("No entry for key : " + id);
        }
            repository.delete(id);
    }
}
