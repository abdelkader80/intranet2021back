package com.example.demo.DAO;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.equipement;

@RepositoryRestResource
@CrossOrigin("*")
public interface EquipementRepository extends JpaRepository<equipement, Integer> {
	

}
