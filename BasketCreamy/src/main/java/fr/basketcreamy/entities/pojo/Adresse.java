package fr.basketcreamy.entities.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adresse")
public class Adresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String numero;
	private String rue;
	private String codePostal;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id", nullable = false, insertable = true)
	private Utilisateur utilisateur;
	
	public Adresse() {
		
	}

	public Adresse(String numero, String rue, String codePostal, Utilisateur utilisateur) {
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	
	
	

}
