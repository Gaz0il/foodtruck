package com.example.demo.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Produit {
	@Id
	private int id;
	private String libelle;
	private double prix;
	private String imageUrl;

	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	@JoinColumn(name = "Id_FamilleRepas")
	private FamilleRepas idFamilleRepas;
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	@JoinColumn(name = "Id_ligneCommande")
	private LigneCommande lignecommande;

	private String disponibilite;
	private int stock;
	private String composition;
	private int nombreVendu;

	@OneToMany(mappedBy = "idProduit")
	private Collection<Avis> avis;

	public Collection<Avis> getAvis() {
		return avis;
	}

	public void setAvis(Collection<Avis> avis) {
		this.avis = avis;
	}

	public Produit() {
		super();
	}

	public FamilleRepas getIdFamilleRepas() {
		return idFamilleRepas;
	}

	public void setIdFamilleRepas(FamilleRepas idFamilleRepas) {
		this.idFamilleRepas = idFamilleRepas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public int getNombreVendu() {
		return nombreVendu;
	}

	public void setNombreVendu(int nombreVendu) {
		this.nombreVendu = nombreVendu;
	}

}
