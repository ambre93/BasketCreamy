package fr.basketcreamy.entities.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "numero", nullable = false, unique = true)
	private Integer numero;
	@Column(name = "date_creation", nullable = false)
	private Date dateCreation;
	@Column(name = "date_livraison", nullable = false)
	private Date dateLivraison;
	@Column(name = "total_remise", nullable = false)
	private Double totalRemise = 0.00;
	@Column(name = "frais_expedition", nullable = false)
	private Double fraisExpedition;
	@Column(name = "total_general", nullable = false)
	private Double totalGeneral;
	
	@OneToOne
	@JoinColumn(name = "adresseFact_id")
	private Adresse adresseFacturation;
	
	@OneToOne
	@JoinColumn(name = "adresseLiv_id")
	private Adresse adresseLivraison;
	
	@OneToOne
	@JoinColumn(name = "cartePaiement_id")
	private CartePaiement cartePaiementDefaut;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id", nullable = false, insertable = true)
	private User user;
	
	@OneToMany(mappedBy="lignes_commande")
	private List<LigneDeCommande> lignesCommande;
	
	
	public Commande() {

	}


	public Commande(Integer numero, Date dateCreation, Date dateLivraison, Double totalRemise, Double fraisExpedition,
			Double totalGeneral, Adresse adresseFacturation, Adresse adresseLivraison,
			CartePaiement cartePaiementDefaut, User user, List<LigneDeCommande> lignesCommande) {
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
		this.user = user;
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


	public Adresse getAdresseFacturation() {
		return adresseFacturation;
	}


	public void setAdresseFacturation(Adresse adresseFacturation) {
		this.adresseFacturation = adresseFacturation;
	}


	public Adresse getAdresseLivraison() {
		return adresseLivraison;
	}


	public void setAdresseLivraison(Adresse adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}


	public CartePaiement getCartePaiementDefaut() {
		return cartePaiementDefaut;
	}


	public void setCartePaiementDefaut(CartePaiement cartePaiementDefaut) {
		this.cartePaiementDefaut = cartePaiementDefaut;
	}


	public User getUtilisateur() {
		return user;
	}


	public void setUtilisateur(User user) {
		this.user = user;
	}


	public List<LigneDeCommande> getLignesCommande() {
		return lignesCommande;
	}


	public void setLignesCommande(List<LigneDeCommande> lignesCommande) {
		this.lignesCommande = lignesCommande;
	}


	
}
