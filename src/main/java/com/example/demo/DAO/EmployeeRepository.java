package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Employee;


@Repository
@CrossOrigin("*")
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
