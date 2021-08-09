package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.demande_materielles;

@Repository
public interface DemandeMatRepository extends CrudRepository<demande_materielles, Integer> {

}
