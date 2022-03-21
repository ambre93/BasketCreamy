package fr.basketcreamy.entities;

public class Adresse {
	
	private Integer id;
	private String numero;
	private String rue;
	private String codePostal;
	private Integer utilisateur;
	
	public Adresse() {
		
	}

	public Adresse(String numero, String rue, String codePostal, Integer utilisateur) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.utilisateur = utilisateur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public Integer getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Integer utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	
	

}
