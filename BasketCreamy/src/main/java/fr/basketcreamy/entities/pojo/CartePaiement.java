package fr.basketcreamy.entities.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carte_paiement")
public class CartePaiement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nom_proprietaire", nullable = false)
	private String nomProprietaire;
	
	@Column(name = "prenom_proprietaire", nullable = false)
	private String prenomProprietaire;
	
	@Column(name = "numero", nullable = false, unique = true)
	private byte[] numero;
	
	
	@Column(name = "date_fin_validite", nullable = false)
	private Date dateFinValidite;
	
	@Column(name = "cryptogramme", nullable = false)
	private byte[] cryptogramme;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id", nullable = false, insertable = true)
	private User user;
	
	public CartePaiement() {
		
	}
	
	public CartePaiement(String nomProprietaire, String prenomProprietaire, byte[] numero, Date dateFinValidite,
			byte[] cryptogramme, User user) {
		super();
		this.nomProprietaire = nomProprietaire;
		this.prenomProprietaire = prenomProprietaire;
		this.numero = numero;
		this.dateFinValidite = dateFinValidite;
		this.cryptogramme = cryptogramme;
		this.user = user;
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

	public User getUtilisateur() {
		return user;
	}

	public void setUtilisateur(User user) {
		this.user = user;
	}
		
	

}
