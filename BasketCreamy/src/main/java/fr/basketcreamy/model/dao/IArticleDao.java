package fr.basketcreamy.model.dao;

import fr.basketcreamy.entities.pojo.Article;

public interface IArticleDao {

	Article addArticle(Article article) throws Exception;

	Article updateArticle(Article article) throws Exception;

	void deleteArticle(Article article) throws Exception;

	Article getArticleById(Integer id) throws Exception;
	
	
}
