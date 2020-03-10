package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Repas {
	@Id
	private int idRepas;
	private String libelle;
	private boolean isActive;

	public Repas() {
		super();
	}

	public int getIdRepas() {
		return idRepas;
	}

	public void setIdRepas(int idRepas) {
		this.idRepas = idRepas;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
