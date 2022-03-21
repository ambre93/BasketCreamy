package fr.basketcreamy.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nom;
	private byte remise;
	private boolean isRemiseCumulable;
	private String photo;
	
	@OneToMany(mappedBy="articles")
	private List<Article> articles;
	
	public Categorie() {
		
			}
	
	public Categorie(String nom, byte remise, boolean isRemiseCumulable, String photo, List<Article> articles) {
		super();
		this.nom = nom;
		this.remise = remise;
		this.isRemiseCumulable = isRemiseCumulable;
		this.photo = photo;
		this.articles = articles;
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

	public byte getRemise() {
		return remise;
	}

	public void setRemise(byte remise) {
		this.remise = remise;
	}

	public boolean isRemiseCumulable() {
		return isRemiseCumulable;
	}

	public void setRemiseCumulable(boolean isRemiseCumulable) {
		this.isRemiseCumulable = isRemiseCumulable;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	
	public List<Article> getArticles() {
			return articles;
		}

	public void setArticles(List<Article> articles) {
			this.articles = articles;
		}
	

}

	
