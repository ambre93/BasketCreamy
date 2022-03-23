package fr.basketcreamy.entities.dto;

public class CategorieDto {
	
	private String id;
	private String nom;
	private String remise;
	private boolean isRemise;
		
	public CategorieDto() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRemise() {
		return remise;
	}

	public void setRemise(String remise) {
		this.remise = remise;
	}

	public boolean isRemise() {
		return isRemise;
	}

	public void setRemise(boolean isRemise) {
		this.isRemise = isRemise;
	}

}
