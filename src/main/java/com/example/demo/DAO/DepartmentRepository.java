package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.departement;

@Repository
public interface DepartmentRepository extends CrudRepository<departement, Long>{

}
