package fr.basketcreamy.model.dao;

import java.util.List;

import fr.basketcreamy.entities.pojo.ArticlePanier;
import fr.basketcreamy.entities.pojo.User;

public interface IArticlePanierDao {

	ArticlePanier updateQuantitéAPanier(ArticlePanier aPanier) throws Exception;

	void deleteAPanier(ArticlePanier aPanier) throws Exception;

	ArticlePanier getAPanierById(Integer id) throws Exception;

	List<ArticlePanier> getAPanierByUtilisateur(Integer userId) throws Exception;

	ArticlePanier getAPanierByUtilisateur(User user) throws Exception;

	
	
}
