package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FamilleRepas {
	@Id
	private int idFamilleRepas;
	private String libelle;
	private boolean actif;

}
