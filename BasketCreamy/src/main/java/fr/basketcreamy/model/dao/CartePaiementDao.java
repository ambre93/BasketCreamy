package fr.basketcreamy.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import fr.basketcreamy.entities.pojo.CartePaiement;
import fr.basketcreamy.entities.pojo.User;

public class CartePaiementDao implements ICartePaiementDao{
	
	@PersistenceContext(unitName = "MySqlPersistence")
	private EntityManager em;

	@Override
	public void addCartePaiement(CartePaiement cartePaiement) throws Exception {
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(cartePaiement);
		tx.commit();
	}

	@Override
	public void updateCartePaiement(CartePaiement CartePaiement) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCartePaiement(CartePaiement cartePaiement) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CartePaiement> getAllCartePaiementByUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
