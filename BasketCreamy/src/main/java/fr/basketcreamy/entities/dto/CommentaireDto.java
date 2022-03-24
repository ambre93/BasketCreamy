package fr.basketcreamy.entities.dto;


public class CommentaireDto {
	
	private Integer id;
	
	private String texte;
	private String note;
	
	public CommentaireDto() {
		
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}
