package fr.basketcreamy.entities;

public class LigneDeCommande {
	private Integer id;
	private Integer quantite;
	private Double prixUnitaire;
	private Integer remiseArticle;
	private Integer commande;
	private Integer article;
	
	public LigneDeCommande() {

	}

	public LigneDeCommande(Integer quantite, Double prixUnitaire, Integer remiseArticle, Integer commande,
			Integer article) {
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

	public Integer getRemiseArticle() {
		return remiseArticle;
	}

	public void setRemiseArticle(Integer remiseArticle) {
		this.remiseArticle = remiseArticle;
	}

	public Integer getCommande() {
		return commande;
	}

	public void setCommande(Integer commande) {
		this.commande = commande;
	}

	public Integer getArticle() {
		return article;
	}

	public void setArticle(Integer article) {
		this.article = article;
	}
	
	
}
