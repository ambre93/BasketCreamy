package fr.basketcreamy.entities;

public class Commentaire {
	private Integer id;
	private String texte;
	private byte note;
	private Integer article;
	private Integer utilisateur;
	
	public Commentaire() {
		
	}

	public Commentaire(String texte, byte note, Integer article, Integer utilisateur) {
		super();
		this.texte = texte;
		this.note = note;
		this.article = article;
		this.utilisateur = utilisateur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public byte getNote() {
		return note;
	}

	public void setNote(byte note) {
		this.note = note;
	}

	public Integer getArticle() {
		return article;
	}

	public void setArticle(Integer article) {
		this.article = article;
	}

	public Integer getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Integer utilisateur) {
		this.utilisateur = utilisateur;
	}


}
