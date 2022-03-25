package fr.basketcreamy.model.dao;

import java.util.List;

import fr.basketcreamy.entities.pojo.CartePaiement;
import fr.basketcreamy.entities.pojo.User;

public interface ICartePaiementDao {
	
	void addCartePaiement(CartePaiement cartePaiement) throws Exception;
	void updateCartePaiement(CartePaiement CartePaiement) throws Exception;
	void removeCartePaiement(CartePaiement cartePaiement) throws Exception;
	List<CartePaiement> getAllCartePaiementByUser( User user) throws Exception;
	

}
