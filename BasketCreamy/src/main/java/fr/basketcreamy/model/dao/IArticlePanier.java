package fr.basketcreamy.model.dao;

import fr.basketcreamy.entities.pojo.ArticlePanier;
import fr.basketcreamy.entities.pojo.User;

public interface IArticlePanier {

	
	ArticlePanier getAPanierById (Integer id) throws Exception;
	ArticlePanier getAPanierByUtilisateur (User user) throws Exception;
	ArticlePanier saveAPanier (ArticlePanier aPanier) throws Exception;
	ArticlePanier updateAPanier (ArticlePanier aPanier) throws Exception;
	ArticlePanier deleteAPanier (ArticlePanier aPanier) throws Exception;
	
}
