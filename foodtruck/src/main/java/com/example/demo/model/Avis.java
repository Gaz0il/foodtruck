package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Avis {
	@Id
	private int idAvis;
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	@JoinColumn(name="Id_Produit")
	private Produit idProduit;
	private double prixUser;
	private String commentaire;
	private int note;
	@ManyToOne
	@JoinColumn(name="id_Utilisateur")
	private Utilisateur utilisateur;

	public Avis() {
		super();
	}

	public int getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(int idAvis) {
		this.idAvis = idAvis;
	}

	public Produit getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Produit idProduit) {
		this.idProduit = idProduit;
	}

	public double getPrixUser() {
		return prixUser;
	}

	public void setPrixUser(double prixUser) {
		this.prixUser = prixUser;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

}
