package com.example.demo.model;

import java.util.Collection;
import com.example.demo.model.FamilleRepas;
import javax.persistence.*;

@Entity
public class Repas {
	
	@Id
	private int idRepas;
	
	@ManyToMany(mappedBy="repas")
	private Collection<FamilleRepas> familleRepas;
	
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
