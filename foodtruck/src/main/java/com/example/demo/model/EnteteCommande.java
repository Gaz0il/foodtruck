package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EnteteCommande {
	@Id
	private int idCommande;
	private Utilisateur idUtilisateur;
	private Date dateCommande;
	private int totalCommande;
	private Adresse idAdresseLivraison, idAdresseFacturation;
	private int numFacturation;
	private boolean isDelivrer;
	private Repas idRepas;

	public EnteteCommande() {
		super();
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public Utilisateur getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Utilisateur idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public int getTotalCommande() {
		return totalCommande;
	}

	public void setTotalCommande(int totalCommande) {
		this.totalCommande = totalCommande;
	}

	public Adresse getIdAdresseLivraison() {
		return idAdresseLivraison;
	}

	public void setIdAdresseLivraison(Adresse idAdresseLivraison) {
		this.idAdresseLivraison = idAdresseLivraison;
	}

	public Adresse getIdAdresseFacturation() {
		return idAdresseFacturation;
	}

	public void setIdAdresseFacturation(Adresse idAdresseFacturation) {
		this.idAdresseFacturation = idAdresseFacturation;
	}

	public int getNumFacturation() {
		return numFacturation;
	}

	public void setNumFacturation(int numFacturation) {
		this.numFacturation = numFacturation;
	}

	public boolean isDelivrer() {
		return isDelivrer;
	}

	public void setDelivrer(boolean isDelivrer) {
		this.isDelivrer = isDelivrer;
	}

	public Repas getIdRepas() {
		return idRepas;
	}

	public void setIdRepas(Repas idRepas) {
		this.idRepas = idRepas;
	}

}
