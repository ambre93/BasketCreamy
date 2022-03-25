package fr.basketcreamy.cryptage.main;

import java.util.Date;

import fr.basketcreamy.entities.pojo.Adresse;
import fr.basketcreamy.entities.pojo.User2;
import fr.basketcreamy.model.dao.AdresseDao;
import fr.basketcreamy.model.dao.UserDao;

public class Main {

	public static void main(String[] args) {

		UserDao userDao = new UserDao();
		//AdresseDao adresseDao = new AdresseDao();
		
		User2 user = new User2();
		user.setNom("titi");
		user.setPrenom("toto");
		user.setDateNaissance(new Date("01/01/1958"));
		user.setEmail("tit@gmail.com");
		//user.setPassword(null)
		user.setTelephone("0105020301");
		
		//Adresse adresse = new Adresse();
		//adresse.setNumero("46");
		//adresse.setRue("Champion");
		//adresse.setVille("Neuilly");
		//adresse.setCodePostal("75000");
		//adresse.setUser(user);

		try {
			userDao.addUtilisateur(user);
			//adresseDao.addAdresse(adresse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
		
		
		
	}

}
