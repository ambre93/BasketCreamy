package fr.basketcreamy.entities;

import java.util.Date;
import java.util.List;

public class Commande {
	private Integer id;
	private Integer numero;
	private Date dateCreation;
	private Date dateLivraison;
	private Double totalRemise;
	private Double fraisExpedition;
	private Double totalGeneral;
	private String adresseFacturation;
	private String adresseLivraison;
	private Long cartePaiementDefaut;
	private Integer utilisateur;
	private List<LigneDeCommande> lignesCommande;
	
	
	public Commande() {

	}


	public Commande(Integer numero, Date dateCreation, Date dateLivraison, Double totalRemise, Double fraisExpedition,
			Double totalGeneral, String adresseFacturation, String adresseLivraison, Long cartePaiementDefaut,
			Integer utilisateur, List<LigneDeCommande> lignesCommande) {
		super();
		this.numero = numero;
		this.dateCreation = dateCreation;
		this.dateLivraison = dateLivraison;
		this.totalRemise = totalRemise;
		this.fraisExpedition = fraisExpedition;
		this.totalGeneral = totalGeneral;
		this.adresseFacturation = adresseFacturation;
		this.adresseLivraison = adresseLivraison;
		this.cartePaiementDefaut = cartePaiementDefaut;
		this.utilisateur = utilisateur;
		this.lignesCommande = lignesCommande;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public Date getDateLivraison() {
		return dateLivraison;
	}


	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}


	public Double getTotalRemise() {
		return totalRemise;
	}


	public void setTotalRemise(Double totalRemise) {
		this.totalRemise = totalRemise;
	}


	public Double getFraisExpedition() {
		return fraisExpedition;
	}


	public void setFraisExpedition(Double fraisExpedition) {
		this.fraisExpedition = fraisExpedition;
	}


	public Double getTotalGeneral() {
		return totalGeneral;
	}


	public void setTotalGeneral(Double totalGeneral) {
		this.totalGeneral = totalGeneral;
	}


	public String getAdresseFacturation() {
		return adresseFacturation;
	}


	public void setAdresseFacturation(String adresseFacturation) {
		this.adresseFacturation = adresseFacturation;
	}


	public String getAdresseLivraison() {
		return adresseLivraison;
	}


	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}


	public Long getCartePaiementDefaut() {
		return cartePaiementDefaut;
	}


	public void setCartePaiementDefaut(Long cartePaiementDefaut) {
		this.cartePaiementDefaut = cartePaiementDefaut;
	}


	public Integer getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Integer utilisateur) {
		this.utilisateur = utilisateur;
	}


	public List<LigneDeCommande> getLignesCommande() {
		return lignesCommande;
	}


	public void setLignesCommande(List<LigneDeCommande> lignesCommande) {
		this.lignesCommande = lignesCommande;
	}


}
