package fr.basketcreamy.model.dao;

import java.util.List;

import fr.basketcreamy.entities.pojo.Commande;
import fr.basketcreamy.entities.pojo.User;

public interface ICommandeDao {
	
	void addCommande(Commande commande) throws Exception;
	List<Commande> getAllCommandeByUserId(User user) throws Exception;
	

}
