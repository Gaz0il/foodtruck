package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EnteteCommande {
	@Id
	private int idCommande;
	@ManyToOne
	@JoinColumn(name = "id_Utilisateur")
	private Utilisateur idUtilisateur;
	private Date dateCommande;
	private int totalCommande;
	@ManyToOne
	@JoinColumn(name = "id_AdresseLivraison")
	private Adresse idAdresseLivraison;
	@ManyToOne
	@JoinColumn(name = "id_AdresseFacturation")
	private Adresse idAdresseFacturation;
	private int numFacturation;
	private boolean isDelivrer;
	@OneToMany(mappedBy = "idEnteteCommande")
	private Collection<Repas> listeRepas;
	@OneToMany(mappedBy = "EnteteCommande")
	private Collection<LigneCommande> listeCommande;

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

	public Collection<Repas> getListeRepas() {
		return listeRepas;
	}

	public void setListeRepas(Collection<Repas> listeRepas) {
		this.listeRepas = listeRepas;
	}

}
