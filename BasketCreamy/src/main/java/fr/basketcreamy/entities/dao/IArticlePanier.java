package fr.basketcreamy.entities.dao;

import fr.basketcreamy.entities.pojo.ArticlePanier;
import fr.basketcreamy.entities.pojo.Utilisateur;

public interface IArticlePanier {

	
	ArticlePanier getAPanierById (Integer id) throws Exception;
	ArticlePanier getAPanierByUtilisateur (Utilisateur utilisateur) throws Exception;
	ArticlePanier saveAPanier (ArticlePanier aPanier) throws Exception;
	ArticlePanier updateAPanier (ArticlePanier aPanier) throws Exception;
	ArticlePanier deleteAPanier (ArticlePanier aPanier) throws Exception;
	
}
