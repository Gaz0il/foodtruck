package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FamilleRepas {
	@Id
	private int idFamilleRepas;
	private String libelle;
	private boolean actif;

	public FamilleRepas() {
		super();
	}

	public int getIdFamilleRepas() {
		return idFamilleRepas;
	}

	public void setIdFamilleRepas(int idFamilleRepas) {
		this.idFamilleRepas = idFamilleRepas;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

}
