package com.example.demo.model;

import java.util.Collection;
import com.example.demo.model.FamilleRepas;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import javax.persistence.*;

@Entity
public class Repas {

	@Id
	private int idRepas;
<<<<<<< HEAD

	@ManyToMany(mappedBy = "repas")
=======
	
	@ManyToMany(mappedBy="repas")
	@JsonProperty(access = Access.WRITE_ONLY)
>>>>>>> 76169301f8566ca1872b7b0000a14ad3a483f6c1
	private Collection<FamilleRepas> familleRepas;

	private String libelle;
	private boolean isActive;
	@ManyToOne
	@JoinColumn(name = "id_EnteteCommande")
	private EnteteCommande idEnteteCommande;

	public Repas() {
		super();
	}

	public Repas(int idRepas, String libelle) {
		super();
		this.idRepas = idRepas;
		this.libelle = libelle;
	}

	public Collection<FamilleRepas> getFamilleRepas() {
		return familleRepas;
	}

	public void setFamilleRepas(Collection<FamilleRepas> familleRepas) {
		this.familleRepas = familleRepas;
	}

	public EnteteCommande getIdEnteteCommande() {
		return idEnteteCommande;
	}

	public void setIdEnteteCommande(EnteteCommande idEnteteCommande) {
		this.idEnteteCommande = idEnteteCommande;
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
