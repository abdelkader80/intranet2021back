package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class reservation {
	@Id
  private int numero;
  private Date date_debut;
  private Date date_fin;
  private String nom_evenement;
  
}
