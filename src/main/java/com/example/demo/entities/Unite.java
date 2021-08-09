package com.example.demo.entities;





import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity  @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Unite {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code_fonction;
	private String Nom_fonction;
	@OneToMany(mappedBy = "nomUnite")
	@JsonManagedReference
	List<Employee> users = new ArrayList<>();
}
