package com.example.demo.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Adresse {
	@Id
	private int id;
	private int numRue;
	private String rue;
	private int codePostal;
	private String pays;
	@OneToMany(mappedBy = "idAdresse")
	private Collection<Utilisateur> listeUtilisateur;
	private boolean isActive;
	@OneToMany(mappedBy = "idAdresseLivraison")
	private Collection<EnteteCommande> listeTeteCommandeLivraison;
	@OneToMany(mappedBy = "idAdresseFacturation")
	private Collection<EnteteCommande> listeTeteCommandeFacturation;
	private String ville;
	
	

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Adresse() {
		super();
	}

	public Collection<Utilisateur> getListeUtilisateur() {
		return listeUtilisateur;
	}

	public void setListeUtilisateur(Collection<Utilisateur> listeUtilisateur) {
		this.listeUtilisateur = listeUtilisateur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Collection<EnteteCommande> getListeTeteCommandeLivraison() {
		return listeTeteCommandeLivraison;
	}

	public void setListeTeteCommandeLivraison(Collection<EnteteCommande> listeTeteCommandeLivraison) {
		this.listeTeteCommandeLivraison = listeTeteCommandeLivraison;
	}

	public Collection<EnteteCommande> getListeTeteCommandeFacturation() {
		return listeTeteCommandeFacturation;
	}

	public void setListeTeteCommandeFacturation(Collection<EnteteCommande> listeTeteCommandeFacturation) {
		this.listeTeteCommandeFacturation = listeTeteCommandeFacturation;
	}

}
