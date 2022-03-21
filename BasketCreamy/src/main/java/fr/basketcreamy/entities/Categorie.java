package fr.basketcreamy.entities;

@Entity
public class Categorie {
	private Integer id;
	private String nom;
	private byte remise;
	private boolean isRemiseCumulable;
	private String photo;
	private Integer article;
	
	public Categorie() {
		
			}
	
	public Categorie(String nom, byte remise, boolean isRemiseCumulable, String photo, Integer article) {
		super();
		this.nom = nom;
		this.remise = remise;
		this.isRemiseCumulable = isRemiseCumulable;
		this.photo = photo;
		this.article = article;
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

	public Integer getArticle() {
		return article;
	}

	public void setArticle(Integer article) {
		this.article = article;
	}
	
	
	

}
