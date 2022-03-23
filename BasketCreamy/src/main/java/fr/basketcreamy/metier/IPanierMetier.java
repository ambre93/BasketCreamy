package fr.basketcreamy.metier;

import fr.basketcreamy.entities.pojo.Article;
import fr.basketcreamy.entities.pojo.ArticlePanier;

public interface IPanierMetier {
	ArticlePanier addArticlePanier(Article article) throws Exception;
	ArticlePanier removeArticlePanier(Article article) throws Exception;
}
