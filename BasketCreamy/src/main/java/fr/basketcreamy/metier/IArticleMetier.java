package fr.basketcreamy.metier;

import fr.basketcreamy.entities.pojo.Article;

public interface IArticleMetier {
	Article addArticle(Article article) throws Exception;
	Article removeArticle(Article article) throws Exception;
	Article updateStockArticle(Article article) throws Exception;
	
}
