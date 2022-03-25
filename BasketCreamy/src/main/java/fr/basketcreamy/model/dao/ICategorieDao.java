package fr.basketcreamy.model.dao;

import java.util.List;

import fr.basketcreamy.entities.pojo.Article;
import fr.basketcreamy.entities.pojo.Categorie;

public interface ICategorieDao {
	
	void addCategorie(Categorie categorie) throws Exception;
	void updateCategorie(Categorie categorie) throws Exception;
	void removeCategorie(Categorie categorie) throws Exception;
	List<Categorie> getAllCategorie() throws Exception;
	Categorie getCategorieByArticle(Article article) throws Exception;

}
