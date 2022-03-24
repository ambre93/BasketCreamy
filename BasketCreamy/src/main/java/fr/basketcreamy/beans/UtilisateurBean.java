package fr.basketcreamy.beans;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.basketcreamy.entities.dto.UtilisateurDto;

@ManagedBean(name = "utilisateurBean")
@SessionScoped
public class UtilisateurBean {

	private String id;

	@ManagedProperty(value = "CAMUS")
	private String nom;

	@ManagedProperty(value = "Albert")
	private String prenom;

	@ManagedProperty(value = "Mme")
	private String genre;

	@ManagedProperty(value = "camus@gmail.com")
	private String email;
	
	private String motDePasse;
	private String motDePasseConfirmation;
	
	@ManagedProperty(value = "25/03/1940")
	private String dateNaissance;
	
	@ManagedProperty(value = "Stagiaire")
	private String situation;

	private static String messageSuccess;
	private static String messageError;

	static {
		messageSuccess = "";
		messageError = "";
	}
	
	public UtilisateurBean() {
	}

	public List<String> getSituations() {
		return Arrays.asList("Aucun", "Sans emploi", "Stagiaire", "Etudiant", "Travailleur");
	}
	
	public String ajouter() {
		
		UtilisateurBean.messageSuccess = "";
		UtilisateurBean.messageError = "";
		
		if (!motDePasse.equals(motDePasseConfirmation)) {
			UtilisateurBean.messageError = "Les deux mots de passe ne correspondent pas !\nVeuillez réessayer";
			return "";
		}
		
		UtilisateurDto utilisateurDto = new UtilisateurDto();
		utilisateurDto.setNom(nom);
		utilisateurDto.setPrenom(prenom);
		utilisateurDto.setGenre(genre);
		utilisateurDto.setEmail(email);
		utilisateurDto.setPassword(motDePasse);
		utilisateurDto.setDateNaissance(dateNaissance);
		utilisateurDto.setSituation(situation);
		
		IUserMetier userMetier = new UserMetier();
		try {
			UtilisateurDto addedUtilisateurDto = userMetier.addUser(utilisateurDto);
			this.id = addedUtilisateurDto.getId();
			UtilisateurBean.messageSuccess = "Utilisateur crée avec succès.";
			
		} catch (Exception e) {
			System.out.println(e);
			UtilisateurBean.messageError = "Erreur lors de la création de l'utilisateur !\n " + e.getMessage();
		}
		return "";
	}

	public void initialiser() {
		
		this.id = "";
		this.nom = "";
		this.prenom = "";
		this.genre = "";
		this.email = "";
		this.motDePasse = "";
		this.motDePasseConfirmation = "";
		this.dateNaissance = "";
		this.situation = "";
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getMotDePasseConfirmation() {
		return motDePasseConfirmation;
	}

	public void setMotDePasseConfirmation(String motDePasseConfirmation) {
		this.motDePasseConfirmation = motDePasseConfirmation;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getMessageSuccess() {
		return UtilisateurBean.messageSuccess;
	}

	public void setMessageSuccess(String messageSuccess) {
		UtilisateurBean.messageSuccess = messageSuccess;
	}

	public String getMessageError() {
		return UtilisateurBean.messageError;
	}

	public void setMessageError(String messageError) {
		UtilisateurBean.messageError = messageError;
	}

}
