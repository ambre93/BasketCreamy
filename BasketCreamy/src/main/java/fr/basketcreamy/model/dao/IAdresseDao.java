package fr.basketcreamy.model.dao;

import java.util.List;

import fr.basketcreamy.entities.pojo.Adresse;

public interface IAdresseDao {


	void addAdresse  (Adresse adresse) throws Exception;
	Adresse updateAdresse (Adresse adresse) throws Exception;
	void deleteAdresse (Adresse adresse) throws Exception;
	Adresse getAdressById (Integer id) throws Exception;
	Adresse getAdresByEmail (String Email) throws Exception;
	List<Adresse> getAllByUser(Integer userId) throws Exception;

	
}