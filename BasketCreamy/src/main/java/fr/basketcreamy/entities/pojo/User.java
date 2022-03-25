package fr.basketcreamy.entities.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.basketcreamy.enums.EnumProfil;

@Entity
@Table(name = "utilisateur")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	@Column(name = "prenom", nullable = false)
	private String prenom;
	@Column(name = "date_naissance")
	private Date dateNaissance;
	@Column(name = "is_actif", nullable = false)
	private boolean isActif = false;
	@Column(name = "profil", nullable = false)
	private String profil = "CLIENT";
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Column(name = "password", nullable = false)
	private byte[] password;
	@Column(name = "telephone", nullable = false)
	private String telephone;
	
	@OneToMany(mappedBy="adresses")
	private List<Adresse> adresses;
	
	@OneToMany(mappedBy="commandes")
	private List<Commande> commandes;
	
	@OneToMany(mappedBy="cartesDePaiement")
	private List<CartePaiement> cartesDePaiement;
	
	@OneToMany(mappedBy="commentaires")
	private List<Commentaire> commentaires;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "utilisateur")
	private List<ArticlePanier> panier;
	
	public User() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public void setDateNaissance(Date date) {
		this.dateNaissance = date;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public List<CartePaiement> getCartesDePaiement() {
		return cartesDePaiement;
	}

	public void setCartesDePaiement(List<CartePaiement> cartesDePaiement) {
		this.cartesDePaiement = cartesDePaiement;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public List<ArticlePanier> getPanier() {
		return panier;
	}

	public void setPanier(List<ArticlePanier> panier) {
		this.panier = panier;
	}

	public static User getUserByEmail(String email2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
