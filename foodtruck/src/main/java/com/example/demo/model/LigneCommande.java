package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class LigneCommande {

	@Id
	private int IdLigneCommande;

	@OneToMany(mappedBy = "lignecommande")
	private Collection<Produit> IdProduct;
	@ManyToOne
	@JoinColumn(name = "id_EnteteCommande")
	private EnteteCommande EnteteCommande;
	private int Quantite;
	private int PrixUnitaire;



	public int getIdLigneCommande() {
		return IdLigneCommande;
	}

	public Collection<Produit> getIdProduct() {
		return IdProduct;
	}

	public void setIdProduct(Collection<Produit> idProduct) {
		IdProduct = idProduct;
	}

	public void setIdLigneCommande(int idLigneCommande) {
		IdLigneCommande = idLigneCommande;
	}

	public EnteteCommande getEnteteCommande() {
		return EnteteCommande;
	}

	public void setEnteteCommande(EnteteCommande enteteCommande) {
		EnteteCommande = enteteCommande;
	}

	public int getQuantite() {
		return Quantite;
	}

	public void setQuantite(int quantite) {
		Quantite = quantite;
	}

	public int getPrixUnitaire() {
		return PrixUnitaire;
	}

	public void setPrixUnitaire(int prixUnitaire) {
		PrixUnitaire = prixUnitaire;
	}

	public LigneCommande() {
		super();
	}

}
