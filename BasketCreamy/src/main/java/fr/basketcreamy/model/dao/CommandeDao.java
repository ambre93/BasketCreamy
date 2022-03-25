package fr.basketcreamy.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import fr.basketcreamy.entities.pojo.Commande;
import fr.basketcreamy.entities.pojo.User;

public class CommandeDao implements ICommandeDao {
	
	@PersistenceContext(unitName = "MySqlPersistence")
	private EntityManager em;

	@Override
	public void addCommande(Commande commande) throws Exception {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(commande);
		tx.commit();
		
	}

	@Override
	public List<Commande> getAllCommandeByUserId(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
