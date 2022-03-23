package fr.basketcreamy.profils.dao;
import fr.basketcreamy.entities.Utilisateur;
import fr.basketcreamy.enums.EnumProfil;

public interface IUtilisateursDao {

	
	Utilisateur addUser(Utilisateur user) throws Exception;
	Utilisateur getUserByEmail(String email) throws Exception;
	Utilisateur getUserByProfil(EnumProfil profil) throws Exception;

}


