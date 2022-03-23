package fr.basketcreamy.entities.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligneDeCommande")
public class LigneDeCommande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer quantite;
	private Double prixUnitaire;
	private Byte remiseArticle;
	
	@ManyToOne
	@JoinColumn(name = "commande_id", nullable = false, insertable = true)
	private Commande commande;
	
	@OneToOne
	@JoinColumn(name = "article_id", nullable = false, insertable = true)
	private Article article;
	
	public LigneDeCommande() {

	}

	public LigneDeCommande(Integer quantite, Double prixUnitaire, Byte remiseArticle, Commande commande,
			Article article) {
		super();
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
		this.remiseArticle = remiseArticle;
		this.commande = commande;
		this.article = article;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Byte getRemiseArticle() {
		return remiseArticle;
	}

	public void setRemiseArticle(Byte remiseArticle) {
		this.remiseArticle = remiseArticle;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	
}
