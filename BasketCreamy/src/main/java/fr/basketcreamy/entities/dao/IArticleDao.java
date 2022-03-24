package fr.basketcreamy.entities.dao;

public interface IArticleDao {

	IArticleDao getArticleById (Integer id) throws Exception;
	IArticleDao getArticleInStock(Integer stock) throws Exception;
	IArticleDao getArticleInSolde(Integer solde) throws Exception;
	IArticleDao addArticle(IArticleDao article) throws Exception;
	IArticleDao saveArticle (IArticleDao article) throws Exception;
	IArticleDao updateArticle (IArticleDao article) throws Exception;
	IArticleDao deleteArticle (IArticleDao article) throws Exception;
	
	
}
