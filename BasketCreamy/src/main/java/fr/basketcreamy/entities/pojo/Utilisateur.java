package fr.basketcreamy.entities.pojo;

import java.util.List;

import javax.persistence.CascadeType;
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
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private boolean isActif = false;
	private EnumProfil profil;
	private String email;
	private byte[] password;
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
	
	public Utilisateur() {
		
	}

	public Utilisateur(String nom, String prenom, String dateNaissance, boolean isActif, EnumProfil profil, String email,
			byte[] password, String telephone, List<Adresse> adresses, List<Commande> commandes,
			List<CartePaiement> cartesDePaiement, List<Commentaire> commentaires, List<ArticlePanier> panier) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.isActif = isActif;
		this.profil = profil;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
		this.adresses = adresses;
		this.commandes = commandes;
		this.cartesDePaiement = cartesDePaiement;
		this.commentaires = commentaires;
		this.panier = panier;
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

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String string) {
		this.dateNaissance = string;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	public EnumProfil getProfil() {
		return profil;
	}

	public void setProfil(EnumProfil profil) {
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

	public static Utilisateur getUserByEmail(String email2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
