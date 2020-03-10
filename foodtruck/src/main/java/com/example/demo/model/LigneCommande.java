package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LigneCommande {
	
	@Id
	private int IdLigneCommande;
	private int IdProduct;
	private int EnteteCommande;
	private int Quantite;
	private int PrixUnitaire;
	@Override
	public String toString() {
		return "LigneCommande [IdLigneCommande=" + IdLigneCommande + ", IdProduct=" + IdProduct + ", EnteteCommande="
				+ EnteteCommande + ", Quantite=" + Quantite + ", PrixUnitaire=" + PrixUnitaire + "]";
	}
	public int getIdLigneCommande() {
		return IdLigneCommande;
	}
	public void setIdLigneCommande(int idLigneCommande) {
		IdLigneCommande = idLigneCommande;
	}
	public int getIdProduct() {
		return IdProduct;
	}
	public void setIdProduct(int idProduct) {
		IdProduct = idProduct;
	}
	public int getEnteteCommande() {
		return EnteteCommande;
	}
	public void setEnteteCommande(int enteteCommande) {
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
	public LigneCommande(int idLigneCommande, int idProduct, int enteteCommande, int quantite, int prixUnitaire) {
		super();
		IdLigneCommande = idLigneCommande;
		IdProduct = idProduct;
		EnteteCommande = enteteCommande;
		Quantite = quantite;
		PrixUnitaire = prixUnitaire;
	}
	public LigneCommande() {
		super();
	}
	
	

}
