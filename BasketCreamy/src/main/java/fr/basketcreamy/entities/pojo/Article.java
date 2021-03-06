package fr.basketcreamy.entities.pojo;

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

@Entity
@Table(name = "article")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nom" , nullable = false)
	private String nom;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "prix", nullable = false)
	private Double prix;
	
	@Column(name = "remise", nullable = false)
	private Integer remise =0;
	
	@Column(name = "stock", nullable = false)
	private Integer stock = 0;
	
	@Column(name = "isVendable")
	private Boolean isVendable = true;
	
	@Column(name = "photos")
	private String photos;
	
	@Column(name = "videos")
	private String videos;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "article")
	@Column(name = "commentaire")
	private List<Commentaire> commentaires;
	
	public Article() {
		
	}

	public Article(String nom, String description, Double prix, Integer remise, Integer stock, Boolean isVendable,
			String photos, String videos, List<Commentaire> commentaires) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.remise = remise;
		this.stock = stock;
		this.isVendable = isVendable;
		this.photos = photos;
		this.videos = videos;
		this.commentaires = commentaires;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Integer getRemise() {
		return remise;
	}

	public void setRemise(Integer remise) {
		this.remise = remise;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Boolean getIsVendable() {
		return isVendable;
	}

	public void setIsVendable(Boolean isVendable) {
		this.isVendable = isVendable;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public String getVideos() {
		return videos;
	}

	public void setVideos(String videos) {
		this.videos = videos;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	
}
