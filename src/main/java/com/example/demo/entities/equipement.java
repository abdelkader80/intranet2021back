package com.example.demo.entities;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonBackReference;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class equipement {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int  numero_serie;
   private String type;
   private String marque;
   private String reference ;
   private String date_acquisition;
   private String configuration;
   @ManyToOne
   @JsonBackReference
   private Employee employee;
}
