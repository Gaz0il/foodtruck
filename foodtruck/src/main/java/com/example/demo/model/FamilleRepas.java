package com.example.demo.model;

import java.util.Collection;

import javax.persistence.*;
import com.example.demo.model.Repas;

@Entity
public class FamilleRepas {

	@Id

	private int idFamilleRepas;

	@OneToMany(mappedBy = "idFamilleRepas")
	private Collection<Produit> produit;

	@ManyToMany
	@JoinTable(name = "Repas_FamilleRepas", joinColumns = @JoinColumn(name = "famille_id"), inverseJoinColumns = @JoinColumn(name = "repas_id"))
	private Collection<Repas> repas;

	private String libelle;
	private boolean actif;

	public FamilleRepas(int idFamilleRepas, String libelle) {
		super();
		this.idFamilleRepas = idFamilleRepas;
		this.libelle = libelle;
	}

	public Collection<Produit> getProduit() {
		return produit;
	}

	public void setProduit(Collection<Produit> produit) {
		this.produit = produit;
	}

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
