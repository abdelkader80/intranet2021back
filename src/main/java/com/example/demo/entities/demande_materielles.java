package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class demande_materielles {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int numero;
   private String date_D;
   private  String materiel_d;
   private String configuration;
   private String auto_inscription;
   
}
