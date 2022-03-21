package fr.basketcreamy.entities;

public class ArticlePanier {
	private Integer id;
	private Integer article;
	private Integer quantite;
	private Integer utilisateur;
	
	public ArticlePanier() {

	}

	public ArticlePanier(Integer article, Integer quantite, Integer utilisateur) {
		super();
		this.article = article;
		this.quantite = quantite;
		this.utilisateur = utilisateur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getArticle() {
		return article;
	}

	public void setArticle(Integer article) {
		this.article = article;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Integer getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Integer utilisateur) {
		this.utilisateur = utilisateur;
	}
	
}
