package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entities.reservation;

@Repository
public interface ReservationRepository extends CrudRepository<reservation, Integer> {

}
