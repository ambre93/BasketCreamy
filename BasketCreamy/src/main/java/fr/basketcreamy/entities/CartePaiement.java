package fr.basketcreamy.entities;

import java.util.Date;

public class CartePaiement {
	//test
	private Integer id;
	private String nomProprietaire;
	private String prenomProprietaire;
	private byte[] numero;
	private Date dateFinValidite;
	private byte[] cryptogramme;
	private Integer utilisateur;
	public CartePaiement() {
		
	}
	public CartePaiement(String nomProprietaire, String prenomProprietaire, byte[] numero, Date dateFinValidite,
			byte[] cryptogramme, Integer utilisateur) {
		super();
		this.nomProprietaire = nomProprietaire;
		this.prenomProprietaire = prenomProprietaire;
		this.numero = numero;
		this.dateFinValidite = dateFinValidite;
		this.cryptogramme = cryptogramme;
		this.utilisateur = utilisateur;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomProprietaire() {
		return nomProprietaire;
	}
	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}
	public String getPrenomProprietaire() {
		return prenomProprietaire;
	}
	public void setPrenomProprietaire(String prenomProprietaire) {
		this.prenomProprietaire = prenomProprietaire;
	}
	public byte[] getNumero() {
		return numero;
	}
	public void setNumero(byte[] numero) {
		this.numero = numero;
	}
	public Date getDateFinValidite() {
		return dateFinValidite;
	}
	public void setDateFinValidite(Date dateFinValidite) {
		this.dateFinValidite = dateFinValidite;
	}
	public byte[] getCryptogramme() {
		return cryptogramme;
	}
	public void setCryptogramme(byte[] cryptogramme) {
		this.cryptogramme = cryptogramme;
	}
	public Integer getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Integer utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	

}
