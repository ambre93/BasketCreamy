package fr.basketcreamy.metier;

import fr.basketcreamy.entities.dto.UtilisateurDto;
import fr.basketcreamy.entities.pojo.Utilisateur;

public interface IUtilisateurMetier {
	UtilisateurDto addUtilisateur(UtilisateurDto utilisateurDto) throws Exception;
	Utilisateur seConnecter(String email, String password) throws Exception;
	Utilisateur seDeconnecter(Utilisateur utilisateur) throws Exception;
}
