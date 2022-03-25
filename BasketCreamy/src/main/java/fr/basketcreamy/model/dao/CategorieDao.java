package fr.basketcreamy.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import fr.basketcreamy.entities.pojo.Article;
import fr.basketcreamy.entities.pojo.Categorie;

public class CategorieDao implements ICategorieDao {
	
	@PersistenceContext(unitName = "MySqlPersistence")
	private EntityManager em;

	@Override
	public void addCategorie(Categorie categorie) throws Exception {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(categorie);
		tx.commit();
		
	}

	@Override
	public void updateCategorie(Categorie categorie) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategorie(Categorie categorie) throws Exception {
		
		
		em.remove(categorie);
		
		
	}

	@Override
	public List<Categorie> getAllCategorie() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getCategorieByArticle(Article article) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
