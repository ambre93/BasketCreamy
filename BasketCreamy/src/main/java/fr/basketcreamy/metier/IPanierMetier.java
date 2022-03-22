package fr.basketcreamy.metier;

import fr.basketcreamy.entities.Article;
import fr.basketcreamy.entities.ArticlePanier;

public interface IPanierMetier {
	ArticlePanier addArticlePanier(Article article) throws Exception;
	ArticlePanier removeArticlePanier(Article article) throws Exception;
}
