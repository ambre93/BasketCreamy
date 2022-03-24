package fr.basketcreamy.entities.dao;

import fr.basketcreamy.entities.pojo.Utilisateur;

public class UtilisateurDao implements IUtilisateurDao {

	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) throws Exception {
		utilisateur.setId(5);
		return utilisateur;
	}
}
