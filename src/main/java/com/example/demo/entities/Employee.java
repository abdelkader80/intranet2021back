package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Employee{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long matricule;
 private String nom;
 private String prenom;
 private String grade;
 @ManyToOne
 @JsonBackReference
 private Unite nomUnite;
 @OneToMany(mappedBy = "employee")
 @JsonManagedReference
 
 List<equipement> equips = new ArrayList<>();
 
 
}