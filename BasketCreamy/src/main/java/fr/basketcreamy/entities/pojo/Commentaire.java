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
@Table(name = "commentaire")
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String texte;
	private byte note;
	
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id", nullable = false, insertable = true)
	private User user;
	
	public Commentaire() {
		
	}

	public Commentaire(String texte, byte note, Article article, User user) {
		super();
		this.texte = texte;
		this.note = note;
		this.article = article;
		this.user = user;
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

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public User getUtilisateur() {
		return user;
	}

	public void setUtilisateur(User user) {
		this.user = user;
	}


}
