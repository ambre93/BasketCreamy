package fr.basketcreamy.metier;

import java.util.List;

import fr.basketcreamy.entities.Commande;
import fr.basketcreamy.entities.Utilisateur;

public interface ICommandeMetier {
	Commande validationCommande(Commande commande) throws Exception;
	Commande addCommande(Commande commande) throws Exception;
	List<Commande> getCommandeByUser(Utilisateur utilisateur);
}
