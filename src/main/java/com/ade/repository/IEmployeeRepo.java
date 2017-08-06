package com.ade.repository;

import com.ade.entity.Employee;

import java.util.List;

public interface IEmployeeRepo {

    public List<Employee> getAll();

    public Employee getByEmail(String email);

    public Employee getOne(String id);

    public Employee create(Employee employee);

    public Employee update(String id, Employee employee);

    public  void delete(String id);
}
