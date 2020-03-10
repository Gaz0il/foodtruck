package com.example.demo.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FamilleRepas {
	
	@Id
	
	private int idFamilleRepas;
	
	@OneToMany (mappedBy="idFamilleRepas")
	private Collection<Produit> produit;
	
	private String libelle;
	private boolean actif;

	
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
