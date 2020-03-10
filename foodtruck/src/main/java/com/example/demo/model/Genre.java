package com.example.demo.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	@Id
	private int id;
	private String libelle;

	@OneToMany(mappedBy = "idGenre")
	private Collection<Utilisateur> listeUtilisateur;

	public Genre() {
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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
