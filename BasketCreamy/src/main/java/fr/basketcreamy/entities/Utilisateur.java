package fr.basketcreamy.entities;

public class Utilisateur {
	private Integer id;
	private String nom;
	private String Prenom;
	private Date dateNaissance;
	private boolean isActif;
	private String profil;
	private String email;
	private byte[] password;
	private String telephone;
	private List<Adresse> adresses;
	private List<Commande> commandes;
	private List<CartePaiement> cartesDePaiement;
	private List<Commentaire> commentaires;
	private List<ArticlePanier> panier;
	
	
}
