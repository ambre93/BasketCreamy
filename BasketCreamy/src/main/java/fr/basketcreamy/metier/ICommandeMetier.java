package fr.basketcreamy.metier;

import java.util.List;

import fr.basketcreamy.entities.pojo.Commande;
import fr.basketcreamy.entities.pojo.User;

public interface ICommandeMetier {
	Commande validationCommande(Commande commande) throws Exception;
	Commande addCommande(Commande commande) throws Exception;
	List<Commande> getCommandeByUser(User user);
}
