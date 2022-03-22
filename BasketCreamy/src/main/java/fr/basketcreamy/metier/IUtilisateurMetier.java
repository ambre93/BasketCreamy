package fr.basketcreamy.metier;

import fr.basketcreamy.entities.Utilisateur;

public interface IUtilisateurMetier {
	Utilisateur addUtilisateur(Utilisateur utilisateur) throws Exception;
	Utilisateur seConnecter(String email, String password) throws Exception;
	Utilisateur seDeconnecter(Utilisateur utilisateur) throws Exception;
}
