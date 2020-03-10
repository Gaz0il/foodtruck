package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {
	@Id
	private int id;
	private String nom, prenom;
	private Date dateNaissance;
	private String motDePasse;
	@ManyToOne
	@JoinColumn(name = "id_Genre")
	private Genre idGenre;
	private String email, societe;
	@ManyToOne
	@JoinColumn(name = "id_Adresse")
	private Adresse idAdresse;
	@ManyToOne
	@JoinColumn(name = "id_Profil")
	private Profil idProfil;
	@OneToMany(mappedBy = "idUtilisateur")
	private Collection<EnteteCommande> listeEnteteCommande;
	@OneToMany(mappedBy = "utilisateur")
	private Collection<Avis> avis;
	
	public Utilisateur() {
		super();
	}

	public Genre getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(Genre idGenre) {
		this.idGenre = idGenre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public Adresse getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(Adresse idAdresse) {
		this.idAdresse = idAdresse;
	}

	public Profil getIdProfil() {
		return idProfil;
	}

	public void setIdProfil(Profil idProfil) {
		this.idProfil = idProfil;
	}

	public Collection<EnteteCommande> getListeEnteteCommande() {
		return listeEnteteCommande;
	}

	public void setListeEnteteCommande(Collection<EnteteCommande> listeEnteteCommande) {
		this.listeEnteteCommande = listeEnteteCommande;
	}

}
