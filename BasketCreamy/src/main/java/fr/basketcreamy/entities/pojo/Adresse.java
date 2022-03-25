package fr.basketcreamy.entities.pojo;

import javax.persistence.Column;
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
	
	@Column(name = "numero", nullable = false)
	private String numero;
	@Column(name = "rue", nullable = false)
	private String rue;
	@Column(name = "code_postal", nullable = false)
	private String codePostal;
	@Column(name = "ville", nullable = false)
	private String ville;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id", nullable = false, insertable = true)
	private User2 user;
	
	public Adresse() {
		
	}

	public Adresse(Integer id, String numero, String rue, String codePostal, User2 user) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.user = user;
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

	public void setUtilisateur(User2 user) {
		this.user = user;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public User2 getUser() {
		return user;
	}

	public void setUser(User2 user2) {
		this.user = user2;
	}
}
