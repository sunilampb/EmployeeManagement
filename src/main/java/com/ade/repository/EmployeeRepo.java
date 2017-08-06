package com.ade.repository;

import com.ade.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepo implements IEmployeeRepo {
    public List<Employee> getAll() {
        ArrayList<Employee> list = new ArrayList<Employee>();

        Employee e1 = new Employee();
        e1.setEmail("adeparkar@gmail.com");
        e1.setFirstName("Ade");
        e1.setLastName("Parker");
        e1.setId("1");

        Employee e2 = new Employee();
        e2.setId("1");
        e2.setFirstName("Ade");
        e2.setLastName("Parker");
        e2.setEmail("adeparkar@gmail.com");
        list.add(e1);
        list.add(e2);

        return list;

    }

    public Employee getByEmail(String email) {
        Employee e1 = new Employee();
        e1.setEmail("adeparkar@gmail.com");
        e1.setFirstName("Ad");
        e1.setLastName("Parker");
        e1.setId("1");
        return e1;
    }

    public Employee getOne(String id) {
        Employee e1 = new Employee();
        e1.setEmail("adeparkar@gmail.com");
        e1.setFirstName("Ade");
        e1.setLastName("Parker");
        e1.setId("1");
        return e1;
    }

    public Employee create(Employee employee) {
        return employee;
    }

    public Employee update(String id, Employee employee) {
        Employee e1 = new Employee();
        e1.setEmail("adeparkr@gmail.com");
        e1.setFirstName("Ade");
        e1.setLastName("Parker");
        e1.setId("1");
        return e1;
    }

    public void delete(String id) {

    }
}
