package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.intervention;

@Repository
public interface InterventionRepository extends CrudRepository<intervention, Integer> {

}
